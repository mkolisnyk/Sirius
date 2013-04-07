/**
 * 
 */
package org.sirius.client.web;

import java.rmi.RemoteException;

import org.sirius.client.web.core.Dimension;
import org.sirius.client.web.core.Point;
import org.sirius.client.web.core.WebCore;
import org.sirius.client.web.core.WebCoreProxy;
import org.sirius.client.web.select.WebSelectProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class WebClientCoreProxy extends WebCoreProxy {

    protected String         token = "";
    protected WebSelectProxy select;

    public String token() {
        return token;
    }

    /**
	 * 
	 */
    public WebClientCoreProxy() {
        select = new WebSelectProxy();
    }

    /**
     * @param endpoint
     */
    public WebClientCoreProxy(String endpoint) {
        super(endpoint);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getEndpoint()
     */

    public String getEndpoint() {

        return super.getEndpoint();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getWebCore()
     */

    public WebCore getWebCore() {

        return super.getWebCore();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#forward(java.lang.String)
     */

    public void forward() throws RemoteException {

        super.forward(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#sendKeys(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.String)
     */

    public void sendKeys(String arg1, String arg2, String arg3)
            throws RemoteException {

        super.sendKeys(this.token, arg1, arg2, arg3);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#selectWindow(java.lang.String,
     * java.lang.String)
     */

    public void selectWindow(String arg1) throws RemoteException {

        super.selectWindow(this.token, arg1);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#selectAlert(java.lang.String)
     */

    public void selectAlert() throws RemoteException {

        super.selectAlert(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#getCssValue(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.String)
     */

    public String getCssValue(String arg1, String arg2, String arg3)
            throws RemoteException {

        return super.getCssValue(this.token, arg1, arg2, arg3);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#isDisplayed(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public boolean isDisplayed(String arg1, String arg2) throws RemoteException {

        return super.isDisplayed(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#getWindowHandle(java.lang.String)
     */

    public String getWindowHandle() throws RemoteException {

        return super.getWindowHandle(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#selectFrameByName(java.lang.String
     * , java.lang.String)
     */

    public void selectFrameByName(String arg1) throws RemoteException {

        super.selectFrameByName(this.token, arg1);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#selectDefaultContent(java.lang
     * .String)
     */

    public void selectDefaultContent() throws RemoteException {

        super.selectDefaultContent(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#getPageSource(java.lang.String)
     */

    public String getPageSource() throws RemoteException {

        return super.getPageSource(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#selectFrameByIndex(java.lang.
     * String, int)
     */

    public void selectFrameByIndex(int arg1) throws RemoteException {

        super.selectFrameByIndex(this.token, arg1);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#back(java.lang.String)
     */

    public void back() throws RemoteException {

        super.back(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#getLocation(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public Point getLocation(String arg1, String arg2) throws RemoteException {

        return super.getLocation(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getURL(java.lang.String)
     */

    public String getURL() throws RemoteException {

        return super.getURL(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#clear(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public void clear(String arg1, String arg2) throws RemoteException {

        super.clear(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#start(java.lang.String)
     */

    public String start(String browser) throws RemoteException {
        this.token = super.start(browser);
        return this.token;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#stop(java.lang.String)
     */

    public void stop() throws RemoteException {

        super.stop(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getSize(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public Dimension getSize(String arg1, String arg2) throws RemoteException {

        return super.getSize(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#open(java.lang.String,
     * java.lang.String)
     */

    public void open(String arg1) throws RemoteException {

        super.open(this.token, arg1);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#refresh(java.lang.String)
     */

    public void refresh() throws RemoteException {

        super.refresh(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getTitle(java.lang.String)
     */

    public String getTitle() throws RemoteException {

        return super.getTitle(this.token);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#isEnabled(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public boolean isEnabled(String arg1, String arg2) throws RemoteException {

        return super.isEnabled(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getText(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public String getText(String arg1, String arg2) throws RemoteException {

        return super.getText(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#submit(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public void submit(String arg1, String arg2) throws RemoteException {

        super.submit(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#click(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public void click(String arg1, String arg2) throws RemoteException {

        super.click(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#isSelected(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public boolean isSelected(String arg1, String arg2) throws RemoteException {

        return super.isSelected(this.token, arg1, arg2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sirius.client.web.core.WebCoreProxy#getAttribute(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.String)
     */

    public String getAttribute(String arg1, String arg2, String arg3)
            throws RemoteException {

        return super.getAttribute(this.token, arg1, arg2, arg3);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.sirius.client.web.core.WebCoreProxy#getTagName(java.lang.String,
     * java.lang.String, java.lang.String)
     */

    public String getTagName(String arg1, String arg2) throws RemoteException {

        return super.getTagName(this.token, arg1, arg2);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#isMultiple(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public boolean isMultiple(String arg1, String arg2) throws RemoteException {
        return select.isMultiple(this.token, arg1, arg2);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#deselectAll(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public void deselectAll(String arg1, String arg2) throws RemoteException {
        select.deselectAll(this.token, arg1, arg2);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#deselectByIndex(java.lang.String,
     *      java.lang.String, java.lang.String, int)
     */
    public void deselectByIndex(String arg1, String arg2, int arg3)
            throws RemoteException {
        select.deselectByIndex(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#deselectByValue(java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String)
     */
    public void deselectByValue(String arg1, String arg2, String arg3)
            throws RemoteException {
        select.deselectByValue(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#getAllOptions(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public String[] getAllOptions(String arg1, String arg2)
            throws RemoteException {
        return select.getAllOptions(this.token, arg1, arg2);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#selectByIndex(java.lang.String,
     *      java.lang.String, java.lang.String, int)
     */
    public void selectByIndex(String arg1, String arg2, int arg3)
            throws RemoteException {
        select.selectByIndex(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#selectByValue(java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String)
     */
    public void selectByValue(String arg1, String arg2, String arg3)
            throws RemoteException {
        select.selectByValue(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#selectByVisibleText(java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String)
     */
    public void selectByVisibleText(String arg1, String arg2, String arg3)
            throws RemoteException {
        select.selectByVisibleText(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#deselectByVisibleText(java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String)
     */
    public void deselectByVisibleText(String arg1, String arg2, String arg3)
            throws RemoteException {
        select.deselectByVisibleText(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#getAllSelectedOptions(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public String[] getAllSelectedOptions(String arg1, String arg2)
            throws RemoteException {
        return select.getAllSelectedOptions(this.token, arg1, arg2);
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     * @throws RemoteException
     * @see org.sirius.client.web.select.WebSelectProxy#getFirstSelectedOption(java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public String getFirstSelectedOption(String arg1, String arg2)
            throws RemoteException {
        return select.getFirstSelectedOption(this.token, arg1, arg2);
    }

}
