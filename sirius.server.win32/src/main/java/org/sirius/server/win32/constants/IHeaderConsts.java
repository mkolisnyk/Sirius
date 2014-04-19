/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IHeaderConsts {

    int HDM_FIRST        = 0x1200;
    int HDM_GETITEMCOUNT = HDM_FIRST;
    int HDM_INSERTITEMA  = HDM_FIRST + 1;
    int HDM_INSERTITEMW  = HDM_FIRST + 10;
    int HDM_DELETEITEM   = HDM_FIRST + 2;
    int HDM_GETITEMA     = HDM_FIRST + 3;
    int HDM_GETITEMW     = HDM_FIRST + 11;
    int HDM_SETITEMA     = HDM_FIRST + 4;
    int HDM_SETITEMW     = HDM_FIRST + 12;
    int HDM_LAYOUT       = HDM_FIRST + 5;
}
