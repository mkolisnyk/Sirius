package org.sirius.client.web;

import java.rmi.RemoteException;

import org.sirius.client.web.classes.Page;
import org.sirius.client.web.classes.WebButton;
import org.sirius.client.web.classes.WebEdit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public class GoogleStart extends Page {

        public WebEdit   edtQuery  = null;
        public WebButton btnSearch = null;

        public GoogleStart(WebClient client) {
            super(client);
            edtQuery = new WebEdit(this, "name=q");
            btnSearch = new WebButton(this, "name=btnG");
        }
    }

    /**
     * Rigourous Test :-)
     * 
     * @throws Exception
     */
    public void testApp() throws Exception {
        try {
            WebClient client = new WebClient();
            System.out.println("Initializing driver");
            client.start(WebClient.HTMLUNIT);

            System.out.println("Initializing page");
            GoogleStart main = new GoogleStart(client);

            System.out.println("Opening page");
            main.open("http://google.com");

            System.out.println("Enter text");
            main.edtQuery.type("Hello world!!!");
            System.out.println("Text: " + main.edtQuery.getValue());
            System.out.println("Press button");
            main.btnSearch.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
