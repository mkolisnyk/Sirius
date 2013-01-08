/**
 * 
 */
package org.sirius.server.win32.core;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlType;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.BaseTSD.LONG_PTR;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinBase.PROCESS_INFORMATION;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HDC;
import com.sun.jna.platform.win32.WinDef.HICON;
import com.sun.jna.platform.win32.WinDef.HINSTANCE;
import com.sun.jna.platform.win32.WinDef.HRGN;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.RECT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinUser.BLENDFUNCTION;
import com.sun.jna.platform.win32.WinUser.FLASHWINFO;
import com.sun.jna.platform.win32.WinUser.GUITHREADINFO;
import com.sun.jna.platform.win32.WinUser.HHOOK;
import com.sun.jna.platform.win32.WinUser.INPUT;
import com.sun.jna.platform.win32.WinUser.LASTINPUTINFO;
import com.sun.jna.platform.win32.WinUser.MSG;
import com.sun.jna.platform.win32.WinUser.POINT;
import com.sun.jna.platform.win32.WinUser.SIZE;
import com.sun.jna.platform.win32.WinUser.WINDOWINFO;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;


/**
 * @author KaNoN
 * 
 */
@WebService
public class User32Lib {

	protected User32 user32;

	@XmlType(namespace="com.sun.jna.platform.win32.WinBase.PROCESS_INFORMATION")
    public static class ProcessInfoByReference extends PROCESS_INFORMATION implements Structure.ByReference {
        public ProcessInfoByReference() {
        }

        public ProcessInfoByReference(Pointer memory) {
            super(memory);
        }
    }

	
	/**
	 * 
	 */
	public User32Lib() {
		user32 = User32.INSTANCE;
	}

	public boolean AttachThreadInput(DWORD arg0, DWORD arg1, boolean arg2) {

		return user32.AttachThreadInput(arg0, arg1, arg2);
	}

	public LRESULT CallNextHookEx(HHOOK arg0, int arg1, WPARAM arg2, LPARAM arg3) {

		return user32.CallNextHookEx(arg0, arg1, arg2, arg3);
	}

	public LRESULT CallNextHookEx2(HHOOK arg0, int arg1, WPARAM arg2,
			Pointer arg3) {

		return user32.CallNextHookEx(arg0, arg1, arg2, arg3);
	}

	public boolean CloseWindow(HWND arg0) {

		return user32.CloseWindow(arg0);
	}

	public boolean DestroyIcon(HICON arg0) {

		return user32.DestroyIcon(arg0);
	}

	public LRESULT DispatchMessage(MSG arg0) {

		return user32.DispatchMessage(arg0);
	}
	/*
	public boolean EnumChildWindows(HWND arg0, WNDENUMPROC arg1, Pointer arg2) {

		return user32.EnumChildWindows(arg0, arg1, arg2);
	}

	public boolean EnumThreadWindows(int arg0, WNDENUMPROC arg1, Pointer arg2) {

		return user32.EnumThreadWindows(arg0, arg1, arg2);
	}

	public boolean EnumWindows(WNDENUMPROC arg0, Pointer arg1) {

		return user32.EnumWindows(arg0, arg1);
	}*/

	public HWND FindWindow(String arg0, String arg1) {

		return user32.FindWindow(arg0, arg1);
	}

	public boolean FlashWindowEx(FLASHWINFO arg0) {

		return user32.FlashWindowEx(arg0);
	}

	public short GetAsyncKeyState(int arg0) {

		return user32.GetAsyncKeyState(arg0);
	}

	public int GetClassName(HWND arg0, char[] arg1, int arg2) {

		return user32.GetClassName(arg0, arg1, arg2);
	}

	public HDC GetDC(HWND arg0) {

		return user32.GetDC(arg0);
	}

	public HWND GetForegroundWindow() {

		return user32.GetForegroundWindow();
	}

	public boolean GetGUIThreadInfo(int arg0, GUITHREADINFO arg1) {

		return user32.GetGUIThreadInfo(arg0, arg1);
	}

	public boolean GetKeyboardState(byte[] arg0) {

		return user32.GetKeyboardState(arg0);
	}

	public boolean GetLastInputInfo(LASTINPUTINFO arg0) {

		return user32.GetLastInputInfo(arg0);
	}

	public boolean GetLayeredWindowAttributes(HWND arg0, IntByReference arg1,
			ByteByReference arg2, IntByReference arg3) {

		return user32.GetLayeredWindowAttributes(arg0, arg1, arg2, arg3);
	}

	public int GetMessage(MSG arg0, HWND arg1, int arg2, int arg3) {

		return user32.GetMessage(arg0, arg1, arg2, arg3);
	}

	public int GetSystemMetrics(int arg0) {

		return user32.GetSystemMetrics(arg0);
	}

	public HWND GetWindow(HWND arg0, DWORD arg1) {

		return user32.GetWindow(arg0, arg1);
	}

	public boolean GetWindowInfo(HWND arg0, WINDOWINFO arg1) {

		return user32.GetWindowInfo(arg0, arg1);
	}

	public int GetWindowLong(HWND arg0, int arg1) {

		return user32.GetWindowLong(arg0, arg1);
	}

	public LONG_PTR GetWindowLongPtr(HWND arg0, int arg1) {

		return user32.GetWindowLongPtr(arg0, arg1);
	}

