/**
 * 
 */
package tests.core.system;

import tests.common.StoryCommon;
import tests.core.system.steps.FileOperationsSteps;

/**
 * @author KaNoN
 *
 */
public class FileOperationsTest extends StoryCommon {

	/**
	 * 
	 */
	public FileOperationsTest() {
		this.stepDefinitions.add(new FileOperationsSteps());
	}

}
