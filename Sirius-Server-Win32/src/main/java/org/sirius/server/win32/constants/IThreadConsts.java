/**
 * 
 */
package org.sirius.server.win32.constants;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface IThreadConsts {
    int TH_DELETE       = 0x00010000;
    int TH_READ_CONTROL = 0x00020000;
    int TH_SYNCHRONIZE  = 0x00100000;
    int TH_WRITE_DAC    = 0x00040000;
    int TH_WRITE_OWNER  = 0x00080000;
}