	public int GetWindowModuleFileName(HWND arg0, char[] arg1, int arg2) {

		return user32.GetWindowModuleFileName(arg0, arg1, arg2);
	}

	public boolean GetWindowRect(HWND arg0, RECT arg1) {

		return user32.GetWindowRect(arg0, arg1);
	}

	public int GetWindowText(HWND arg0, char[] arg1, int arg2) {

		return user32.GetWindowText(arg0, arg1, arg2);
	}

	public int GetWindowTextLength(HWND arg0) {

		return user32.GetWindowTextLength(arg0);
	}

	public int GetWindowThreadProcessId(HWND arg0, IntByReference arg1) {

		return user32.GetWindowThreadProcessId(arg0, arg1);
	}

	public boolean InvalidateRect(HWND arg0, ProcessInfoByReference arg1, boolean arg2) {

		return user32.InvalidateRect(arg0, arg1, arg2);
	}

	public boolean IsWindowVisible(HWND arg0) {

		return user32.IsWindowVisible(arg0);
	}

	public HICON LoadIcon(HINSTANCE arg0, String arg1) {

		return user32.LoadIcon(arg0, arg1);
	}

	public HANDLE LoadImage(HINSTANCE arg0, String arg1, int arg2, int arg3,
			int arg4, int arg5) {

		return user32.LoadImage(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean MoveWindow(HWND arg0, int arg1, int arg2, int arg3,
			int arg4, boolean arg5) {

		return user32.MoveWindow(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public boolean PeekMessage(MSG arg0, HWND arg1, int arg2, int arg3, int arg4) {

		return user32.PeekMessage(arg0, arg1, arg2, arg3, arg4);
	}

	public void PostMessage(HWND arg0, int arg1, WPARAM arg2, LPARAM arg3) {

		user32.PostMessage(arg0, arg1, arg2, arg3);
	}

	public void PostQuitMessage(int arg0) {

		user32.PostQuitMessage(arg0);
	}

	public boolean RedrawWindow(HWND arg0, ProcessInfoByReference arg1, HRGN arg2,
			DWORD arg3) {

		return user32.RedrawWindow(arg0, arg1, arg2, arg3);
	}

	public boolean RegisterHotKey(HWND arg0, int arg1, int arg2, int arg3) {

		return user32.RegisterHotKey(arg0, arg1, arg2, arg3);
	}

	public int ReleaseDC(HWND arg0, HDC arg1) {

		return user32.ReleaseDC(arg0, arg1);
	}

	public DWORD SendInput(DWORD arg0, INPUT[] arg1, int arg2) {

		return user32.SendInput(arg0, arg1, arg2);
	}

	public HWND SetFocus(HWND arg0) {

		return user32.SetFocus(arg0);
	}

	public boolean SetForegroundWindow(HWND arg0) {

		return user32.SetForegroundWindow(arg0);
	}

	public boolean SetLayeredWindowAttributes(HWND arg0, int arg1, byte arg2,
			int arg3) {

		return user32.SetLayeredWindowAttributes(arg0, arg1, arg2, arg3);
	}

	public HWND SetParent(HWND arg0, HWND arg1) {

		return user32.SetParent(arg0, arg1);
	}

	public int SetWindowLong(HWND arg0, int arg1, int arg2) {

		return user32.SetWindowLong(arg0, arg1, arg2);
	}

	public Pointer SetWindowLong2(HWND arg0, int arg1, Pointer arg2) {

		return user32.SetWindowLong(arg0, arg1, arg2);
	}

	public LONG_PTR SetWindowLongPtr(HWND arg0, int arg1, LONG_PTR arg2) {

		return user32.SetWindowLongPtr(arg0, arg1, arg2);
	}

	public Pointer SetWindowLongPtr2(HWND arg0, int arg1, Pointer arg2) {

		return user32.SetWindowLongPtr(arg0, arg1, arg2);
	}

	public boolean SetWindowPos(HWND arg0, HWND arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {

		return user32.SetWindowPos(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public int SetWindowRgn(HWND arg0, HRGN arg1, boolean arg2) {

		return user32.SetWindowRgn(arg0, arg1, arg2);
	}

	/*public HHOOK SetWindowsHookEx(int arg0, HOOKPROC arg1, HINSTANCE arg2,
			int arg3) {

		return user32.SetWindowsHookEx(arg0, arg1, arg2, arg3);
	}*/

	public boolean ShowWindow(HWND arg0, int arg1) {

		return user32.ShowWindow(arg0, arg1);
	}

	public boolean TranslateMessage(MSG arg0) {

		return user32.TranslateMessage(arg0);
	}

	public boolean UnhookWindowsHookEx(HHOOK arg0) {

		return user32.UnhookWindowsHookEx(arg0);
	}

	public boolean UnregisterHotKey(Pointer arg0, int arg1) {

		return user32.UnregisterHotKey(arg0, arg1);
	}

	public boolean UpdateLayeredWindow(HWND arg0, HDC arg1, POINT arg2,
			SIZE arg3, HDC arg4, POINT arg5, int arg6, BLENDFUNCTION arg7,
			int arg8) {

		return user32.UpdateLayeredWindow(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6, arg7, arg8);
	}

	public boolean UpdateWindow(HWND arg0) {

		return user32.UpdateWindow(arg0);
	}

	public DWORD WaitForInputIdle(HANDLE arg0, DWORD arg1) {

		return user32.WaitForInputIdle(arg0, arg1);
	}

}
