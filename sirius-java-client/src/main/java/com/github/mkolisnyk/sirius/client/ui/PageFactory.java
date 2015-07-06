package com.github.mkolisnyk.sirius.client.ui;

import java.lang.reflect.Field;

import com.github.mkolisnyk.sirius.client.Platform;
import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.annotations.Alias;
import com.github.mkolisnyk.sirius.client.annotations.FindBy;
import com.github.mkolisnyk.sirius.client.annotations.Screen;

public final class PageFactory {
    private PageFactory() {
    }
    public static Page create(SiriusClient client, Class<?> clazz) throws Exception {
        Page page = (Page) clazz.getConstructor(SiriusClient.class).newInstance(client);
        Screen screen = clazz.getAnnotation(Screen.class);
        if (screen != null) {
            page.setScreenName(screen.value());
            page.setUrl(screen.url());
        }
        for (Field field : clazz.getFields()) {
            if (Control.class.isAssignableFrom(field.getType())) {
                Alias alias = field.getAnnotation(Alias.class);
                FindBy[] annotations = field.getAnnotationsByType(FindBy.class);
                for (FindBy annotation : annotations) {
                    if (annotation.platform().equals(Platform.NONE)
                            || annotation.platform().equals(client.getPlatform())) {
                        field.set(
                                page,
                                field.getType()
                                    .getConstructor(Page.class, String.class)
                                    .newInstance(page, annotation.locator()
                                )
                        );
                        field.getType().getMethod("setOnClickPage", Class.class)
                            .invoke(clazz.getField(field.getName()).get(page), annotation.onClick());
                    }
                }
                if (alias != null) {
                    field.getType().getMethod("setName", String.class)
                        .invoke(clazz.getField(field.getName()).get(page), alias.value());
                }
            }
        }
        return page;
    }
}
