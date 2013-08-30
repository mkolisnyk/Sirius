/**
 * 
 */
package org.sirius.server.win32lib.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class Tab {

    public Tab()
    {
        ;
    }

    public native int GetItemsCount(int hwnd);
    public native int GetSelectedIndex(int hwnd); 
    public native String GetSelectedItem(int hwnd);
    public native String[] GetItemNames(int hwnd);
    public native void Select(int hwnd,int index); 
    public native void Select(int hwnd,String item); 
}
