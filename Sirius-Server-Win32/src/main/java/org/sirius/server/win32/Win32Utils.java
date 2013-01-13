/**
 * 
 */
package org.sirius.server.win32;

import javax.jws.WebService;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Win32Utils {

	/**
	 * 
	 */
	public Win32Utils() {
	}

    public class WNDENUMPROC implements WinUser.WNDENUMPROC {
    	
    	private int currIndex;
    	private Win32Locator locator;
    	
    	public WNDENUMPROC(Win32Locator locator){
    		this.locator = locator;
    		currIndex = 0;
    	}
    	
        /**
		 * @return the locator
		 */
		public final Win32Locator getLocator() {
			return locator;
		}

        @Override
		public boolean callback(HWND arg0, Pointer arg1) {
        	User32 user32 = User32.INSTANCE;
            int length = user32.GetWindowTextLength(arg0) + 1;
            char buf[] = new char[length];
            
            user32.GetWindowText(arg0, buf, length );
        	String text = String.valueOf( buf ).trim();
        	
        	if( !text.matches( locator.getCaption() ) ){
        		return true;
        	}
        	
        	buf = null;
        	buf = new char[128];
        	
        	user32.GetClassName(arg0, buf, 128);
        	String clazz = String.valueOf( buf ).trim();

        	
        	if( !clazz.matches( locator.getWinClass() ) ){
        		return true;
        	}
        	
        	if( currIndex < locator.getIndex() ){
            	currIndex++;
            }
        	else {
        		locator.setHwnd( arg0 );
        	}
            
            if( locator.getHwnd() == null ) return true;
            
            buf = null;
            locator.setCaption(text);
            locator.setWinClass(clazz);
            
            return false;
		}
    }
	
	public HWND searchWindow(Win32Locator locator){
		User32 user32 = User32.INSTANCE;
		
		WNDENUMPROC enumProc = new WNDENUMPROC(locator);
		Pointer pt = Pointer.NULL;
        
		user32.EnumWindows(enumProc, pt);
		return enumProc.getLocator().getHwnd();
	}
	
	/*public static void main(String[] args){
		Win32Locator locator = new Win32Locator();
		locator.setWinClass("Notepad");
		Win32Utils utils = new Win32Utils();
		HWND hwnd = utils.searchWindow(locator);
		System.out.println("" + hwnd );
	}*/
}
