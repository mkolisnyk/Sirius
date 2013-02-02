/**
 * 
 */
package org.sirius.server.win32.classes.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class ComboBox {

	/**
	 * 
	 */
	public ComboBox() {
		// TODO Auto-generated constructor stub
	}

	/*
	 #define ComboBox_AddItemData(hwndCtl,data) ((int)(DWORD)SNDMSG((hwndCtl),CB_ADDSTRING,0,(LPARAM)(data)))
#define ComboBox_AddString(hwndCtl,lpsz) ((int)(DWORD)SNDMSG((hwndCtl),CB_ADDSTRING,0,(LPARAM)(LPCTSTR)(lpsz)))
#define ComboBox_DeleteString(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),CB_DELETESTRING,(WPARAM)(int)(index),0))
#define ComboBox_Dir(hwndCtl,attrs,lpszFileSpec) ((int)(DWORD)SNDMSG((hwndCtl),CB_DIR,(WPARAM)(UINT)(attrs),(LPARAM)(LPCTSTR)(lpszFileSpec)))
#define ComboBox_Enable(hwndCtl,fEnable) EnableWindow((hwndCtl),(fEnable))
#define ComboBox_FindItemData(hwndCtl,indexStart,data) ((int)(DWORD)SNDMSG((hwndCtl),CB_FINDSTRING,(WPARAM)(int)(indexStart),(LPARAM)(data)))
#define ComboBox_FindString(hwndCtl,indexStart,lpszFind) ((int)(DWORD)SNDMSG((hwndCtl),CB_FINDSTRING,(WPARAM)(int)(indexStart),(LPARAM)(LPCTSTR)(lpszFind)))
#define ComboBox_FindStringExact(hwndCtl,indexStart,lpszFind) ((int)(DWORD)SNDMSG((hwndCtl),CB_FINDSTRINGEXACT,(WPARAM)(int)(indexStart),(LPARAM)(LPCTSTR)(lpszFind)))
#define ComboBox_GetCount(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),CB_GETCOUNT,0,0))
#define ComboBox_GetCurSel(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),CB_GETCURSEL,0,0))
#define ComboBox_GetDroppedControlRect(hwndCtl,lprc) ((void)SNDMSG((hwndCtl),CB_GETDROPPEDCONTROLRECT,0,(LPARAM)(RECT*)(lprc)))
#define ComboBox_GetDroppedState(hwndCtl) ((BOOL)(DWORD)SNDMSG((hwndCtl),CB_GETDROPPEDSTATE,0,0))
#define ComboBox_GetEditSel(hwndCtl) ((DWORD)SNDMSG((hwndCtl),CB_GETEDITSEL,0,0))
#define ComboBox_GetExtendedUI(hwndCtl) ((UINT)(DWORD)SNDMSG((hwndCtl),CB_GETEXTENDEDUI,0,0))
#define ComboBox_GetItemData(hwndCtl,index) ((LRESULT)(DWORD)SNDMSG((hwndCtl),CB_GETITEMDATA,(WPARAM)(int)(index),0))
#define ComboBox_GetItemHeight(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),CB_GETITEMHEIGHT,0,0))
#define ComboBox_GetLBText(hwndCtl,index,lpszBuffer) ((int)(DWORD)SNDMSG((hwndCtl),CB_GETLBTEXT,(WPARAM)(int)(index),(LPARAM)(LPCTSTR)(lpszBuffer)))
#define ComboBox_GetLBTextLen(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),CB_GETLBTEXTLEN,(WPARAM)(int)(index),0))
#define ComboBox_GetText(hwndCtl,lpch,cchMax) GetWindowText((hwndCtl),(lpch),(cchMax))
#define ComboBox_GetTextLength(hwndCtl) GetWindowTextLength(hwndCtl)
#define ComboBox_InsertItemData(hwndCtl,index,data) ((int)(DWORD)SNDMSG((hwndCtl),CB_INSERTSTRING,(WPARAM)(int)(index),(LPARAM)(data)))
#define ComboBox_InsertString(hwndCtl,index,lpsz) ((int)(DWORD)SNDMSG((hwndCtl),CB_INSERTSTRING,(WPARAM)(int)(index),(LPARAM)(LPCTSTR)(lpsz)))
#define ComboBox_LimitText(hwndCtl,cchLimit) ((int)(DWORD)SNDMSG((hwndCtl),CB_LIMITTEXT,(WPARAM)(int)(cchLimit),0))
#define ComboBox_ResetContent(hwndCtl) ((int)(DWORD)SNDMSG((hwndCtl),CB_RESETCONTENT,0,0))
#define ComboBox_SelectItemData(hwndCtl,indexStart,data) ((int)(DWORD)SNDMSG((hwndCtl),CB_SELECTSTRING,(WPARAM)(int)(indexStart),(LPARAM)(data)))
#define ComboBox_SelectString(hwndCtl,indexStart,lpszSelect) ((int)(DWORD)SNDMSG((hwndCtl),CB_SELECTSTRING,(WPARAM)(int)(indexStart),(LPARAM)(LPCTSTR)(lpszSelect)))
#define ComboBox_SetCurSel(hwndCtl,index) ((int)(DWORD)SNDMSG((hwndCtl),CB_SETCURSEL,(WPARAM)(int)(index),0))
#define ComboBox_SetEditSel(hwndCtl,ichStart,ichEnd) ((int)(DWORD)SNDMSG((hwndCtl),CB_SETEDITSEL,0,MAKELPARAM((ichStart),(ichEnd))))
#define ComboBox_SetExtendedUI(hwndCtl,flags) ((int)(DWORD)SNDMSG((hwndCtl),CB_SETEXTENDEDUI,(WPARAM)(UINT)(flags),0))
#define ComboBox_SetItemData(hwndCtl,index,data) ((int)(DWORD)SNDMSG((hwndCtl),CB_SETITEMDATA,(WPARAM)(int)(index),(LPARAM)(data)))
#define ComboBox_SetItemHeight(hwndCtl,index,cyItem) ((int)(DWORD)SNDMSG((hwndCtl),CB_SETITEMHEIGHT,(WPARAM)(int)(index),(LPARAM)(int)cyItem))
#define ComboBox_SetText(hwndCtl,lpsz) SetWindowText((hwndCtl),(lpsz))
#define ComboBox_ShowDropdown(hwndCtl,fShow) ((BOOL)(DWORD)SNDMSG((hwndCtl),CB_SHOWDROPDOWN,(WPARAM)(BOOL)(fShow),0)) 
	 */
}
