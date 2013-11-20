/**
 * .
 */
package org.sirius.client.win32.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.Assert;
import org.sirius.client.tests.win32.AliasAnnotationTest.Test1LevelWindow;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.Aliases;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.Edit;
import org.sirius.client.win32.types.Win32Locator;

/**
 * <p>
 * This annotation is used to assign global name to some specific control.
 * The global name will be accessible at any place of code.
 * </p>
 * <p>
 * <b>Initialization example:</b>
 * <pre>
 *     public class Test1LevelWindow extends MainWindow {
 *     
 *         <b>&#64;Alias(name="Sample Text")</b>
 *         &#64;Locator(winClass="Edit",caption="Sample text",index=0)
 *         public Edit edtText;
 *         
 *         <b>&#64;Alias(name="Sample Button")</b>
 *         &#64;Locator(winClass="Button",caption="Test Button",index=2)
 *         public Button btnTestButton;
 *         
 *         public Test1LevelWindow(Win32Client client) {
 *             super(client, new Win32Locator("Test",0));
 *         }
 *     }
 * </pre>
 * After that the annotated controls are accessed from {@link Aliases} object
 * by given alias name.
 * </p>
 * <p>
 * <b>Usage example:</b>
 * <pre>
 * Win32Client client = new Win32Client();
 * Test1LevelWindow win = new Test1LevelWindow(client);
 * <b>((Edit)Aliases.get("Sample Text"))</b>.setText("Hello");
 * </pre>
 * </p>
 * <p>
 * <b>NOTE:</b> global aliases storage is initialized together with locators initialization. 
 * So, it's recommended using aliases together with {@link Locator} annotations.
 * Also, the external storage requires unique names for the aliases. Otherwise they will be overwritten.
 * </p>
 * @see {@link Aliases}
 * @see {@link Locator}
 * @author Myk Kolisnyk
 */
@Target(ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Alias {
    /**
     * The actual text which should be treated as global name.
     */
    String name();
}
