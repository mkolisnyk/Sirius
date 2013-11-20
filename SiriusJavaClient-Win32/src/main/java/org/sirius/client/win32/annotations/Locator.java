/**
 * 
 */
package org.sirius.client.win32.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.sirius.client.tests.win32.LocatorAnnotationTest.Test1LevelWindow;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.Edit;
import org.sirius.client.win32.types.Win32Locator;

/**
 * <p>
 * The annotation is designed to assign window locators to the fields.
 * When the containing class is initialized these fields are initialized automatically
 * with the locator specified by the annotation.
 * </p>
 * <p>
 * <b>Example:</b>
 * <pre>
 *    public class Test1LevelWindow extends MainWindow {
 *    
 *      &#64;Locator(winClass="Edit",caption="Sample text",index=0)
 *      public Edit edtText;
 *      
 *      &#64;Locator(winClass="Button",caption="Test Button",index=2)
 *      public Button btnTestButton;
 *      
 *      public Test1LevelWindow(Win32Client client) {
 *          super(client, new Win32Locator("Test",0));
 *      }
 *    }
 * </pre>
 * After that we may initialize just main window object like:
 * <pre>
 *      Win32Client client = new Win32Client();
 *      Test1LevelWindow win = new Test1LevelWindow(client);
 * </pre>
 * and then the <b>edtText</b> and <b>btnTestButton</b> fields will be initialized.
 * </p>
 * <p>
 * <b>NOTE:</b> the initialization is limited to object instances creation and locator value assignments. 
 * So, these objects wouldn't contain any HWND information. It's done this way because actual window objects
 * may be unavailable at the time of the initialization. So, these elements would be filled with actual HWNDs
 * as soon as we start using them first.
 * </p>
 * @author Myk Kolisnyk
 */
@Target(ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Locator {
    String winClass() default "(.*)";
    String caption() default "(.*)";
    int index() default 0;
}
