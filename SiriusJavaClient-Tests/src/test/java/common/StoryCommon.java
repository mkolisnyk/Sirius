/**
 * 
 */
package common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import core.system.steps.DirectoryOperationsSteps;

/**
 * @author KaNoN
 *
 */
public class StoryCommon extends JUnitStory {

	public LinkedList<Object> stepDefinitions = new LinkedList<Object>(); 
	
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
				.useStoryLoader(new LoadFromRelativeFile(storyURL))
				// CONSOLE and TXT reporting
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT,
										Format.XML, Format.HTML));
	}

	// Here we specify the steps classes
	@Override
	public InjectableStepsFactory stepsFactory() {
		// varargs, can have more that one steps classes
		return new InstanceStepsFactory(configuration(),
				this.stepDefinitions);
	}
}
