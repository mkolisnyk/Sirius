/**
 * 
 */
package org.sirius.server.win32.core;

import java.nio.Buffer;

import javax.jws.WebService;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.BaseTSD.ULONG_PTRByReference;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinBase.FILETIME;
import com.sun.jna.platform.win32.WinBase.MEMORYSTATUSEX;
import com.sun.jna.platform.win32.WinBase.OVERLAPPED;
import com.sun.jna.platform.win32.WinBase.SECURITY_ATTRIBUTES;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HMODULE;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import com.sun.jna.platform.win32.WinNT.HANDLEByReference;
import com.sun.jna.platform.win32.WinNT.OSVERSIONINFO;
import com.sun.jna.platform.win32.WinNT.OSVERSIONINFOEX;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 * @author KaNoN
 * 
 */
@WebService
public class Kernel32Lib {

	protected Kernel32 kernel32;

	/*
	 * @XmlType(namespace="com.sun.jna.platform.win32.WinBase.PROCESS_INFORMATION"
	 * ) public static class ByReference extends PROCESS_INFORMATION implements
	 * Structure.ByReference { public ByReference() { }
	 * 
	 * public ByReference(Pointer memory) { super(memory); } }
	 */

	/**
	 * 
	 */
	public Kernel32Lib() {
		kernel32 = Kernel32.INSTANCE;
	}

	public boolean CloseHandle(HANDLE arg0) {

		return kernel32.CloseHandle(arg0);
	}

	public boolean CopyFile(String arg0, String arg1, boolean arg2) {

		return kernel32.CopyFile(arg0, arg1, arg2);
	}

	public boolean CreateDirectory(String arg0, SECURITY_ATTRIBUTES arg1) {

		return kernel32.CreateDirectory(arg0, arg1);
	}

	public HANDLE CreateEvent(SECURITY_ATTRIBUTES arg0, boolean arg1,
			boolean arg2, String arg3) {

		return kernel32.CreateEvent(arg0, arg1, arg2, arg3);
	}

