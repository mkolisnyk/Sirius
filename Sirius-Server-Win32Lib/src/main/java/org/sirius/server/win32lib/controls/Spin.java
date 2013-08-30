/**
 * 
 */
package org.sirius.server.win32lib.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class Spin {
    public Spin()
    {
        ;
    }

    public native double GetLowerBound(int hwnd);
    public native double GetUpperBound(int hwnd);
    public native double GetPosition(int hwnd);
    public native void SetPosition(int hwnd, double pos);
    public native String GetText(int hwnd);
    public native void SetText(int hwnd, String text);
}
