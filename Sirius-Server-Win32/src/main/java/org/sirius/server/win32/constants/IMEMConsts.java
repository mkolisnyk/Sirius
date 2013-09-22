/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IMEMConsts {

    int MEM_COMMIT      = 0x00001000;
    int MEM_RESERVE     = 0x00002000;
    int MEM_RESET       = 0x00080000;
    int MEM_RESET_UNDO  = 0x1000000;

    int MEM_LARGE_PAGES = 0x20000000;
    int MEM_PHYSICAL    = 0x00400000;
    int MEM_TOP_DOWN    = 0x00100000;

    int MEM_DECOMMIT    = 0x4000;
    int MEM_RELEASE     = 0x8000;
}
