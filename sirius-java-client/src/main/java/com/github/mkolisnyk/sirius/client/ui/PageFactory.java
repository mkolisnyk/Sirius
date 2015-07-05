package com.github.mkolisnyk.sirius.client.ui;

import com.github.mkolisnyk.sirius.client.SiriusClient;
import com.github.mkolisnyk.sirius.client.annotations.Screen;

public class PageFactory {
    public static Page create(SiriusClient client, Class<? extends Page> clazz) throws Exception {
        Page page = clazz.getConstructor(SiriusClient.class).newInstance(client);
        Screen screen = clazz.getAnnotation(Screen.class);
        if (screen != null) {
            page.setScreenName(screen.value());
        }
        return page;
    }
}
