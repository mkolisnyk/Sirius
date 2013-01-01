/**
 * 
 */
package core.system;

import java.net.MalformedURLException;
import java.net.URL;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

/**
 * @author KaNoN
 *
 */
public class DirectoryOperationsTest extends JUnitStory {

	@Override
    public Configuration configuration() {
		URL storyURL = null;
		
		try {
			storyURL = new URL("file://" + System.getProperty("user.dir")
			        + "/src/test/java/stories/");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
        return new MostUsefulConfiguration()
            // where to find the stories
            .useStoryLoader( new LoadFromRelativeFile(storyURL) ) 
            // CONSOLE and TXT reporting
            .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT, Format.XML,Format.HTML));
    }
 
    // Here we specify the steps classes
    @Override
    public InjectableStepsFactory stepsFactory() {       
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new DirectoryOperationsSteps());
    }
    
    
}
