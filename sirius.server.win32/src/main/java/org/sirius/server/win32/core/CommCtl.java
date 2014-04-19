/**
 * 
 */
package org.sirius.server.win32.core;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;

/**
 * @author Myk Kolisnyk
 * 
 */
public interface CommCtl extends StdCallLibrary {
    class INITCOMMONCONTROLSEX extends Structure {
        public int dwSize = size();
        public int dwICC;

        /*
         * (non-Javadoc)
         * 
         * @see com.sun.jna.Structure#getFieldOrder()
         */
        @Override
        protected List getFieldOrder() {
            return Arrays.asList(new String[] { "dwSize", "dwICC" });

        }
    }

    CommCtl INSTANCE = (CommCtl) Native.loadLibrary("Comctl32.dll",
                                    CommCtl.class,
                                    W32APIOptions.DEFAULT_OPTIONS);

    boolean InitCommonControlsEx(INITCOMMONCONTROLSEX lpInitCtrls);

}
