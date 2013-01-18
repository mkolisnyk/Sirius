/**
 * 
 */
package tests.core.system;

import org.junit.Ignore;

import tests.common.StoryCommon;
import tests.core.system.steps.DirectoryOperationsSteps;

/**
 * @author KaNoN
 * 
 */
@Ignore
public class DirectoryOperationsTest extends StoryCommon {

	public DirectoryOperationsTest() {
		this.stepDefinitions.add(new DirectoryOperationsSteps());
	}
}
