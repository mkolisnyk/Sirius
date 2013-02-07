/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 *
 */
public interface IListViewConsts {
	public final int LVM_FIRST = 0x1000;
	public final int LVM_GETCOLUMNA = (LVM_FIRST+25);
	public final int LVM_GETCOLUMNW = (LVM_FIRST+95);
	public final int LVM_SETCOLUMNA = (LVM_FIRST+26);
	public final int LVM_SETCOLUMNW = (LVM_FIRST+96);
	public final int LVM_INSERTCOLUMNA = (LVM_FIRST+27);
	public final int LVM_INSERTCOLUMNW = (LVM_FIRST+97);
	public final int LVM_DELETECOLUMN = (LVM_FIRST+28);
	public final int LVM_GETCOLUMNWIDTH = (LVM_FIRST+29);
	public final int LVSCW_AUTOSIZE = (-1);
	public final int LVSCW_AUTOSIZE_USEHEADER = (-2);
	public final int LVM_SETCOLUMNWIDTH = (LVM_FIRST+30);
	public final int LVM_CREATEDRAGIMAGE = (LVM_FIRST+33);
	public final int LVM_GETVIEWRECT = (LVM_FIRST+34);
	public final int LVM_GETTEXTCOLOR = (LVM_FIRST+35);
	public final int LVM_SETTEXTCOLOR = (LVM_FIRST+36);
	public final int LVM_GETTEXTBKCOLOR = (LVM_FIRST+37);
	public final int LVM_SETTEXTBKCOLOR = (LVM_FIRST+38);
	public final int LVM_GETTOPINDEX = (LVM_FIRST+39);
	public final int LVM_GETCOUNTPERPAGE = (LVM_FIRST+40);
	public final int LVM_GETORIGIN = (LVM_FIRST+41);
	public final int LVM_UPDATE = (LVM_FIRST+42);
	public final int LVM_SETITEMSTATE = (LVM_FIRST+43);
	public final int LVM_GETITEMSTATE = (LVM_FIRST+44);
	public final int LVM_GETITEMTEXTA = (LVM_FIRST+45);
	public final int LVM_GETITEMTEXTW = (LVM_FIRST+115);
	public final int LVM_SETITEMTEXTA = (LVM_FIRST+46);
	public final int LVM_SETITEMTEXTW = (LVM_FIRST+116);
	public final int LVM_SETITEMCOUNT = (LVM_FIRST+47);
	public final int LVM_SORTITEMS = (LVM_FIRST+48);
	public final int LVM_SETITEMPOSITION32 = (LVM_FIRST+49);
	public final int LVM_GETSELECTEDCOUNT = (LVM_FIRST+50);
	public final int LVM_GETITEMSPACING = (LVM_FIRST+51);
	public final int LVM_GETISEARCHSTRINGA = (LVM_FIRST+52);
	public final int LVM_GETISEARCHSTRINGW = (LVM_FIRST+117);
	public final int LVM_APPROXIMATEVIEWRECT = (LVM_FIRST+64);
	public final int LVM_SETEXTENDEDLISTVIEWSTYLE = (LVM_FIRST+54);
	public final int LVM_GETEXTENDEDLISTVIEWSTYLE = (LVM_FIRST+55);
	public final int LVM_SETCOLUMNORDERARRAY = (LVM_FIRST+58);
	public final int LVM_GETCOLUMNORDERARRAY = (LVM_FIRST+59);
	public final int LVM_GETHEADER = (LVM_FIRST+31);
	public final int LVM_GETHOTCURSOR = (LVM_FIRST+63);
	public final int LVM_GETHOTITEM = (LVM_FIRST+61);
	public final int LVM_GETSUBITEMRECT = (LVM_FIRST+56);
	public final int LVM_SETHOTCURSOR = (LVM_FIRST+62);
	public final int LVM_SETHOTITEM = (LVM_FIRST+60);
	public final int LVM_SETICONSPACING = (LVM_FIRST+53);
	public final int LVM_SUBITEMHITTEST = (LVM_FIRST+57);
	
	public final int LVN_FIRST	= Integer.MAX_VALUE -100;
	public final int LVN_ITEMCHANGING = LVN_FIRST;
	public final int LVN_ITEMCHANGED = (LVN_FIRST-1);
	public final int LVN_INSERTITEM = (LVN_FIRST-2);
	public final int LVN_DELETEITEM = (LVN_FIRST-3);
	public final int LVN_DELETEALLITEMS = (LVN_FIRST-4);
	public final int LVN_BEGINLABELEDITA = (LVN_FIRST-5);
	public final int LVN_BEGINLABELEDITW = (LVN_FIRST-75);
	public final int LVN_ENDLABELEDITA = (LVN_FIRST-6);
	public final int LVN_ENDLABELEDITW = (LVN_FIRST-76);
	public final int LVN_COLUMNCLICK = (LVN_FIRST-8);
	public final int LVN_BEGINDRAG = (LVN_FIRST-9);
	public final int LVN_BEGINRDRAG = (LVN_FIRST-11);
	public final int LVN_GETDISPINFOA = (LVN_FIRST-50);
	public final int LVN_GETDISPINFOW = (LVN_FIRST-77);
	public final int LVN_SETDISPINFOA = (LVN_FIRST-51);
	public final int LVN_SETDISPINFOW = (LVN_FIRST-78);
	public final int LVN_KEYDOWN = (LVN_FIRST-55);
	public final int LVN_MARQUEEBEGIN = (LVN_FIRST-56);
	public final int LVN_GETINFOTIPA = (LVN_FIRST-57);
	public final int LVN_GETINFOTIPW = (LVN_FIRST-58);
}