	public HANDLE CreateFile(String arg0, int arg1, int arg2,
			SECURITY_ATTRIBUTES arg3, int arg4, int arg5, HANDLE arg6) {

		return kernel32.CreateFile(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public HANDLE CreateFileMapping(HANDLE arg0, SECURITY_ATTRIBUTES arg1,
			int arg2, int arg3, int arg4, String arg5) {

		return kernel32.CreateFileMapping(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public HANDLE CreateIoCompletionPort(HANDLE arg0, HANDLE arg1,
			Pointer arg2, int arg3) {

		return kernel32.CreateIoCompletionPort(arg0, arg1, arg2, arg3);
	}

	/*
	 * public boolean
	 * CreatePipe(@WebParam(targetNamespace="com.sun.jna.platform.win32.WinNT")
	 * HANDLEByReference arg0,
	 * @WebParam(targetNamespace="com.sun.jna.platform.win32.WinNT")
	 * HANDLEByReference arg1, SECURITY_ATTRIBUTES arg2, int arg3) {
	 * 
	 * return kernel32.CreatePipe(arg0, arg1, arg2, arg3); }
	 * 
	 * public boolean CreateProcess(String arg0, String arg1,
	 * SECURITY_ATTRIBUTES arg2, SECURITY_ATTRIBUTES arg3, boolean arg4, DWORD
	 * arg5, Pointer arg6, String arg7, STARTUPINFO arg8,
	 * 
	 * @WebParam(targetNamespace=
	 * "com.sun.jna.platform.win32.WinBase.PROCESS_INFORMATION") ByReference
	 * arg9) {
	 * 
	 * return kernel32.CreateProcess(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
	 * arg7, arg8, arg9); }
	 */

	public HANDLE CreateToolhelp32Snapshot(DWORD arg0, DWORD arg1) {

		return kernel32.CreateToolhelp32Snapshot(arg0, arg1);
	}

	public boolean DeleteFile(String arg0) {

		return kernel32.DeleteFile(arg0);
	}

	public boolean DeviceIoControl(HANDLE arg0, int arg1, Pointer arg2,
			int arg3, Pointer arg4, int arg5, IntByReference arg6, Pointer arg7) {

		return kernel32.DeviceIoControl(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6, arg7);
	}

	public boolean DuplicateHandle(HANDLE arg0, HANDLE arg1, HANDLE arg2,
			HANDLEByReference arg3, int arg4, boolean arg5, int arg6) {

		return kernel32.DuplicateHandle(arg0, arg1, arg2, arg3, arg4, arg5,
				arg6);
	}

	public int FormatMessage(int arg0, Pointer arg1, int arg2, int arg3,
			Buffer arg4, int arg5, Pointer arg6) {

		return kernel32.FormatMessage(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public int FormatMessage2(int arg0, Pointer arg1, int arg2, int arg3,
			Pointer arg4, int arg5, Pointer arg6) {

		return kernel32.FormatMessage(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public int FormatMessage3(int arg0, Pointer arg1, int arg2, int arg3,
			PointerByReference arg4, int arg5, Pointer arg6) {

		return kernel32.FormatMessage(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public boolean GetComputerName(char[] arg0, IntByReference arg1) {

		return kernel32.GetComputerName(arg0, arg1);
	}

	public HANDLE GetCurrentProcess() {

		return kernel32.GetCurrentProcess();
	}

	public int GetCurrentProcessId() {

		return kernel32.GetCurrentProcessId();
	}

	public HANDLE GetCurrentThread() {

		return kernel32.GetCurrentThread();
	}

	public int GetCurrentThreadId() {

		return kernel32.GetCurrentThreadId();
	}

	/*
	 * public boolean GetDiskFreeSpaceEx(String arg0,
	 * com.sun.jna.platform.win32.WinNT.LARGE_INTEGER.ByReference arg1,
	 * com.sun.jna.platform.win32.WinNT.LARGE_INTEGER.ByReference arg2,
	 * com.sun.jna.platform.win32.WinNT.LARGE_INTEGER.ByReference arg3) {
	 * 
	 * return kernel32.GetDiskFreeSpaceEx(arg0, arg1, arg2, arg3); }
	 * 
	 * public boolean GetDiskFreeSpaceEx(String arg0, LongByReference arg1,
	 * LongByReference arg2, LongByReference arg3) {
	 * 
	 * return kernel32.GetDiskFreeSpaceEx(arg0, arg1, arg2, arg3); }
	 */

	public int GetDriveType(String arg0) {

		return kernel32.GetDriveType(arg0);
	}

	public int GetEnvironmentVariable(String arg0, char[] arg1, int arg2) {

		return kernel32.GetEnvironmentVariable(arg0, arg1, arg2);
	}

	public boolean GetExitCodeProcess(HANDLE arg0, IntByReference arg1) {

		return kernel32.GetExitCodeProcess(arg0, arg1);
	}

	public int GetFileAttributes(String arg0) {

		return kernel32.GetFileAttributes(arg0);
	}

	/*
	 * public boolean GetFileTime(HANDLE arg0,
	 * com.sun.jna.platform.win32.WinBase.FILETIME.ByReference arg1,
	 * com.sun.jna.platform.win32.WinBase.FILETIME.ByReference arg2,
	 * com.sun.jna.platform.win32.WinBase.FILETIME.ByReference arg3) {
	 * 
	 * return kernel32.GetFileTime(arg0, arg1, arg2, arg3); }
	 */

	public int GetFileType(HANDLE arg0) {

		return kernel32.GetFileType(arg0);
	}

	public int GetLastError() {

		return kernel32.GetLastError();
	}

	public DWORD GetLogicalDriveStrings(DWORD arg0, char[] arg1) {

		return kernel32.GetLogicalDriveStrings(arg0, arg1);
	}

	public HMODULE GetModuleHandle(String arg0) {

		return kernel32.GetModuleHandle(arg0);
	}

	/*
	 * public void GetNativeSystemInfo(SYSTEM_INFO arg0) {
	 * 
	 * kernel32.GetNativeSystemInfo(arg0); }
	 */

	public int GetProcessId(HANDLE arg0) {

		return kernel32.GetProcessId(arg0);
	}

	public int GetProcessVersion(int arg0) {

		return kernel32.GetProcessVersion(arg0);
	}

	public boolean GetQueuedCompletionStatus(HANDLE arg0, IntByReference arg1,
			ULONG_PTRByReference arg2, PointerByReference arg3, int arg4) {

		return kernel32.GetQueuedCompletionStatus(arg0, arg1, arg2, arg3, arg4);
	}

	public int GetShortPathName(String arg0, char[] arg1, int arg2) {

		return kernel32.GetShortPathName(arg0, arg1, arg2);
	}

	/*
	 * public void GetSystemInfo(SYSTEM_INFO arg0) {
	 * 
	 * kernel32.GetSystemInfo(arg0); }
	 * 
	 * public void GetSystemTime(SYSTEMTIME arg0) {
	 * 
	 * kernel32.GetSystemTime(arg0); }
	 */

	public DWORD GetTempPath(DWORD arg0, char[] arg1) {

		return kernel32.GetTempPath(arg0, arg1);
	}

	public int GetTickCount() {

		return kernel32.GetTickCount();
	}

	public DWORD GetVersion() {

		return kernel32.GetVersion();
	}

	public boolean GetVersionEx(OSVERSIONINFO arg0) {

		return kernel32.GetVersionEx(arg0);
	}

	public boolean GetVersionEx2(OSVERSIONINFOEX arg0) {

		return kernel32.GetVersionEx(arg0);
	}

	public Pointer GlobalFree(Pointer arg0) {

		return kernel32.GlobalFree(arg0);
	}

	public boolean GlobalMemoryStatusEx(MEMORYSTATUSEX arg0) {

		return kernel32.GlobalMemoryStatusEx(arg0);
	}

	public boolean IsWow64Process(HANDLE arg0, IntByReference arg1) {

		return kernel32.IsWow64Process(arg0, arg1);
	}

	public Pointer LocalAlloc(int arg0, int arg1) {

		return kernel32.LocalAlloc(arg0, arg1);
	}

	public Pointer LocalFree(Pointer arg0) {

		return kernel32.LocalFree(arg0);
	}

	public Pointer MapViewOfFile(HANDLE arg0, int arg1, int arg2, int arg3,
			int arg4) {

		return kernel32.MapViewOfFile(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean MoveFile(String arg0, String arg1) {

		return kernel32.MoveFile(arg0, arg1);
	}

	public boolean MoveFileEx(String arg0, String arg1, DWORD arg2) {

		return kernel32.MoveFileEx(arg0, arg1, arg2);
	}

	public HANDLE OpenProcess(int arg0, boolean arg1, int arg2) {

		return kernel32.OpenProcess(arg0, arg1, arg2);
	}

	public HANDLE OpenThread(int arg0, boolean arg1, int arg2) {

		return kernel32.OpenThread(arg0, arg1, arg2);
	}

	public boolean PostQueuedCompletionStatus(HANDLE arg0, int arg1,
			Pointer arg2, OVERLAPPED arg3) {

		return kernel32.PostQueuedCompletionStatus(arg0, arg1, arg2, arg3);
	}

	/*
	 * public boolean Process32First(HANDLE arg0,
	 * 
	 * @WebParam(targetNamespace=
	 * "com.sun.jna.platform.win32.Tlhelp32.PROCESSENTRY32"
	 * )com.sun.jna.platform.win32.Tlhelp32.PROCESSENTRY32.ByReference arg1) {
	 * 
	 * return kernel32.Process32First(arg0, arg1); }
	 * 
	 * public boolean Process32Next(HANDLE arg0,
	 * 
	 * @WebParam(targetNamespace=
	 * "com.sun.jna.platform.win32.Tlhelp32.PROCESSENTRY32")
	 * com.sun.jna.platform.win32.Tlhelp32.PROCESSENTRY32.ByReference arg1) {
	 * 
	 * return kernel32.Process32Next(arg0, arg1); }
	 */

	public boolean PulseEvent(HANDLE arg0) {

		return kernel32.PulseEvent(arg0);
	}

	/*
	 * public boolean ReadDirectoryChangesW(HANDLE arg0, FILE_NOTIFY_INFORMATION
	 * arg1, int arg2, boolean arg3, int arg4, IntByReference arg5, OVERLAPPED
	 * arg6, OVERLAPPED_COMPLETION_ROUTINE arg7) {
	 * 
	 * return kernel32.ReadDirectoryChangesW(arg0, arg1, arg2, arg3, arg4, arg5,
	 * arg6, arg7); }
	 */

	public boolean ReadFile(HANDLE arg0, Buffer arg1, int arg2,
			IntByReference arg3, OVERLAPPED arg4) {

		return kernel32.ReadFile(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean ReadFile2(HANDLE arg0, Pointer arg1, int arg2,
			IntByReference arg3, OVERLAPPED arg4) {

		return kernel32.ReadFile(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean SetEnvironmentVariable(String arg0, String arg1) {

		return kernel32.SetEnvironmentVariable(arg0, arg1);
	}

	public boolean SetEvent(HANDLE arg0) {

		return kernel32.SetEvent(arg0);
	}

	public boolean SetFileAttributes(String arg0, DWORD arg1) {

		return kernel32.SetFileAttributes(arg0, arg1);
	}

	public int SetFileTime(HANDLE arg0, FILETIME arg1, FILETIME arg2,
			FILETIME arg3) {

		return kernel32.SetFileTime(arg0, arg1, arg2, arg3);
	}

	public boolean SetHandleInformation(HANDLE arg0, int arg1, int arg2) {

		return kernel32.SetHandleInformation(arg0, arg1, arg2);
	}

	public void SetLastError(int arg0) {

		kernel32.SetLastError(arg0);
	}

	public boolean TerminateProcess(HANDLE arg0, int arg1) {

		return kernel32.TerminateProcess(arg0, arg1);
	}

	public boolean UnmapViewOfFile(Pointer arg0) {

		return kernel32.UnmapViewOfFile(arg0);
	}

	public int WaitForMultipleObjects(int arg0, HANDLE[] arg1, boolean arg2,
			int arg3) {

		return kernel32.WaitForMultipleObjects(arg0, arg1, arg2, arg3);
	}

	public int WaitForSingleObject(HANDLE arg0, int arg1) {

		return kernel32.WaitForSingleObject(arg0, arg1);
	}

	public boolean WriteFile(HANDLE arg0, byte[] arg1, int arg2,
			IntByReference arg3, OVERLAPPED arg4) {

		return kernel32.WriteFile(arg0, arg1, arg2, arg3, arg4);
	}

}
