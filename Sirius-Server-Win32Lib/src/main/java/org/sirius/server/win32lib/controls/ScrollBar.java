/**
 * 
 */
package org.sirius.server.win32lib.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class ScrollBar {
    
    public ScrollBar()
    {
        ;
    }

    public native double GetLowerBound(int hwnd);
    public native double GetUpperBound(int hwnd);
    public native double GetPosition(int hwnd);
    public native void SetPosition(int hwnd, double pos);
}
