package com.github.mkolisnyk.sirius.client.ui.controls;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import com.github.mkolisnyk.sirius.client.ui.Control;
import com.github.mkolisnyk.sirius.client.ui.Page;

public class Button extends Control {

    private final Map<String, String> textAttributesMap = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("input", "value");
            put("android", "text");
        }
    };

    public Button(Page parentValue, String locatorValue) {
        super(parentValue, locatorValue);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getText() {
        String tagName = this.getElement().getTagName();
        for (Entry<String, String> entry : textAttributesMap.entrySet()) {
            if (tagName.contains(entry.getKey())
                    || tagName.toUpperCase().contains(entry.getKey().toUpperCase())) {
                return this.getAttribute(entry.getValue());
            }
        }
        return super.getText();
    }
}
