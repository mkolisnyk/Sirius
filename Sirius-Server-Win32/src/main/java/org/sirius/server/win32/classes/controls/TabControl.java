/**
 * 
 */
package org.sirius.server.win32.classes.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class TabControl {

	/**
	 * 
	 */
	public TabControl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 
#define TabCtrl_GetItem(w,i,p) (BOOL)SNDMSG((w),TCM_GETITEM,i,(LPARAM)(TC_ITEM*)(p))
#define TabCtrl_SetItem(w,i,p) (BOOL)SNDMSG((w),TCM_SETITEM,i,(LPARAM)(TC_ITEM*)(p))
#define TabCtrl_InsertItem(w,i,p) (int)SNDMSG((w),TCM_INSERTITEM,i,(LPARAM)(const TC_ITEM*)(p))
#define TabCtrl_DeleteItem(w,i) (BOOL)SNDMSG((w),TCM_DELETEITEM,i,0)
#define TabCtrl_DeleteAllItems(w) (BOOL)SNDMSG((w),TCM_DELETEALLITEMS,0,0)
#define TabCtrl_GetItemRect(w,i,p) (BOOL)SNDMSG((w),TCM_GETITEMRECT,i,(LPARAM)(LPRECT)(p))
#define TabCtrl_GetCurSel(w) (int)SNDMSG((w),TCM_GETCURSEL,0,0)
#define TabCtrl_SetCurSel(w,i) (int)SNDMSG((w),TCM_SETCURSEL,i,0)
#define TabCtrl_HitTest(w,p) (int)SNDMSG((w),TCM_HITTEST,0,(LPARAM)(TC_HITTESTINFO*)(p))
#define TabCtrl_SetItemExtra(w,c) (BOOL)SNDMSG((w),TCM_SETITEMEXTRA,c,0)
#define TabCtrl_AdjustRect(w,b,p) (int)SNDMSG((w),TCM_ADJUSTRECT,b,(LPARAM)(LPRECT)p)
#define TabCtrl_SetItemSize(w,x,y) (DWORD)SNDMSG((w),TCM_SETITEMSIZE,0,MAKELPARAM(x,y))
#define TabCtrl_RemoveImage(w,i) (void)SNDMSG((w),TCM_REMOVEIMAGE,i,0)
#define TabCtrl_SetPadding(w,x,y) (void)SNDMSG((w),TCM_SETPADDING,0,MAKELPARAM(x,y))
#define TabCtrl_GetRowCount(w) (int)SNDMSG((w),TCM_GETROWCOUNT,0,0)
#define TabCtrl_GetToolTips(w) (HWND)SNDMSG((w),TCM_GETTOOLTIPS,0,0)
#define TabCtrl_SetToolTips(w,t) (void)SNDMSG((w),TCM_SETTOOLTIPS,(WPARAM)t,0)
#define TabCtrl_GetCurFocus(w) (int)SNDMSG((w),TCM_GETCURFOCUS,0,0)
#define TabCtrl_SetCurFocus(w,i) (void)SNDMSG((w),TCM_SETCURFOCUS,i,0)
#define TabCtrl_GetImageList(w) (HIMAGELIST)SNDMSG((w),TCM_GETIMAGELIST,0,0)
#define TabCtrl_SetImageList(w,h) (HIMAGELIST)SNDMSG((w),TCM_SETIMAGELIST,0,(LPARAM)(UINT)(h))
#define TabCtrl_GetItemCount(w) (int)SNDMSG((w),TCM_GETITEMCOUNT,0,0)
	 */
}
