/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IMenuFlag {

	public final long MF_BYCOMMAND = 0x00000000L;
	public final long MF_BYPOSITION = 0x00000400L;

	public final int MIIM_BITMAP = 0x00000080;
	public final int MIIM_CHECKMARKS = 0x00000008;
	public final int MIIM_DATA = 0x00000020;
	public final int MIIM_FTYPE = 0x00000100;
	public final int MIIM_ID = 0x00000002;
	public final int MIIM_STATE = 0x00000001;
	public final int MIIM_STRING = 0x00000040;
	public final int MIIM_SUBMENU = 0x00000004;
	public final int MIIM_TYPE = 0x00000010;

	public final long MFT_BITMAP = 0x00000004L;
	public final long MFT_MENUBARBREAK = 0x00000020L;
	public final long MFT_MENUBREAK = 0x00000040L;
	public final long MFT_OWNERDRAW = 0x00000100L;
	public final long MFT_RADIOCHECK = 0x00000200L;
	public final long MFT_RIGHTJUSTIFY = 0x00004000L;
	public final long MFT_RIGHTORDER = 0x00002000L;
	public final long MFT_SEPARATOR = 0x00000800L;
	public final long MFT_STRING = 0x00000000L;

	public final long MFS_CHECKED = 0x00000008L;
	public final long MFS_DEFAULT = 0x00001000L;
	public final long MFS_DISABLED = 0x00000003L;
	public final long MFS_ENABLED = 0x00000000L;
	public final long MFS_GRAYED = 0x00000003L;
	public final long MFS_HILITE = 0x00000080L;
	public final long MFS_UNCHECKED = 0x00000000L;
	public final long MFS_UNHILITE = 0x00000000L;
}
