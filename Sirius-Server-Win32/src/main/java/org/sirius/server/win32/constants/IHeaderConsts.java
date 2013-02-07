/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IHeaderConsts {

	public final int HDM_FIRST = 0x1200;
	public final int HDM_GETITEMCOUNT = HDM_FIRST;
	public final int HDM_INSERTITEMA = (HDM_FIRST + 1);
	public final int HDM_INSERTITEMW = (HDM_FIRST + 10);
	public final int HDM_DELETEITEM = (HDM_FIRST + 2);
	public final int HDM_GETITEMA = (HDM_FIRST + 3);
	public final int HDM_GETITEMW = (HDM_FIRST + 11);
	public final int HDM_SETITEMA = (HDM_FIRST + 4);
	public final int HDM_SETITEMW = (HDM_FIRST + 12);
	public final int HDM_LAYOUT = (HDM_FIRST + 5);
}
