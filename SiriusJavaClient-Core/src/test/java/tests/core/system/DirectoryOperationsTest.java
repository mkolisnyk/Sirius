/**
 * 
 */
package tests.core.system;

import tests.common.StoryCommon;
import tests.core.system.steps.DirectoryOperationsSteps;

/**
 * @author KaNoN
 * 
 */
public class DirectoryOperationsTest extends StoryCommon {

	public DirectoryOperationsTest() {
		this.stepDefinitions.add(new DirectoryOperationsSteps());
	}
}
