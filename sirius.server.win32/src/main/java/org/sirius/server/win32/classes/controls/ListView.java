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
public class ListView {

    /**
	 * 
	 */
    public ListView() {
        // TODO Auto-generated constructor stub
    }

    /*
     * #define ListView_GetBkColor(w) (COLORREF)SNDMSG((w),LVM_GETBKCOLOR,0,0)
     * #define ListView_GetImageList(w,i)
     * (HIMAGELIST)SNDMSG((w),LVM_GETIMAGELIST,(i),0) #define
     * ListView_GetItemCount(w) (int)SNDMSG((w),LVM_GETITEMCOUNT,0,0) #define
     * ListView_GetItem(w,i) (BOOL)SNDMSG((w),LVM_GETITEM,0,(LPARAM)(i)) #define
     * ListView_SetBkColor(w,c) (BOOL)SNDMSG((w),LVM_SETBKCOLOR,0,(LPARAM)c)
     * #define ListView_SetImageList(w,h,i)
     * (HIMAGELIST)(UINT)SNDMSG((w),LVM_SETIMAGELIST,(i),(LPARAM)(h)) #define
     * ListView_SetItem(w,i) (BOOL)SNDMSG((w),LVM_SETITEM,0,(LPARAM)(const
     * LV_ITEM*)(i)) #define ListView_InsertItem(w,i)
     * (int)SNDMSG((w),LVM_INSERTITEM,0,(LPARAM)(const LV_ITEM*)(i)) #define
     * ListView_DeleteItem(w,i) (BOOL)SNDMSG((w),LVM_DELETEITEM,i,0) #define
     * ListView_DeleteAllItems(w) (BOOL)SNDMSG((w),LVM_DELETEALLITEMS,0,0)
     * #define ListView_GetCallbackMask(w)
     * (UINT)SNDMSG((w),LVM_GETCALLBACKMASK,0,0) #define
     * ListView_SetCallbackMask(w,m) (BOOL)SNDMSG((w),LVM_SETCALLBACKMASK,m,0)
     * #define ListView_GetNextItem(w,i,f)
     * (int)SNDMSG((w),LVM_GETNEXTITEM,i,MAKELPARAM((f),0)) #define
     * ListView_FindItem(w,i,p) (int)SNDMSG((w),
     * LVM_FINDITEM,(WPARAM)i,(LPARAM)(const LV_FINDINFO*)(p)) #define
     * ListView_GetItemRect(w,i,p,c)
     * (BOOL)SNDMSG((w),LVM_GETITEMRECT,i,((p)?(((LPRECT
     * )(p))->left=(c),(LPARAM)(LPRECT)(p)):0)) #define
     * ListView_SetItemPosition(w,i,x,y)
     * (BOOL)SNDMSG((w),LVM_SETITEMPOSITION,i,MAKELPARAM(x,y)) #define
     * ListView_GetItemPosition(w,i,p)
     * (BOOL)SNDMSG((w),LVM_GETITEMPOSITION,i,(LPARAM)p) #define
     * ListView_GetItemSpacing(w,f) (DWORD)SNDMSG((w),LVM_GETITEMSPACING,f,0)
     * #define ListView_GetStringWidth(w,s)
     * (int)SNDMSG((w),LVM_GETSTRINGWIDTH,0,(LPARAM)s) #define
     * ListView_HitTest(w,p)
     * (int)SNDMSG((w),LVM_HITTEST,0,(LPARAM)(LV_HITTESTINFO*)(p)) #define
     * ListView_EnsureVisible(w,i,f)
     * (BOOL)SNDMSG((w),LVM_ENSUREVISIBLE,i,MAKELPARAM((f),0)) #define
     * ListView_Scroll(w,x,y) (BOOL)SNDMSG((w),LVM_SCROLL,x,y) #define
     * ListView_RedrawItems(w,f,l) (BOOL)SNDMSG((w),LVM_REDRAWITEMS,f,l) #define
     * ListView_Arrange(w,c) (BOOL)SNDMSG((w),LVM_ARRANGE,c,0) #define
     * ListView_EditLabel(w,i) (HWND)SNDMSG((w),LVM_EDITLABEL,i,0) #define
     * ListView_GetEditControl(w) (HWND)SNDMSG((w),LVM_GETEDITCONTROL,0,0)
     * #define ListView_GetColumn(w,i,p)
     * (BOOL)SNDMSG((w),LVM_GETCOLUMN,i,(LPARAM)(LV_COLUMN*)(p)) #define
     * ListView_SetColumn(w,i,p) (BOOL)SNDMSG((w),LVM_SETCOLUMN,i,(LPARAM)(const
     * LV_COLUMN*)(p)) #define ListView_InsertColumn(w,i,p)
     * (int)SNDMSG((w),LVM_INSERTCOLUMN,i,(LPARAM)(const LV_COLUMN*)(p)) #define
     * ListView_DeleteColumn(w,i) (BOOL)SNDMSG((w),LVM_DELETECOLUMN,i,0) #define
     * ListView_GetColumnWidth(w,i) (int)SNDMSG((w),LVM_GETCOLUMNWIDTH,i,0)
     * #define ListView_SetColumnWidth(w,i,x)
     * (BOOL)SNDMSG((w),LVM_SETCOLUMNWIDTH,i,MAKELPARAM((x),0)) #define
     * ListView_CreateDragImage(w,i,p)
     * (HIMAGELIST)SNDMSG((w),LVM_CREATEDRAGIMAGE,i,(LPARAM)(LPPOINT)(p))
     * #define ListView_GetViewRect(w,p)
     * (BOOL)SNDMSG((w),LVM_GETVIEWRECT,0,(LPARAM)(LPRECT)(p)) #define
     * ListView_GetTextColor(w) (COLORREF)SNDMSG((w),LVM_GETTEXTCOLOR,0,0)
     * #define ListView_SetTextColor(w,c)
     * (BOOL)SNDMSG((w),LVM_SETTEXTCOLOR,0,(LPARAM)(COLORREF)(c)) #define
     * ListView_GetTextBkColor(w) (COLORREF)SNDMSG((w),LVM_GETTEXTBKCOLOR,0,0)
     * #define ListView_SetTextBkColor(w,c)
     * (BOOL)SNDMSG((w),LVM_SETTEXTBKCOLOR,0,(LPARAM)(COLORREF)(c)) #define
     * ListView_GetTopIndex(w) (int)SNDMSG((w),LVM_GETTOPINDEX,0,0) #define
     * ListView_GetCountPerPage(w) (int)SNDMSG((w),LVM_GETCOUNTPERPAGE,0,0)
     * #define ListView_GetOrigin(w,p)
     * (BOOL)SNDMSG((w),LVM_GETORIGIN,0,(LPARAM)(POINT*)(p)) #define
     * ListView_GetOrigin(w,p)
     * (BOOL)SNDMSG((w),LVM_GETORIGIN,0,(LPARAM)(POINT*)(p)) #define
     * ListView_Update(w,i) (BOOL)SNDMSG((w),LVM_UPDATE,(WPARAM)(i),0) #define
     * ListView_SetItemState(w,i,d,m) \ { \ LV_ITEM _lvi;\ _lvi.stateMask=m;\
     * _lvi.state=d;\ SNDMSG((w),LVM_SETITEMSTATE,i,(LPARAM)(LV_ITEM*)&_lvi);\ }
     * #define ListView_GetItemState(w,i,m)
     * (UINT)SNDMSG((w),LVM_GETITEMSTATE,i,m) #define
     * ListView_GetItemText(w,i,iS,s,n) \ { \ LV_ITEM _lvi;\ _lvi.iSubItem=iS;\
     * _lvi.cchTextMax=n;\ _lvi.pszText=s;\
     * SNDMSG((w),LVM_GETITEMTEXT,i,(LPARAM)(LV_ITEM*)&_lvi);\ } #define
     * ListView_SetItemText(w,i,iS,s) \ { \ LV_ITEM _lvi;\ _lvi.iSubItem=iS;\
     * _lvi.pszText=s;\ SNDMSG((w),LVM_SETITEMTEXT,i,(LPARAM)(LV_ITEM*)&_lvi);\
     * } #define ListView_SetItemCount(w,n)
     * (void)SNDMSG((w),LVM_SETITEMCOUNT,n,0) #define ListView_SortItems(w,f,l)
     * (BOOL)SNDMSG((w),LVM_SORTITEMS,l,(LPARAM)f) #define
     * ListView_SetItemPosition32(w,i,x,y) \ { \ POINT p={x,y}; \
     * SNDMSG((w),LVM_SETITEMPOSITION32,i,(LPARAM)&p);\ } #define
     * ListView_GetSelectedCount(w) (UINT)SNDMSG((w),LVM_GETSELECTEDCOUNT,0,0)
     * #define ListView_GetCheckState(w,i)
     * ((((UINT)(SNDMSG((w),LVM_GETITEMSTATE,
     * (WPARAM)(i),LVIS_STATEIMAGEMASK)))>>12)-1) #define
     * ListView_SetCheckState(w,i,f)
     * ListView_SetItemState(w,i,INDEXTOSTATEIMAGEMASK
     * ((f)+1),LVIS_STATEIMAGEMASK) #define ListView_GetISearchString(w,lpsz)
     * (BOOL)SNDMSG((w),LVM_GETISEARCHSTRING,0,(LPARAM)(LPTSTR)(lpsz)) #define
     * ListView_CancelEditLabel(w) (VOID)SNDMSG((w),LVM_CANCELEDITLABEL,0,0)
     * #define ListView_EnableGroupView(w,i)
     * (int)SNDMSG((w),LVM_ENABLEGROUPVIEW,(WPARAM)(i),0) #define
     * ListView_GetGroupInfo(w,i,p)
     * (int)SNDMSG((w),LVM_GETGROUPINFO,(WPARAM)(i),(LPARAM)(p)) #define
     * ListView_GetGroupMetrics(w,p)
     * SNDMSG((w),LVM_GETGROUPMETRICS,0,(LPARAM)(p)) #define
     * ListView_GetInsertMark(w,p)
     * (BOOL)SNDMSG((w),LVM_GETINSERTMARK,0,(LPARAM)(p)) #define
     * ListView_GetInsertMarkColor(w)
     * (COLORREF)SNDMSG((w),LVM_GETINSERTMARKCOLOR,0,0) #define
     * ListView_GetInsertMarkRect(w,p)
     * (int)SNDMSG((w),LVM_GETINSERTMARKRECT,0,(LPARAM)(p)) #define
     * ListView_GetOutlineColor(w) (COLORREF)SNDMSG((w),LVM_GETOUTLINECOLOR,0,0)
     * #define ListView_GetSelectedColumn(w)
     * (UINT)SNDMSG((w),LVM_GETSELECTEDCOLUMN,0,0) #define
     * ListView_GetTileInfo(w,p) SNDMSG((w),LVM_GETTILEINFO,0,(LPARAM)(p))
     * #define ListView_GetTileViewInfo(w,p)
     * SNDMSG((w),LVM_GETTILEVIEWINFO,0,(LPARAM)(p)) #define ListView_GetView(w)
     * (DWORD)SNDMSG((w),LVM_GETVIEW,0,0) #define ListView_HasGroup(w,i)
     * (BOOL)SNDMSG((w),LVM_HASGROUP,(WPARAM)(i),0) #define
     * ListView_InsertGroup(w,i,p)
     * (int)SNDMSG((w),LVM_INSERTGROUP,(WPARAM)(i),(LPARAM)(p)) #define
     * ListView_InsertGroupSorted(w,p)
     * SNDMSG((w),LVM_INSERTGROUPSORTED,(WPARAM)(p),0) #define
     * ListView_InsertMarkHitTest(w,p,t)
     * (BOOL)SNDMSG((w),LVM_INSERTMARKHITTEST,(WPARAM)(p),(LPARAM)(t)) #define
     * ListView_IsGroupViewEnabled(w)
     * (BOOL)SNDMSG((w),LVM_ISGROUPVIEWENABLED,0,0) #define
     * ListView_MapIDToIndex(w,i)
     * (UINT)SNDMSG((w),LVM_MAPIDTOINDEX,(WPARAM)(i),0) #define
     * ListView_MoveGroup(w,i,t)
     * SNDMSG((w),LVM_MOVEGROUP,(WPARAM)(i),(LPARAM)(t)) #define
     * ListView_RemoveAllGroups(w) SNDMSG((w),LVM_REMOVEALLGROUPS,0,0) #define
     * ListView_RemoveGroup(w,i) (int)SNDMSG((w),LVM_REMOVEGROUP,(WPARAM)(i),0)
     * #define ListView_SetGroupInfo(w,i,p)
     * (int)SNDMSG((w),LVM_SETGROUPINFO,(WPARAM)(i),(LPARAM)(p)) #define
     * ListView_SetGroupMetrics(w,p)
     * SNDMSG((w),LVM_SETGROUPMETRICS,0,(LPARAM)(p)) #define
     * ListView_SetInfoTip(w,p) (BOOL)SNDMSG((w),LVM_SETINFOTIP,0,(LPARAM)(p))
     * #define ListView_SetInsertMark(w,p)
     * (BOOL)SNDMSG((w),LVM_SETINSERTMARK,0,(LPARAM)(p)) #define
     * ListView_SetInsertMarkColor(w,c)
     * (COLORREF)SNDMSG((w),LVM_SETINSERTMARKCOLOR,0,(LPARAM)(c)) #define
     * ListView_SetOutlineColor(w,c)
     * (COLORREF)SNDMSG((w),LVM_SETOUTLINECOLOR,0,(LPARAM)(c)) #if (_WIN32_WINNT
     * >= 0x0501) #define ListView_SetSelectedColumn(w,i)
     * SNDMSG((w),LVM_SETSELECTEDCOLUMN,(WPARAM)i,0) #endif #define
     * ListView_SetTileInfo(w,p) (BOOL)SNDMSG((w),LVM_SETTILEINFO,0,(LPARAM)(p))
     * #define ListView_SetTileViewInfo(w,p)
     * (BOOL)SNDMSG((w),LVM_SETTILEVIEWINFO,0,(LPARAM)(p)) #define
     * ListView_SetView(w,i) (int)SNDMSG((w),LVM_SETVIEW,(WPARAM)(i),0) #define
     * ListView_SortGroups(w,c,p)
     * (int)SNDMSG((w),LVM_SORTGROUPS,(WPARAM)(c),(LPARAM)(p)) #define
     * ListView_SortItemsEx(w,c,p)
     * (BOOL)SNDMSG((w),LVM_SORTITEMSEX,(WPARAM)(p),(LPARAM)(c))
     * 
     * #define ListView_ApproximateViewRect(w,iw,ih,i)
     * (DWORD)SNDMSG((w),LVM_APPROXIMATEVIEWRECT,(i),MAKELPARAM((iw),(ih)))
     * #define ListView_SetExtendedListViewStyle(w,s)
     * (DWORD)SNDMSG((w),LVM_SETEXTENDEDLISTVIEWSTYLE,0,(s)) #define
     * ListView_GetExtendedListViewStyle(w)
     * (DWORD)SNDMSG((w),LVM_GETEXTENDEDLISTVIEWSTYLE,0,0) #define
     * ListView_SetColumnOrderArray(w,i,a)
     * (BOOL)SNDMSG((w),LVM_SETCOLUMNORDERARRAY,(WPARAM)(i),(LPARAM)(LPINT)(a))
     * #define ListView_GetColumnOrderArray(w,i,a)
     * (BOOL)SNDMSG((w),LVM_GETCOLUMNORDERARRAY,(WPARAM)(i),(LPARAM)(LPINT)(a))
     * #define ListView_GetHeader(w) (HWND)SNDMSG((w),LVM_GETHEADER,0,0) #define
     * ListView_GetHotCursor(w) (HCURSOR)SNDMSG((w),LVM_GETHOTCURSOR,0,0)
     * #define ListView_GetHotItem(w) (INT)SNDMSG((w),LVM_GETHOTITEM,0,0)
     * #define ListView_GetSubItemRect(w,i,is,c,p)
     * (BOOL)SNDMSG((w),LVM_GETSUBITEMRECT
     * ,(WPARAM)(int)(i),((p)?(((LPRECT)(p))->
     * left=(c),(((LPRECT)(p))->top=(is)),(LPARAM)(LPRECT)(p)):0)) #define
     * ListView_SetHotCursor(w,c)
     * (HCURSOR)SNDMSG((w),LVM_SETHOTCURSOR,0,(LPARAM)(c)) #define
     * ListView_SetHotItem(w,i) (int)SNDMSG((w),LVM_SETHOTITEM,(WPARAM)(i),0)
     * #define ListView_SetIconSpacing(w,x,y)
     * (DWORD)SNDMSG((w),LVM_SETICONSPACING,0,MAKELONG(x,y)) #define
     * ListView_SubItemHitTest(w,p)
     * (INT)SNDMSG((w),LVM_SUBITEMHITTEST,0,(LPARAM)(LPLVHITTESTINFO)(p))
     * #define ListView_SetItemCountEx(w,i,f)
     * (void)SNDMSG((w),LVM_SETITEMCOUNT,(WPARAM)(i),(LPARAM)(f))
     */
}
