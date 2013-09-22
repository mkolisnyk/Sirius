/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IListViewConsts {
    int LVM_FIRST                    = 0x1000;
    int LVM_GETCOLUMNA               = LVM_FIRST + 25;
    int LVM_GETCOLUMNW               = LVM_FIRST + 95;
    int LVM_SETCOLUMNA               = LVM_FIRST + 26;
    int LVM_SETCOLUMNW               = LVM_FIRST + 96;
    int LVM_INSERTCOLUMNA            = LVM_FIRST + 27;
    int LVM_INSERTCOLUMNW            = LVM_FIRST + 97;
    int LVM_DELETECOLUMN             = LVM_FIRST + 28;
    int LVM_GETCOLUMNWIDTH           = LVM_FIRST + 29;
    int LVSCW_AUTOSIZE               = -1;
    int LVSCW_AUTOSIZE_USEHEADER     = -2;
    int LVM_SETCOLUMNWIDTH           = LVM_FIRST + 30;
    int LVM_CREATEDRAGIMAGE          = LVM_FIRST + 33;
    int LVM_GETVIEWRECT              = LVM_FIRST + 34;
    int LVM_GETTEXTCOLOR             = LVM_FIRST + 35;
    int LVM_SETTEXTCOLOR             = LVM_FIRST + 36;
    int LVM_GETTEXTBKCOLOR           = LVM_FIRST + 37;
    int LVM_SETTEXTBKCOLOR           = LVM_FIRST + 38;
    int LVM_GETTOPINDEX              = LVM_FIRST + 39;
    int LVM_GETCOUNTPERPAGE          = LVM_FIRST + 40;
    int LVM_GETORIGIN                = LVM_FIRST + 41;
    int LVM_UPDATE                   = LVM_FIRST + 42;
    int LVM_SETITEMSTATE             = LVM_FIRST + 43;
    int LVM_GETITEMSTATE             = LVM_FIRST + 44;
    int LVM_GETITEMTEXTA             = LVM_FIRST + 45;
    int LVM_GETITEMTEXTW             = LVM_FIRST + 115;
    int LVM_SETITEMTEXTA             = LVM_FIRST + 46;
    int LVM_SETITEMTEXTW             = LVM_FIRST + 116;
    int LVM_SETITEMCOUNT             = LVM_FIRST + 47;
    int LVM_SORTITEMS                = LVM_FIRST + 48;
    int LVM_SETITEMPOSITION32        = LVM_FIRST + 49;
    int LVM_GETSELECTEDCOUNT         = LVM_FIRST + 50;
    int LVM_GETITEMSPACING           = LVM_FIRST + 51;
    int LVM_GETISEARCHSTRINGA        = LVM_FIRST + 52;
    int LVM_GETISEARCHSTRINGW        = LVM_FIRST + 117;
    int LVM_APPROXIMATEVIEWRECT      = LVM_FIRST + 64;
    int LVM_SETEXTENDEDLISTVIEWSTYLE = LVM_FIRST + 54;
    int LVM_GETEXTENDEDLISTVIEWSTYLE = LVM_FIRST + 55;
    int LVM_SETCOLUMNORDERARRAY      = LVM_FIRST + 58;
    int LVM_GETCOLUMNORDERARRAY      = LVM_FIRST + 59;
    int LVM_GETHEADER                = LVM_FIRST + 31;
    int LVM_GETHOTCURSOR             = LVM_FIRST + 63;
    int LVM_GETHOTITEM               = LVM_FIRST + 61;
    int LVM_GETSUBITEMRECT           = LVM_FIRST + 56;
    int LVM_SETHOTCURSOR             = LVM_FIRST + 62;
    int LVM_SETHOTITEM               = LVM_FIRST + 60;
    int LVM_SETICONSPACING           = LVM_FIRST + 53;
    int LVM_SUBITEMHITTEST           = LVM_FIRST + 57;

    int LVN_FIRST                    = Integer.MAX_VALUE - 100;
    int LVN_ITEMCHANGING             = LVN_FIRST;
    int LVN_ITEMCHANGED              = LVN_FIRST - 1;
    int LVN_INSERTITEM               = LVN_FIRST - 2;
    int LVN_DELETEITEM               = LVN_FIRST - 3;
    int LVN_DELETEALLITEMS           = LVN_FIRST - 4;
    int LVN_BEGINLABELEDITA          = LVN_FIRST - 5;
    int LVN_BEGINLABELEDITW          = LVN_FIRST - 75;
    int LVN_ENDLABELEDITA            = LVN_FIRST - 6;
    int LVN_ENDLABELEDITW            = LVN_FIRST - 76;
    int LVN_COLUMNCLICK              = LVN_FIRST - 8;
    int LVN_BEGINDRAG                = LVN_FIRST - 9;
    int LVN_BEGINRDRAG               = LVN_FIRST - 11;
    int LVN_GETDISPINFOA             = LVN_FIRST - 50;
    int LVN_GETDISPINFOW             = LVN_FIRST - 77;
    int LVN_SETDISPINFOA             = LVN_FIRST - 51;
    int LVN_SETDISPINFOW             = LVN_FIRST - 78;
    int LVN_KEYDOWN                  = LVN_FIRST - 55;
    int LVN_MARQUEEBEGIN             = LVN_FIRST - 56;
    int LVN_GETINFOTIPA              = LVN_FIRST - 57;
    int LVN_GETINFOTIPW              = LVN_FIRST - 58;
}
