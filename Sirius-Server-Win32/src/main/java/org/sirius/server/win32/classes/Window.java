/**
 * 
 */
package org.sirius.server.win32.classes;

import javax.jws.WebService;

import org.sirius.server.win32.constants.IMKConsts;
import org.sirius.server.win32.constants.IWMConsts;
import org.sirius.server.win32.core.types.WinDefExt.WINDOWPLACEMENT;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HMENU;
import com.sun.jna.platform.win32.WinDef.RECT;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 *
 */
@WebService
public class Window extends Common implements IWMConsts, IMKConsts {

	/**
	 * 
	 */
	public Window() {
		// TODO Auto-generated constructor stub
	}

	public void activate(long hwnd){
		HWND handle = longToHwnd(hwnd);
		user32.SetForegroundWindow(handle);
	}
	
	public void mouseDown(long hwnd,int button,int x,int y, boolean isControl,boolean isAlt, boolean isShift){
		int message = 0;
		int flags = 0;
		switch(button){
			case 0:
				message = WM_LBUTTONDOWN;
				break;
			case 1:
				message = WM_RBUTTONDOWN;
				break;
			case 2:
				message = WM_MBUTTONDOWN;
				break;
			default:
				message = WM_LBUTTONDOWN;
				break;
		}
		
		if(isControl){
			flags |= MK_CONTROL;
		}
		if(isShift){
			flags |= MK_SHIFT;
		}
		SendMessage(hwnd, message,flags, MAKELPARAM(x, y).intValue());
	}
	
	public void mouseUp(long hwnd,int button,int x,int y, boolean isControl,boolean isAlt, boolean isShift){
		int message = 0;
		int flags = 0;
		switch(button){
			case 0:
				message = WM_LBUTTONUP;
				break;
			case 1:
				message = WM_RBUTTONUP;
				break;
			case 2:
				message = WM_MBUTTONUP;
				break;
			default:
				message = WM_LBUTTONUP;
				break;
		}
		
		if(isControl){
			flags |= MK_CONTROL;
		}
		if(isShift){
			flags |= MK_SHIFT;
		}
		SendMessage(hwnd, message,flags, MAKELPARAM(x, y).intValue());
	}
	
	public void click(long hwnd,int button,int x,int y, boolean isControl,boolean isAlt, boolean isShift){
		mouseDown(hwnd, button, x, y, isControl, isAlt, isShift);
		mouseUp(hwnd, button, x, y, isControl, isAlt, isShift);
	}
	
	public void doubleClick(long hwnd,int button,int x,int y, boolean isControl,boolean isAlt, boolean isShift){
		int message = 0;
		int flags = 0;
		switch(button){
			case 0:
				message = WM_LBUTTONDBLCLK;
				break;
			case 1:
				message = WM_RBUTTONDBLCLK;
				break;
			case 2:
				message = WM_MBUTTONDBLCLK;
				break;
			default:
				message = WM_LBUTTONDBLCLK;
				break;
		}
		
		if(isControl){
			flags |= MK_CONTROL;
		}
		if(isShift){
			flags |= MK_SHIFT;
		}
		SendMessage(hwnd, message,flags, MAKELPARAM(x, y).intValue());
	}
	
	public void keyDown(long hwnd,int key){
		SendMessage(hwnd,WM_KEYDOWN,key,0);
	}
	
	public void keyUp(long hwnd,int key){
		SendMessage(hwnd,WM_KEYUP,key,0);
	}
	
	public void keyPress(long hwnd,int key){
		SendMessage(hwnd,WM_CHAR,key,0);
	}
	
	public void close(long hwnd){
		HWND handle = longToHwnd(hwnd);
		WPARAM wParam = new WPARAM();
		LPARAM lParam = new LPARAM();
		
		wParam.setValue(0);
		lParam.setValue(0);
		user32.PostMessage(handle, WM_CLOSE, wParam,lParam);
	}
	
	public RECT getClientRect(long hwnd){
		RECT result = new RECT();
		HWND handle = longToHwnd(hwnd);
		user32.GetClientRect(handle, result);
		return result;
	}
	
