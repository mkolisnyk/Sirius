/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface ITabControlConsts {
    int TCM_FIRST            = 0x1300;
    int TCM_GETIMAGELIST     = TCM_FIRST + 2;
    int TCM_SETIMAGELIST     = TCM_FIRST + 3;
    int TCM_GETITEMCOUNT     = TCM_FIRST + 4;
    int TCM_GETITEMA         = TCM_FIRST + 5;
    int TCM_GETITEMW         = TCM_FIRST + 60;
    int TCM_SETITEMA         = TCM_FIRST + 6;
    int TCM_SETITEMW         = TCM_FIRST + 61;
    int TCM_INSERTITEMA      = TCM_FIRST + 7;
    int TCM_INSERTITEMW      = TCM_FIRST + 62;
    int TCM_DELETEITEM       = TCM_FIRST + 8;
    int TCM_DELETEALLITEMS   = TCM_FIRST + 9;
    int TCM_GETITEMRECT      = TCM_FIRST + 10;
    int TCM_GETCURSEL        = TCM_FIRST + 11;
    int TCM_SETCURSEL        = TCM_FIRST + 12;
    int TCM_HITTEST          = TCM_FIRST + 13;
    int TCM_SETITEMEXTRA     = TCM_FIRST + 14;

    int TCM_ADJUSTRECT       = TCM_FIRST + 40;
    int TCM_SETITEMSIZE      = TCM_FIRST + 41;
    int TCM_REMOVEIMAGE      = TCM_FIRST + 42;
    int TCM_SETPADDING       = TCM_FIRST + 43;
    int TCM_GETROWCOUNT      = TCM_FIRST + 44;
    int TCM_GETTOOLTIPS      = TCM_FIRST + 45;
    int TCM_SETTOOLTIPS      = TCM_FIRST + 46;
    int TCM_GETCURFOCUS      = TCM_FIRST + 47;
    int TCM_SETCURFOCUS      = TCM_FIRST + 48;
    int TCM_SETMINTABWIDTH   = TCM_FIRST + 49;
    int TCM_DESELECTALL      = TCM_FIRST + 50;
    int TCM_HIGHLIGHTITEM    = TCM_FIRST + 51;
    int TCM_SETEXTENDEDSTYLE = TCM_FIRST + 52;
    int TCM_GETEXTENDEDSTYLE = TCM_FIRST + 53;

    int CCM_SETUNICODEFORMAT = 8197;
    int CCM_GETUNICODEFORMAT = 8198;

    int TCM_SETUNICODEFORMAT = CCM_SETUNICODEFORMAT;
    int TCM_GETUNICODEFORMAT = CCM_GETUNICODEFORMAT;

    int TCIF_TEXT            = 1;
    int TCIF_IMAGE           = 2;
    int TCIF_RTLREADING      = 4;
    int TCIF_PARAM           = 8;
    int TCIF_STATE           = 16;

    int TCN_FIRST            = Integer.MAX_VALUE - 550;
    int TCN_KEYDOWN          = TCN_FIRST;
    int TCN_SELCHANGE        = TCN_FIRST - 1;
    int TCN_SELCHANGING      = TCN_FIRST - 2;
}
