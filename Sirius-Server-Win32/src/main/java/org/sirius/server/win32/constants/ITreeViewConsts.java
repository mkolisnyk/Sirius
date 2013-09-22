/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface ITreeViewConsts {
    int TV_FIRST               = 0x1100;

    int TVM_INSERTITEMA        = TV_FIRST;
    int TVM_INSERTITEMW        = TV_FIRST + 50;
    int TVM_DELETEITEM         = TV_FIRST + 1;
    int TVM_EXPAND             = TV_FIRST + 2;
    int TVM_GETITEMRECT        = TV_FIRST + 4;
    int TVM_GETCOUNT           = TV_FIRST + 5;
    int TVM_GETINDENT          = TV_FIRST + 6;
    int TVM_SETINDENT          = TV_FIRST + 7;
    int TVM_GETIMAGELIST       = TV_FIRST + 8;
    int TVM_SETIMAGELIST       = TV_FIRST + 9;
    int TVM_GETNEXTITEM        = TV_FIRST + 10;
    int TVM_SELECTITEM         = TV_FIRST + 11;
    int TVM_GETITEMA           = TV_FIRST + 12;
    int TVM_GETITEMW           = TV_FIRST + 62;
    int TVM_SETITEMA           = TV_FIRST + 13;
    int TVM_SETITEMW           = TV_FIRST + 63;
    int TVM_EDITLABELA         = TV_FIRST + 14;
    int TVM_EDITLABELW         = TV_FIRST + 65;
    int TVM_GETEDITCONTROL     = TV_FIRST + 15;
    int TVM_GETVISIBLECOUNT    = TV_FIRST + 16;
    int TVM_HITTEST            = TV_FIRST + 17;
    int TVM_CREATEDRAGIMAGE    = TV_FIRST + 18;
    int TVM_SORTCHILDREN       = TV_FIRST + 19;
    int TVM_ENSUREVISIBLE      = TV_FIRST + 20;
    int TVM_SORTCHILDRENCB     = TV_FIRST + 21;
    int TVM_ENDEDITLABELNOW    = TV_FIRST + 22;
    int TVM_GETISEARCHSTRINGA  = TV_FIRST + 23;
    int TVM_GETISEARCHSTRINGW  = TV_FIRST + 64;
    int TVM_GETTOOLTIPS        = TV_FIRST + 25;
    int TVM_SETTOOLTIPS        = TV_FIRST + 24;
    int TVM_GETBKCOLOR         = TV_FIRST + 31;
    int TVM_GETINSERTMARKCOLOR = TV_FIRST + 38;
    int TVM_GETITEMHEIGHT      = TV_FIRST + 28;
    int TVM_GETSCROLLTIME      = TV_FIRST + 34;
    int TVM_GETTEXTCOLOR       = TV_FIRST + 32;
    int TVM_SETBKCOLOR         = TV_FIRST + 29;
    int TVM_SETINSERTMARK      = TV_FIRST + 26;
    int TVM_SETINSERTMARKCOLOR = TV_FIRST + 37;
    int TVM_SETITEMHEIGHT      = TV_FIRST + 27;
    int TVM_SETSCROLLTIME      = TV_FIRST + 33;
    int TVM_SETTEXTCOLOR       = TV_FIRST + 30;
    int TVM_GETITEMSTATE       = TV_FIRST + 39;
    int TVM_SETLINECOLOR       = TV_FIRST + 40;
    int TVM_GETLINECOLOR       = TV_FIRST + 41;
}
