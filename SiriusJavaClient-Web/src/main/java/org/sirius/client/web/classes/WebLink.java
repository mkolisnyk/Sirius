/**
 * .
 */
package org.sirius.client.web.classes;

/**
 * @author Myk Kolisnyk
 * .
 */
public class WebLink extends WebButton {

    /**
     * @param parent .
     * @param locator .
     */
    public WebLink(final Frame parent, final String locator) {
        super(parent, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param parent .
     * @param parentElement .
     * @param locator .
     */
    public WebLink(final Frame parent, final String parentElement,
            final String locator) {
        super(parent, parentElement, locator);
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @return .
     * @throws Exception .
     */
    public final String href() throws Exception {
        return client().core().getAttribute(parentElement, locator, "href");
    }
}
