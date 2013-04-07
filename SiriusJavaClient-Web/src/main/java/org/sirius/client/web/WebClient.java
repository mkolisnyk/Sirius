/**
 * 
 */
package org.sirius.client.web;

import java.rmi.RemoteException;

import org.sirius.client.web.core.WebCoreProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class WebClient {

    public final static String IE                = "ie";
    public final static String FIREFOX           = "firefox";
    public final static String FIREFOX_UNSECURED = "chrome";
    public final static String CHROME            = "googlechrome";
    public final static String OPERA             = "opera";
    public final static String HTMLUNIT          = "htmlunit";

    private WebClientCoreProxy core              = null;

    /**
	 * 
	 */
    public WebClient() {
        core = new WebClientCoreProxy();
    }

    public WebClientCoreProxy core() {
        return core;
    }

    public void start(String browser) throws RemoteException {
        core.start(browser);
    }

    public void stop() throws RemoteException {
        core.stop();
    }
}
