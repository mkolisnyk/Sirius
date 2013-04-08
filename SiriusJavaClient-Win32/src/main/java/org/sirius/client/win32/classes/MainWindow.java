/**
 * .
 */
package org.sirius.client.win32.classes;

import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * .
 */
public class MainWindow extends TopLevelWindow {

    /**
     * .
     * @param client .
     * @param locator .
     */
    public MainWindow(final Win32Client client, final Win32Locator locator) {
        super(client, locator);
    }

    /**
     * .
     * @param executable .
     * @param params .
     * @param workingDir .
     * @throws Exception .
     */
    public final void start(final String executable, final String params,
            final String workingDir) throws Exception {
        client.core().window()
                .start(locator.getHwnd(), executable, params, workingDir);
    }
}
