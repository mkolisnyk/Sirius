package com.github.mkolisnyk.sirius.client.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.github.mkolisnyk.sirius.client.Platform;
import com.github.mkolisnyk.sirius.client.ui.Page;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface FindBy {
	String locator();
	Platform platform() default Platform.REMOTE;
	String scrollTo() default "";
	Class<? extends Page> onClick() default Page.class;
	Class<? extends Page> onSetText() default Page.class;
}
