/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 *
 */
public interface ITreeViewConsts {
	public final int TV_FIRST = 0x1100;
	
	public final int TVM_INSERTITEMA = TV_FIRST;
	public final int TVM_INSERTITEMW = (TV_FIRST+50);
	public final int TVM_DELETEITEM = (TV_FIRST+1);
	public final int TVM_EXPAND = (TV_FIRST+2);
	public final int TVM_GETITEMRECT = (TV_FIRST+4);
	public final int TVM_GETCOUNT = (TV_FIRST+5);
	public final int TVM_GETINDENT = (TV_FIRST+6);
	public final int TVM_SETINDENT = (TV_FIRST+7);
	public final int TVM_GETIMAGELIST = (TV_FIRST+8);
	public final int TVM_SETIMAGELIST = (TV_FIRST+9);
	public final int TVM_GETNEXTITEM = (TV_FIRST+10);
	public final int TVM_SELECTITEM = (TV_FIRST+11);
	public final int TVM_GETITEMA = (TV_FIRST+12);
	public final int TVM_GETITEMW = (TV_FIRST+62);
	public final int TVM_SETITEMA = (TV_FIRST+13);
	public final int TVM_SETITEMW = (TV_FIRST+63);
	public final int TVM_EDITLABELA = (TV_FIRST+14);
	public final int TVM_EDITLABELW = (TV_FIRST+65);
	public final int TVM_GETEDITCONTROL = (TV_FIRST+15);
	public final int TVM_GETVISIBLECOUNT = (TV_FIRST+16);
	public final int TVM_HITTEST = (TV_FIRST+17);
	public final int TVM_CREATEDRAGIMAGE = (TV_FIRST+18);
	public final int TVM_SORTCHILDREN = (TV_FIRST+19);
	public final int TVM_ENSUREVISIBLE = (TV_FIRST+20);
	public final int TVM_SORTCHILDRENCB = (TV_FIRST+21);
	public final int TVM_ENDEDITLABELNOW = (TV_FIRST+22);
	public final int TVM_GETISEARCHSTRINGA = (TV_FIRST+23);
	public final int TVM_GETISEARCHSTRINGW = (TV_FIRST+64);
	public final int TVM_GETTOOLTIPS = (TV_FIRST+25);
	public final int TVM_SETTOOLTIPS = (TV_FIRST+24);
	public final int TVM_GETBKCOLOR = (TV_FIRST+31);
	public final int TVM_GETINSERTMARKCOLOR = (TV_FIRST+38);
	public final int TVM_GETITEMHEIGHT = (TV_FIRST+28);
	public final int TVM_GETSCROLLTIME = (TV_FIRST+34);
	public final int TVM_GETTEXTCOLOR = (TV_FIRST+32);
	public final int TVM_SETBKCOLOR = (TV_FIRST+29);
	public final int TVM_SETINSERTMARK = (TV_FIRST+26);
	public final int TVM_SETINSERTMARKCOLOR = (TV_FIRST+37);
	public final int TVM_SETITEMHEIGHT = (TV_FIRST+27);
	public final int TVM_SETSCROLLTIME = (TV_FIRST+33);
	public final int TVM_SETTEXTCOLOR = (TV_FIRST+30);
	public final int TVM_GETITEMSTATE = (TV_FIRST+39);
	public final int TVM_SETLINECOLOR = (TV_FIRST+40);
	public final int TVM_GETLINECOLOR = (TV_FIRST+41);
}
