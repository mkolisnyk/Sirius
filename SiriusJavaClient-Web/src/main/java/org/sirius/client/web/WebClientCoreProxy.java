/**
 * .
 */
package org.sirius.client.web;

import java.rmi.RemoteException;

import org.sirius.client.web.core.Dimension;
import org.sirius.client.web.core.Point;
import org.sirius.client.web.core.WebCore;
import org.sirius.client.web.core.WebCoreProxy;
import org.sirius.client.web.select.WebSelectProxy;

/**
 * @author Myk Kolisnyk .
 */
public class WebClientCoreProxy extends WebCoreProxy {

    /**
     * .
     */
    private String         token = "";

    /**
     * .
     */
    private WebSelectProxy select;

    /**
     * .
     */
    public WebClientCoreProxy() {
        select = new WebSelectProxy();
    }

    /**
     * @param endpoint
     *            .
     */
    public WebClientCoreProxy(final String endpoint) {
        super(endpoint);
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void back() throws RemoteException {

        super.back(this.token);
    }

    /**
     * .
     * @param arg1 .
     * @param arg2 .
     * @throws RemoteException .
     */
    public final void clear(final String arg1, final String arg2)
            throws RemoteException {

        super.clear(this.token, arg1, arg2);
    }

    /**
     * .
     * @param arg1 .
     * @param arg2 .
     * @throws RemoteException .
     */
    public final void click(final String arg1, final String arg2)
            throws RemoteException {

        super.click(this.token, arg1, arg2);
    }

    /**
     * @param arg1 .
     * @param arg2 .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy#deselectAll
     *      (java.lang.String, java.lang.String, java.lang.String)
     */
    public final void deselectAll(final String arg1, final String arg2)
            throws RemoteException {
        select.deselectAll(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy#deselectByIndex
     *      (java.lang.String, java.lang.String, java.lang.String, int)
     */
    public final void deselectByIndex(final String arg1, final String arg2,
            final int arg3) throws RemoteException {
        select.deselectByIndex(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #deselectByValue(java.lang.String,java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public final void deselectByValue(final String arg1, final String arg2,
            final String arg3) throws RemoteException {
        select.deselectByValue(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #deselectByVisibleText(java.lang.String, java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public final void deselectByVisibleText(final String arg1,
            final String arg2, final String arg3) throws RemoteException {
        select.deselectByVisibleText(this.token, arg1, arg2, arg3);
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void forward() throws RemoteException {
        super.forward(this.token);
    }

    /**
     * @param arg1 .
     * @param arg2 .
     * @return .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #getAllOptions(java.lang.String, java.lang.String, java.lang.String)
     */
    public final String[] getAllOptions(final String arg1, final String arg2)
            throws RemoteException {
        return select.getAllOptions(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #getAllSelectedOptions(java.lang.String, java.lang.String,
     *      java.lang.String)
     */
    public final String[] getAllSelectedOptions(final String arg1,
            final String arg2) throws RemoteException {
        return select.getAllSelectedOptions(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final String getAttribute(final String arg1, final String arg2,
            final String arg3) throws RemoteException {
        return super.getAttribute(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final String getCssValue(final String arg1, final String arg2,
            final String arg3) throws RemoteException {

        return super.getCssValue(this.token, arg1, arg2, arg3);
    }

    @Override
    public final String getEndpoint() {

        return super.getEndpoint();
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #getFirstSelectedOption(java.lang.String, java.lang.String,
     *      java.lang.String)
     */
    public final String getFirstSelectedOption(final String arg1,
            final String arg2) throws RemoteException {
        return select.getFirstSelectedOption(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final Point getLocation(final String arg1, final String arg2)
            throws RemoteException {
        return super.getLocation(this.token, arg1, arg2);
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String getPageSource() throws RemoteException {

        return super.getPageSource(this.token);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final Dimension getSize(final String arg1, final String arg2)
            throws RemoteException {
        return super.getSize(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final String getTagName(final String arg1, final String arg2)
            throws RemoteException {
        return super.getTagName(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final String getText(final String arg1, final String arg2)
            throws RemoteException {
        return super.getText(this.token, arg1, arg2);
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String getTitle() throws RemoteException {

        return super.getTitle(this.token);
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String getURL() throws RemoteException {
        return super.getURL(this.token);
    }

    @Override
    public final WebCore getWebCore() {

        return super.getWebCore();
    }

    /**
     * .
     * @return .
     * @throws RemoteException .
     */
    public final String getWindowHandle() throws RemoteException {

        return super.getWindowHandle(this.token);
    }

    /**
     * .
     * @param arg1 .
     * @param arg2 .
     * @return .
     * @throws RemoteException .
     */
    public final boolean isDisplayed(final String arg1, final String arg2)
            throws RemoteException {

        return super.isDisplayed(this.token, arg1, arg2);
    }

    /**
     * .
     * @param arg1 .
     * @param arg2 .
     * @return .
     * @throws RemoteException .
     */
    public final boolean isEnabled(final String arg1, final String arg2)
            throws RemoteException {

        return super.isEnabled(this.token, arg1, arg2);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #isMultiple(java.lang.String, java.lang.String, java.lang.String)
     */
    public final boolean isMultiple(final String arg1, final String arg2)
            throws RemoteException {
        return select.isMultiple(this.token, arg1, arg2);
    }

    /**
     * .
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @return .
     * @throws RemoteException .
     */
    public final boolean isSelected(final String arg1, final String arg2)
            throws RemoteException {
        return super.isSelected(this.token, arg1, arg2);
    }

    /**
     * .
     * @param arg1
     *            .
     * @throws RemoteException .
     */
    public final void open(final String arg1) throws RemoteException {
        super.open(this.token, arg1);
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void refresh() throws RemoteException {

        super.refresh(this.token);
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void selectAlert() throws RemoteException {

        super.selectAlert(this.token);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #selectByIndex(java.lang.String, java.lang.String, java.lang.String,
     *      int)
     */
    public final void selectByIndex(final String arg1, final String arg2,
            final int arg3) throws RemoteException {
        select.selectByIndex(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #selectByValue(java.lang.String, java.lang.String, java.lang.String,
     *      java.lang.String)
     */
    public final void selectByValue(final String arg1, final String arg2,
            final String arg3) throws RemoteException {
        select.selectByValue(this.token, arg1, arg2, arg3);
    }

    /**
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     * @see org.sirius.client.web.select.WebSelectProxy
     *      #selectByVisibleText(java.lang.String, java.lang.String,
     *      java.lang.String, java.lang.String)
     */
    public final void selectByVisibleText(final String arg1, final String arg2,
            final String arg3) throws RemoteException {
        select.selectByVisibleText(this.token, arg1, arg2, arg3);
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void selectDefaultContent() throws RemoteException {
        super.selectDefaultContent(this.token);
    }

    /**
     * .
     * @param arg1
     *            .
     * @throws RemoteException .
     */
    public final void selectFrameByIndex(final int arg1)
            throws RemoteException {

        super.selectFrameByIndex(this.token, arg1);
    }

    /**
     * .
     * @param arg1
     *            .
     * @throws RemoteException .
     */
    public final void selectFrameByName(final String arg1)
            throws RemoteException {

        super.selectFrameByName(this.token, arg1);
    }

    /**
     * .
     * @param arg1
     *            .
     * @throws RemoteException .
     */
    public final void selectWindow(final String arg1) throws RemoteException {

        super.selectWindow(this.token, arg1);
    }

    /**
     * .
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @param arg3
     *            .
     * @throws RemoteException .
     */
    public final void sendKeys(final String arg1, final String arg2,
            final String arg3) throws RemoteException {

        super.sendKeys(this.token, arg1, arg2, arg3);
    }

    @Override
    public final String start(final String browser) throws RemoteException {
        this.token = super.start(browser);
        return this.token;
    }

    /**
     * .
     * @throws RemoteException .
     */
    public final void stop() throws RemoteException {
        super.stop(this.token);
    }

    /**
     * .
     * @param arg1
     *            .
     * @param arg2
     *            .
     * @throws RemoteException .
     */
    public final void submit(final String arg1, final String arg2)
            throws RemoteException {
        super.submit(this.token, arg1, arg2);
    }

    /**
     * .
     * @return .
     */
    public final String token() {
        return token;
    }
}
