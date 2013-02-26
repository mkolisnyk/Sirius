/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 *
 */
public interface IPageConsts {
	public final int PAGE_EXECUTE = 0x10;	
	public final int PAGE_EXECUTE_READ = 0x20;	
	public final int PAGE_EXECUTE_READWRITE = 0x40;	
	public final int PAGE_EXECUTE_WRITECOPY = 0x80;	
	public final int PAGE_NOACCESS = 0x01;	
	public final int PAGE_READONLY = 0x02;	
	public final int PAGE_READWRITE = 0x04;	
	public final int PAGE_WRITECOPY = 0x08;	

	public final int PAGE_GUARD = 0x100;	
	public final int PAGE_NOCACHE = 0x200;	
	public final int PAGE_WRITECOMBINE = 0x400;
}
