/**
 * .
 */
package org.sirius.client.web;

import java.rmi.RemoteException;

/**
 * @author Myk Kolisnyk
 */
public class WebClient {
    /**
     * Constant indicating Internet Explorer browser.
     */
    public static final String IE                = "ie";
    /**
     * Constant indicating Firefox browser.
     */
    public static final String FIREFOX           = "firefox";
    /**
     * Constant indicating Firefox (unsecured mode) browser.
     */
    public static final String FIREFOX_UNSECURED = "chrome";
    /**
     * Constant indicating Google Chrome browser.
     */
    public static final String CHROME            = "googlechrome";
    /**
     * Constant indicating Opera browser.
     */
    public static final String OPERA             = "opera";
    /**
     * Constant indicating Html Unit browser.
     */
    public static final String HTMLUNIT          = "htmlunit";

    /**
     * Provides interface for the core Web Client.
     */
    private WebClientCoreProxy core              = null;

    /**
     * Initializes instance of the Web Client using default host: <b>http://localhost:21212</b>.
     */
    public WebClient() {
        core = new WebClientCoreProxy();
    }

    /**
     * Returns interface for the Web Client Core proxy object.
     * @return Web Client Core proxy object.
     */
    public final WebClientCoreProxy core() {
        return core;
    }

    /**
     * Initiates new browser session.
     * @param browser browser to start.
     * @throws RemoteException thrown if no connection is made with the server or some other network issues.
     */
    public final void start(final String browser) throws RemoteException {
        core.start(browser);
    }

    /**
     * Terminates recently open browser session.
     * @throws RemoteException thrown if no connection is made with the server or some other network issues.
     */
    public final void stop() throws RemoteException {
        core.stop();
    }
}
