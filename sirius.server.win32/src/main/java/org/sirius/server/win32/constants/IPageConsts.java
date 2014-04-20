/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IPageConsts {
    int PAGE_EXECUTE           = 0x10;
    int PAGE_EXECUTE_READ      = 0x20;
    int PAGE_EXECUTE_READWRITE = 0x40;
    int PAGE_EXECUTE_WRITECOPY = 0x80;
    int PAGE_NOACCESS          = 0x01;
    int PAGE_READONLY          = 0x02;
    int PAGE_READWRITE         = 0x04;
    int PAGE_WRITECOPY         = 0x08;

    int PAGE_GUARD             = 0x100;
    int PAGE_NOCACHE           = 0x200;
    int PAGE_WRITECOMBINE      = 0x400;
}
