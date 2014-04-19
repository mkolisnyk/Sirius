/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

/**
 * @author Myk Kolisnyk
 * 
 */
@WebService
public class TreeView {

    /**
	 * 
	 */
    public TreeView() {
        // TODO Auto-generated constructor stub
    }
    /*
     * #define TreeView_InsertItem(w,i)
     * (HTREEITEM)SNDMSG((w),TVM_INSERTITEM,0,(LPARAM)(LPTV_INSERTSTRUCT)(i))
     * #define TreeView_DeleteItem(w,i)
     * (BOOL)SNDMSG((w),TVM_DELETEITEM,0,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_DeleteAllItems(w)
     * (BOOL)SNDMSG((w),TVM_DELETEITEM,0,(LPARAM)TVI_ROOT) #define
     * TreeView_Expand(w,i,c)
     * (BOOL)SNDMSG((w),TVM_EXPAND,c,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_GetItemRect(w,i,p,c)
     * (*(HTREEITEM*)p=(i),(BOOL)SNDMSG((w),TVM_GETITEMRECT
     * ,c,(LPARAM)(LPRECT)(p))) #define TreeView_GetCount(w)
     * (UINT)SNDMSG((w),TVM_GETCOUNT,0,0) #define TreeView_GetIndent(w)
     * (UINT)SNDMSG((w),TVM_GETINDENT,0,0) #define TreeView_SetIndent(w,i)
     * (BOOL)SNDMSG((w),TVM_SETINDENT,i,0) #define TreeView_GetImageList(w,i)
     * (HIMAGELIST)SNDMSG((w),TVM_GETIMAGELIST,i,0) #define
     * TreeView_SetImageList(w,h,i)
     * (HIMAGELIST)SNDMSG((w),TVM_SETIMAGELIST,i,(LPARAM)(HIMAGELIST)(h))
     * #define TreeView_GetNextItem(w,i,c)
     * (HTREEITEM)SNDMSG((w),TVM_GETNEXTITEM,c,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_GetChild(w,i) TreeView_GetNextItem(w,i,TVGN_CHILD) #define
     * TreeView_GetNextSibling(w,i) TreeView_GetNextItem(w,i,TVGN_NEXT) #define
     * TreeView_GetPrevSibling(w,i) TreeView_GetNextItem(w,i,TVGN_PREVIOUS)
     * #define TreeView_GetParent(w,i) TreeView_GetNextItem(w,i,TVGN_PARENT)
     * #define TreeView_GetFirstVisible(w)
     * TreeView_GetNextItem(w,NULL,TVGN_FIRSTVISIBLE) #define
     * TreeView_GetNextVisible(w,i) TreeView_GetNextItem(w,i,TVGN_NEXTVISIBLE)
     * #define TreeView_GetPrevVisible(w,i)
     * TreeView_GetNextItem(w,i,TVGN_PREVIOUSVISIBLE) #define
     * TreeView_GetSelection(w) TreeView_GetNextItem(w,NULL,TVGN_CARET) #define
     * TreeView_GetDropHilight(w) TreeView_GetNextItem(w,NULL,TVGN_DROPHILITE)
     * #define TreeView_GetRoot(w) TreeView_GetNextItem(w,NULL,TVGN_ROOT)
     * #define TreeView_Select(w,i,c)
     * (BOOL)SNDMSG((w),TVM_SELECTITEM,c,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_SelectItem(w,i) TreeView_Select(w,i,TVGN_CARET) #define
     * TreeView_SelectDropTarget(w,i) TreeView_Select(w,i,TVGN_DROPHILITE)
     * #define TreeView_SelectSetFirstVisible(w,i)
     * TreeView_Select(w,i,TVGN_FIRSTVISIBLE) #define TreeView_GetItem(w,i)
     * (BOOL)SNDMSG((w),TVM_GETITEM,0,(LPARAM)(TV_ITEM*)(i)) #define
     * TreeView_SetItem(w,i) (BOOL)SNDMSG((w),TVM_SETITEM,0,(LPARAM)(const
     * TV_ITEM*)(i)) #define TreeView_EditLabel(w,i)
     * (HWND)SNDMSG((w),TVM_EDITLABEL,0,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_GetEditControl(w) (HWND)SNDMSG((w),TVM_GETEDITCONTROL,0,0)
     * #define TreeView_GetVisibleCount(w)
     * (UINT)SNDMSG((w),TVM_GETVISIBLECOUNT,0,0) #define TreeView_HitTest(w,p)
     * (HTREEITEM)SNDMSG((w),TVM_HITTEST,0,(LPARAM)(LPTV_HITTESTINFO)(p))
     * #define TreeView_CreateDragImage(w,i)
     * (HIMAGELIST)SNDMSG((w),TVM_CREATEDRAGIMAGE,0,(LPARAM)(HTREEITEM)(i))
     * #define TreeView_SortChildren(w,i,r)
     * (BOOL)SNDMSG((w),TVM_SORTCHILDREN,r,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_EnsureVisible(w,i)
     * (BOOL)SNDMSG((w),TVM_ENSUREVISIBLE,0,(LPARAM)(HTREEITEM)(i)) #define
     * TreeView_SortChildrenCB(w,s,r)
     * (BOOL)SNDMSG((w),TVM_SORTCHILDRENCB,r,(LPARAM)(LPTVSORTCB)(s)) #define
     * TreeView_EndEditLabelNow(w,f) (BOOL)SNDMSG((w),TVM_ENDEDITLABELNOW,f,0)
     * #define TreeView_GetISearchString(w,s)
     * (BOOL)SNDMSG((w),TVM_GETISEARCHSTRING,0,(LPARAM)s)
     */
}
