/**
 * .
 */
package org.sirius.client.web;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 * .
 */
public class WebClient {
    /**
     * .
     */
    public static final String IE                = "ie";
    /**
     * .
     */
    public static final String FIREFOX           = "firefox";
    /**
     * .
     */
    public static final String FIREFOX_UNSECURED = "chrome";
    /**
     * .
     */
    public static final String CHROME            = "googlechrome";
    /**
     * .
     */
    public static final String OPERA             = "opera";
    /**
     * .
     */
    public static final String HTMLUNIT          = "htmlunit";

    /**
     * .
     */
    private WebClientCoreProxy core              = null;

    /**
     * .
     */
    public WebClient() {
        core = new WebClientCoreProxy();
    }

    /**
     * .
     * @return .
     */
    public final WebClientCoreProxy core() {
        return core;
    }

    /**
     * .
     * @param browser .
     * @throws RemoteException .
     */
    public final void start(final String browser) throws RemoteException {
        core.start(browser);
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void stop() throws RemoteException {
        core.stop();
    }
}
