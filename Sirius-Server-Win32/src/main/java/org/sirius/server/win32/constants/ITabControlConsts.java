/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 *
 */
public interface ITabControlConsts {
	public final int TCM_FIRST = 0x1300;
	public final int TCM_GETIMAGELIST = (TCM_FIRST+2);
	public final int TCM_SETIMAGELIST = (TCM_FIRST+3);
	public final int TCM_GETITEMCOUNT = (TCM_FIRST+4);
	public final int TCM_GETITEMA = (TCM_FIRST+5);
	public final int TCM_GETITEMW = (TCM_FIRST+60);
	public final int TCM_SETITEMA = (TCM_FIRST+6);
	public final int TCM_SETITEMW = (TCM_FIRST+61);
	public final int TCM_INSERTITEMA = (TCM_FIRST+7);
	public final int TCM_INSERTITEMW = (TCM_FIRST+62);
	public final int TCM_DELETEITEM = (TCM_FIRST+8);
	public final int TCM_DELETEALLITEMS = (TCM_FIRST+9);
	public final int TCM_GETITEMRECT = (TCM_FIRST+10);
	public final int TCM_GETCURSEL = (TCM_FIRST+11);
	public final int TCM_SETCURSEL = (TCM_FIRST+12);
	public final int TCM_HITTEST = (TCM_FIRST+13);
	public final int TCM_SETITEMEXTRA = (TCM_FIRST+14);

	public final int TCM_ADJUSTRECT = (TCM_FIRST+40);
	public final int TCM_SETITEMSIZE = (TCM_FIRST+41);
	public final int TCM_REMOVEIMAGE = (TCM_FIRST+42);
	public final int TCM_SETPADDING = (TCM_FIRST+43);
	public final int TCM_GETROWCOUNT = (TCM_FIRST+44);
	public final int TCM_GETTOOLTIPS = (TCM_FIRST+45);
	public final int TCM_SETTOOLTIPS = (TCM_FIRST+46);
	public final int TCM_GETCURFOCUS = (TCM_FIRST+47);
	public final int TCM_SETCURFOCUS = (TCM_FIRST+48);
	public final int TCM_SETMINTABWIDTH = (TCM_FIRST + 49);
	public final int TCM_DESELECTALL = (TCM_FIRST + 50);
	public final int TCM_HIGHLIGHTITEM = (TCM_FIRST + 51);
	public final int TCM_SETEXTENDEDSTYLE = (TCM_FIRST + 52);
	public final int TCM_GETEXTENDEDSTYLE = (TCM_FIRST + 53);
	
	public final int CCM_SETUNICODEFORMAT = 8197;
	public final int CCM_GETUNICODEFORMAT = 8198;

	
	public final int TCM_SETUNICODEFORMAT = CCM_SETUNICODEFORMAT;
	public final int TCM_GETUNICODEFORMAT = CCM_GETUNICODEFORMAT;
	
	public final int TCIF_TEXT = 1;
	public final int TCIF_IMAGE = 2;
	public final int TCIF_RTLREADING = 4;
	public final int TCIF_PARAM = 8;
	public final int TCIF_STATE = 16;
	
	public final int TCN_FIRST = Integer.MAX_VALUE -550;
	public final int TCN_KEYDOWN=TCN_FIRST;
	public final int TCN_SELCHANGE=(TCN_FIRST-1);
	public final int TCN_SELCHANGING=(TCN_FIRST-2);
}
