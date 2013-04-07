/**
 * 
 */
package org.sirius.client.web.classes;

/**
 * @author Myk Kolisnyk
 * 
 */
public class WebLink extends WebButton {

    /**
     * @param parent
     * @param parentElement
     * @param locator
     */
    public WebLink(Frame parent, String parentElement, String locator) {
        super(parent, parentElement, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param parent
     * @param locator
     */
    public WebLink(Frame parent, String locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    public String href() throws Exception {
        return client().core().getAttribute(parentElement, locator, "href");
    }
}
