/**
 * 
 */
package org.sirius.server.test.system;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * @author Myk Kolisnyk
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"html:target/cucumber-html-report", 
                "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt",
                "usage:target/cucumber-usage.json"
                },
        features = {"src/test/java/org/sirius/server/test/features/system"},
        glue = {"org/sirius/server/test/steps/system"}
)
public class SystemOperationsTest {

}
