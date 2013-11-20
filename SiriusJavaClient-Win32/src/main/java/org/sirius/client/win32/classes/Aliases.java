/**
 * 
 */
package org.sirius.client.win32.classes;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.sirius.client.win32.annotations.Alias;

/**
 * <p>
 * Represents global storage for Win32 object aliases defined
 * based on {@link Alias} annotation.
 * </p>
 * <p>
 * The object provides 2 major functions:
 * <ul>
 * <li> Insert alias data into internal storage
 * <li> Retrieve actual control
 * </ul>
 * <b>Example:</b>
 * <pre>
 * Win32Client client = new Win32Client();
 * Test1LevelWindow win = new Test1LevelWindow(client);
 * <b>((Edit)Aliases.get("Sample Text"))</b>.setText("Hello");
 * </pre>
 * </p> 
 * @author Myk Kolisnyk
 * @see {@link Alias}
 */
public class Aliases {

    /**
     * Internal static object which is the actual instance of the class.
     */
    private static Aliases instance = null;
    
    /**
     * Internal HashMap containing data for aliases and associated window objects.
     */
    private HashMap<String,Window> aliases;
    
    /**
     * @return the aliases
     */
    public HashMap<String, Window> getAliases() {
        return aliases;
    }

    /**
     * Private constructor which performs just basic initialization for the object.
     * This constructor is set private so there's no ability to make several instances
     * of this type.
     */
    private Aliases(){
        aliases = new HashMap<String,Window>();
    }
    
    /**
     * Checks whether current object is initialized and performs internal instance
     * initialization in case it's not done yet.
     */
    private static void init(){
        if(instance == null){
            instance = new Aliases();
        }
    }
    
    /**
     * Returns window object by specified alias name.
     * @param entry the alias name of the control to retrieve.
     * @return actual window object corresponding to the alias or null.
     */
    public static Window get(String entry){
        init();
        return instance.getAliases().get(entry);
    }
    
    /**
     * Fills in the internal table with the aliases defined in the window
     * passed as the parameter.
     * @param win window to get aliases from.
     */
    public static void set(Window win){
        init();
        Class<? extends Window> clazz = win.getClass();
        Field[] fields = clazz.getFields();
        try {
            for (Field field : fields) {
                Alias annotation = field.getAnnotation(Alias.class);
                if(annotation != null) {
                    Window control = (Window) field.get(win);
                    instance.aliases.put(annotation.name(), control);
                    set(control);
                }                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
