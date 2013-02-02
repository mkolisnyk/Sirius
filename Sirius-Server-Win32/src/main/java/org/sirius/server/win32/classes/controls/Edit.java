/**
 * 
 */
package org.sirius.server.win32.classes.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class Edit {

	/**
	 * 
	 */
	public Edit() {
		// TODO Auto-generated constructor stub
	}

	/*
	 
	 #define Edit_CanUndo(hwndCtl) ((BOOL)(DWORD)SNDMSG((hwndCtl),EM_CANUNDO,0,0))
#define Edit_EmptyUndoBuffer(hwndCtl) ((void)SNDMSG((hwndCtl),EM_EMPTYUNDOBUFFER,0,0))
#define Edit_Enable(hwndCtl,fEnable) EnableWindow((hwndCtl),(fEnable))
#define Edit_FmtLines(hwndCtl,fAddEOL) ((BOOL)(DWORD)SNDMSG((hwndCtl),EM_FMTLINES,(WPARAM)(BOOL)(fAddEOL),0))
#define Edit_GetFirstVisibleLine(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),EM_GETFIRSTVISIBLELINE,0,0))
#define Edit_GetHandle(hwndCtl) ((HLOCAL)(UINT)(DWORD)SNDMSG((hwndCtl),EM_GETHANDLE,0,0))
#define Edit_GetLine(hwndCtl,line,lpch,cchMax) ((*((int*)(lpch)) = (cchMax)),((int)(DWORD)SNDMSG((hwndCtl),EM_GETLINE,(WPARAM)(int)(line),(LPARAM)(LPTSTR)(lpch))))
#define Edit_GetLineCount(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),EM_GETLINECOUNT,0,0))
#define Edit_GetModify(hwndCtl) ((BOOL)(DWORD)SNDMSG((hwndCtl),EM_GETMODIFY,0,0))
#define Edit_GetPasswordChar(hwndCtl) ((TCHAR)(DWORD)SNDMSG((hwndCtl),EM_GETPASSWORDCHAR,0,0))
#define Edit_GetRect(hwndCtl,lprc) ((void)SNDMSG((hwndCtl),EM_GETRECT,0,(LPARAM)(RECT*)(lprc)))
#define Edit_GetSel(hwndCtl) ((DWORD)SNDMSG((hwndCtl),EM_GETSEL,0,0))
#define Edit_GetText(hwndCtl,lpch,cchMax) GetWindowText((hwndCtl),(lpch),(cchMax))
#define Edit_GetTextLength(hwndCtl) GetWindowTextLength(hwndCtl)
#define Edit_GetWordBreakProc(hwndCtl) ((EDITWORDBREAKPROC)SNDMSG((hwndCtl),EM_GETWORDBREAKPROC,0,0))
#define Edit_LimitText(hwndCtl,cchMax) ((void)SNDMSG((hwndCtl),EM_LIMITTEXT,(WPARAM)(cchMax),0))
#define Edit_LineFromChar(hwndCtl,ich) ((int)(DWORD)SNDMSG((hwndCtl),EM_LINEFROMCHAR,(WPARAM)(int)(ich),0))
#define Edit_LineIndex(hwndCtl,line) ((int)(DWORD)SNDMSG((hwndCtl),EM_LINEINDEX,(WPARAM)(int)(line),0))
#define Edit_LineLength(hwndCtl,line) ((int)(DWORD)SNDMSG((hwndCtl),EM_LINELENGTH,(WPARAM)(int)(line),0))
#define Edit_ReplaceSel(hwndCtl,lpszReplace) ((void)SNDMSG((hwndCtl),EM_REPLACESEL,0,(LPARAM)(LPCTSTR)(lpszReplace)))
#define Edit_Scroll(hwndCtl,dv,dh) ((void)SNDMSG((hwndCtl),EM_LINESCROLL,(WPARAM)(dh),(LPARAM)(dv)))
#define Edit_ScrollCaret(hwndCtl) ((BOOL)(DWORD)SNDMSG((hwndCtl),EM_SCROLLCARET,0,0))
#define Edit_SetHandle(hwndCtl,h) ((void)SNDMSG((hwndCtl),EM_SETHANDLE,(WPARAM)(UINT)(HLOCAL)(h),0))
#define Edit_SetModify(hwndCtl,fModified) ((void)SNDMSG((hwndCtl),EM_SETMODIFY,(WPARAM)(UINT)(fModified),0))
#define Edit_SetPasswordChar(hwndCtl,ch) ((void)SNDMSG((hwndCtl),EM_SETPASSWORDCHAR,(WPARAM)(UINT)(ch),0))
#define Edit_SetReadOnly(hwndCtl,fReadOnly) ((BOOL)(DWORD)SNDMSG((hwndCtl),EM_SETREADONLY,(WPARAM)(BOOL)(fReadOnly),0))
#define Edit_SetRect(hwndCtl,lprc) ((void)SNDMSG((hwndCtl),EM_SETRECT,0,(LPARAM)(const RECT*)(lprc)))
#define Edit_SetRectNoPaint(hwndCtl,lprc) ((void)SNDMSG((hwndCtl),EM_SETRECTNP,0,(LPARAM)(const RECT*)(lprc)))
#define Edit_SetSel(hwndCtl,ichStart,ichEnd) ((void)SNDMSG((hwndCtl),EM_SETSEL,(ichStart),(ichEnd)))
#define Edit_SetTabStops(hwndCtl,cTabs,lpTabs) ((void)SNDMSG((hwndCtl),EM_SETTABSTOPS,(WPARAM)(int)(cTabs),(LPARAM)(const int*)(lpTabs)))
#define Edit_SetText(hwndCtl,lpsz) SetWindowText((hwndCtl),(lpsz))
#define Edit_SetWordBreakProc(hwndCtl,lpfnWordBreak) ((void)SNDMSG((hwndCtl),EM_SETWORDBREAKPROC,0,(LPARAM)(EDITWORDBREAKPROC)(lpfnWordBreak)))
#define Edit_Undo(hwndCtl) ((BOOL)(DWORD)SNDMSG((hwndCtl),EM_UNDO,0,0))

	 */
}