	public long getMenu(long hwnd){
		HWND handle = longToHwnd(hwnd);
		HMENU hmenu = user32.GetMenu(handle);
		return Pointer.nativeValue(hmenu.getPointer());
	}
	
	public RECT getRect(long hwnd){
		RECT result = new RECT();
		HWND handle = longToHwnd(hwnd);
		user32.GetWindowRect(handle, result);
		return result;
	}
	
	public long getSystemMenu(long hwnd,boolean revert){
		HWND handle = longToHwnd(hwnd);
		HMENU hmenu = user32.GetSystemMenu(handle,revert);
		return Pointer.nativeValue(hmenu.getPointer());
	}
	
	public String getText(long hwnd){
		HWND handle = longToHwnd(hwnd);
		int length = user32.GetWindowTextLength(handle) + 1;
        char buf[] = new char[length];
        
        user32.GetWindowText(handle, buf, length );
    	String text = String.valueOf( buf ).trim();
    	return text;
	}
	
	public boolean getWindowPlacement(long hwnd,WINDOWPLACEMENT placement){
		HWND handle = longToHwnd(hwnd);
		return user32.GetWindowPlacement(handle, placement);
	}

	public boolean isEnabled(long hwnd){
		HWND handle = longToHwnd(hwnd);
		return user32.IsWindowEnabled(handle);
	}
	
	public boolean isMaximized(long hwnd){
		HWND handle = longToHwnd(hwnd);
		WINDOWPLACEMENT placement = new WINDOWPLACEMENT();
		user32.GetWindowPlacement(handle, placement);
		return placement.showCmd == SW_MAXIMIZE;
	}
	
	public boolean isMinimized(long hwnd){
		HWND handle = longToHwnd(hwnd);
		WINDOWPLACEMENT placement = new WINDOWPLACEMENT();
		user32.GetWindowPlacement(handle, placement);
		return placement.showCmd == SW_SHOWMINIMIZED;
	}
	
	public boolean isNormal(long hwnd){
		HWND handle = longToHwnd(hwnd);
		WINDOWPLACEMENT placement = new WINDOWPLACEMENT();
		user32.GetWindowPlacement(handle, placement);
		return placement.showCmd == SW_NORMAL;
	}
	
	public boolean isUnicode(long hwnd){
		HWND handle = longToHwnd(hwnd);
		return user32.IsWindowUnicode(handle);
	}

	public boolean isVisible(long hwnd){
		HWND handle = longToHwnd(hwnd);
		return user32.IsWindowVisible(handle);
	}
	
	public boolean isWindow(long hwnd){
		HWND handle = longToHwnd(hwnd);
		return user32.IsWindow(handle);
	}
	
	public void maximize(long hwnd){
		HWND handle = longToHwnd(hwnd);
		user32.ShowWindow(handle, SW_MAXIMIZE);
	}
	
	public void minimize(long hwnd){
		HWND handle = longToHwnd(hwnd);
		user32.ShowWindow(handle, SW_MINIMIZE);
	}
	
	public void move(long hwnd,int x,int y,int width,int height){
		moveTo(hwnd,x,y);
		sizeTo(hwnd,width,height);
	}
	
	public void moveTo(long hwnd,int x,int y){
		HWND handle = longToHwnd(hwnd);
		RECT rc = getRect(hwnd); 
		user32.MoveWindow(handle, x, y, rc.right-rc.left, rc.bottom-rc.top, true);
	}
	
	public void restore(long hwnd){
		HWND handle = longToHwnd(hwnd);
		user32.ShowWindow(handle, SW_SHOWNORMAL);
	}
	
	public void sizeTo(long hwnd,int width,int height){
		HWND handle = longToHwnd(hwnd);
		RECT rc = getRect(hwnd); 
		user32.MoveWindow(handle, rc.left, rc.top, width, height, true);
	}
	
	public void start(long hwnd, String command, String params, String workingDir){
		HWND handle = longToHwnd(hwnd);
		shell32.ShellExecute(handle, null, command, params, workingDir, SW_SHOW);
	}
}
