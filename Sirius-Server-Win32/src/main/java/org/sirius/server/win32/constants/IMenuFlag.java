/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IMenuFlag {

    long MF_BYCOMMAND     = 0x00000000L;
    long MF_BYPOSITION    = 0x00000400L;

    int  MIIM_BITMAP      = 0x00000080;
    int  MIIM_CHECKMARKS  = 0x00000008;
    int  MIIM_DATA        = 0x00000020;
    int  MIIM_FTYPE       = 0x00000100;
    int  MIIM_ID          = 0x00000002;
    int  MIIM_STATE       = 0x00000001;
    int  MIIM_STRING      = 0x00000040;
    int  MIIM_SUBMENU     = 0x00000004;
    int  MIIM_TYPE        = 0x00000010;

    long MFT_BITMAP       = 0x00000004L;
    long MFT_MENUBARBREAK = 0x00000020L;
    long MFT_MENUBREAK    = 0x00000040L;
    long MFT_OWNERDRAW    = 0x00000100L;
    long MFT_RADIOCHECK   = 0x00000200L;
    long MFT_RIGHTJUSTIFY = 0x00004000L;
    long MFT_RIGHTORDER   = 0x00002000L;
    long MFT_SEPARATOR    = 0x00000800L;
    long MFT_STRING       = 0x00000000L;

    long MFS_CHECKED      = 0x00000008L;
    long MFS_DEFAULT      = 0x00001000L;
    long MFS_DISABLED     = 0x00000003L;
    long MFS_ENABLED      = 0x00000000L;
    long MFS_GRAYED       = 0x00000003L;
    long MFS_HILITE       = 0x00000080L;
    long MFS_UNCHECKED    = 0x00000000L;
    long MFS_UNHILITE     = 0x00000000L;
}
