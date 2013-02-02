/**
 * 
 */
package org.sirius.server.win32.classes.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class ListBox {

	/**
	 * 
	 */
	public ListBox() {
		// TODO Auto-generated constructor stub
	}

	/*
	 #define ListBox_AddItemData(hwndCtl,data) ((int)(DWORD)SNDMSG((hwndCtl),LB_ADDSTRING,0,(LPARAM)(data)))
#define ListBox_AddString(hwndCtl,lpsz) ((int)(DWORD)SNDMSG((hwndCtl),LB_ADDSTRING,0,(LPARAM)(LPCTSTR)(lpsz)))
#define ListBox_DeleteString(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_DELETESTRING,(WPARAM)(int)(index),0))
#define ListBox_Dir(hwndCtl,attrs,lpszFileSpec) ((int)(DWORD)SNDMSG((hwndCtl),LB_DIR,(WPARAM)(UINT)(attrs),(LPARAM)(LPCTSTR)(lpszFileSpec)))
#define ListBox_Enable(hwndCtl,fEnable) EnableWindow((hwndCtl),(fEnable))
#define ListBox_FindItemData(hwndCtl,indexStart,data) ((int)(DWORD)SNDMSG((hwndCtl),LB_FINDSTRING,(WPARAM)(int)(indexStart),(LPARAM)(data)))
#define ListBox_FindString(hwndCtl,indexStart,lpszFind) ((int)(DWORD)SNDMSG((hwndCtl),LB_FINDSTRING,(WPARAM)(int)(indexStart),(LPARAM)(LPCTSTR)(lpszFind)))
#define ListBox_FindStringExact(hwndCtl,indexStart,lpszFind) ((int)(DWORD)SNDMSG((hwndCtl),LB_FINDSTRINGEXACT,(WPARAM)(int)(indexStart),(LPARAM)(LPCTSTR)(lpszFind)))
#define ListBox_GetCaretIndex(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETCARETINDEX,0,0))
#define ListBox_GetCount(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETCOUNT,0,0))
#define ListBox_GetCurSel(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETCURSEL,0,0))
#define ListBox_GetHorizontalExtent(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETHORIZONTALEXTENT,0,0))
#define ListBox_GetItemData(hwndCtl,index) ((LRESULT)(DWORD)SNDMSG((hwndCtl),LB_GETITEMDATA,(WPARAM)(int)(index),0))
#define ListBox_GetItemHeight(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETITEMHEIGHT,(WPARAM)(int)(index),0))
#define ListBox_GetItemRect(hwndCtl,index,lprc) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETITEMRECT,(WPARAM)(int)(index),(LPARAM)(RECT*)(lprc)))
#define ListBox_GetSel(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETSEL,(WPARAM)(int)(index),0))
#define ListBox_GetSelCount(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETSELCOUNT,0,0))
#define ListBox_GetSelItems(hwndCtl,cItems,lpItems) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETSELITEMS,(WPARAM)(int)(cItems),(LPARAM)(int*)(lpItems)))
#define ListBox_GetText(hwndCtl,index,lpszBuffer) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETTEXT,(WPARAM)(int)(index),(LPARAM)(LPCTSTR)(lpszBuffer)))
#define ListBox_GetTextLen(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETTEXTLEN,(WPARAM)(int)(index),0))
#define ListBox_GetTopIndex(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),LB_GETTOPINDEX,0,0))
#define ListBox_InsertItemData(hwndCtl,index,data) ((int)(DWORD)SNDMSG((hwndCtl),LB_INSERTSTRING,(WPARAM)(int)(index),(LPARAM)(data)))
#define ListBox_InsertString(hwndCtl,index,lpsz) ((int)(DWORD)SNDMSG((hwndCtl),LB_INSERTSTRING,(WPARAM)(int)(index),(LPARAM)(LPCTSTR)(lpsz)))
#define ListBox_ResetContent(hwndCtl) ((BOOL)(DWORD)SNDMSG((hwndCtl),LB_RESETCONTENT,0,0))
#define ListBox_SelItemRange(hwndCtl,fSelect,first,last) ((int)(DWORD)SNDMSG((hwndCtl),LB_SELITEMRANGE,(WPARAM)(BOOL)(fSelect),MAKELPARAM((first),(last))))
#define ListBox_SelectItemData(hwndCtl,indexStart,data) ((int)(DWORD)SNDMSG((hwndCtl),LB_SELECTSTRING,(WPARAM)(int)(indexStart),(LPARAM)(data)))
#define ListBox_SelectString(hwndCtl,indexStart,lpszFind) ((int)(DWORD)SNDMSG((hwndCtl),LB_SELECTSTRING,(WPARAM)(int)(indexStart),(LPARAM)(LPCTSTR)(lpszFind)))
#define ListBox_SetCaretIndex(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_SETCARETINDEX,(WPARAM)(int)(index),0))
#define ListBox_SetColumnWidth(hwndCtl,cxColumn) ((void)SNDMSG((hwndCtl),LB_SETCOLUMNWIDTH,(WPARAM)(int)(cxColumn),0))
#define ListBox_SetCurSel(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_SETCURSEL,(WPARAM)(int)(index),0))
#define ListBox_SetHorizontalExtent(hwndCtl,cxExtent) ((void)SNDMSG((hwndCtl),LB_SETHORIZONTALEXTENT,(WPARAM)(int)(cxExtent),0))
#define ListBox_SetItemData(hwndCtl,index,data) ((int)(DWORD)SNDMSG((hwndCtl),LB_SETITEMDATA,(WPARAM)(int)(index),(LPARAM)(data)))
#define ListBox_SetItemHeight(hwndCtl,index,cy) ((int)(DWORD)SNDMSG((hwndCtl),LB_SETITEMHEIGHT,(WPARAM)(int)(index),MAKELPARAM((cy),0)))
#define ListBox_SetSel(hwndCtl,fSelect,index) ((int)(DWORD)SNDMSG((hwndCtl),LB_SETSEL,(WPARAM)(BOOL)(fSelect),(LPARAM)(index)))
#define ListBox_SetTabStops(hwndCtl,cTabs,lpTabs) ((BOOL)(DWORD)SNDMSG((hwndCtl),LB_SETTABSTOPS,(WPARAM)(int)(cTabs),(LPARAM)(int*)(lpTabs)))
#define ListBox_SetTopIndex(hwndCtl,indexTop) ((int)(DWORD)SNDMSG((hwndCtl),LB_SETTOPINDEX,(WPARAM)(int)(indexTop),0))
	 */
}
