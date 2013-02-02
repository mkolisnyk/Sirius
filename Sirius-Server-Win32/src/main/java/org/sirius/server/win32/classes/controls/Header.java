/**
 * 
 */
package org.sirius.server.win32.classes.controls;

/**
 * @author Myk Kolisnyk
 *
 */
public class Header {

	/**
	 * 
	 */
	public Header() {
		// TODO Auto-generated constructor stub
	}

	/*
	 #define Header_GetItemCount(w) (int)SNDMSG((w),HDM_GETITEMCOUNT,0,0)
#define Header_InsertItem(w,i,phdi) (int)SNDMSG((w),HDM_INSERTITEM,(WPARAM)(int)(i),(LPARAM)(const HD_ITEM*)(phdi))
#define Header_DeleteItem(w,i) (BOOL)SNDMSG((w),HDM_DELETEITEM,(WPARAM)(int)(i),0)
#define Header_GetItem(w,i,phdi) (BOOL)SNDMSG((w),HDM_GETITEM,(WPARAM)(int)(i),(LPARAM)(HD_ITEM*)(phdi))
#define Header_SetItem(w,i,phdi) (BOOL)SNDMSG((w),HDM_SETITEM,(WPARAM)(int)(i),(LPARAM)(const HD_ITEM*)(phdi))
#define Header_Layout(w,l) (BOOL)SNDMSG((w),HDM_LAYOUT,0,(LPARAM)(HD_LAYOUT*)(l))
#if (_WIN32_IE >= 0x0300)
#define Header_OrderToIndex(w,o) (int)SNDMSG((w),HDM_ORDERTOINDEX,(WPARAM)(o),0)
#define Header_GetItemRect(w,i,r) (BOOL)SNDMSG((w),HDM_GETITEMRECT,(WPARAM)(i),(LPARAM)(r))
#define Header_GetOrderArray(w,l,a) (BOOL)SNDMSG((w),HDM_GETORDERARRAY,(WPARAM)(l),(LPARAM)(a))
#define Header_SetOrderArray(w,l,a) (BOOL)SNDMSG((w),HDM_SETORDERARRAY,(WPARAM)(l),(LPARAM)(a))
#define Header_CreateDragImage(w, i) (HIMAGELIST)SNDMSG((w), HDM_CREATEDRAGIMAGE, (WPARAM)i, 0)
#define Header_SetImageList(w,l) (HIMAGELIST)SNDMSG((w), HDM_SETIMAGELIST, 0, (LPARAM)l)
#define Header_GetImageList(w) (HIMAGELIST)SNDMSG((w),HDM_GETIMAGELIST,0,0)
#endif
#if (_WIN32_IE >= 0x0400)
#define Header_GetUnicodeFormat(w) (BOOL)SNDMSG((w),HDM_GETUNICODEFORMAT,0,0)
#define Header_SetUnicodeFormat(w,f) (BOOL)SNDMSG((w),HDM_SETUNICODEFORMAT,(WPARAM)(f),0)
	 */
}
