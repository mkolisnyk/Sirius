/**
 * 
 */
package core.system;

import common.StoryCommon;
import core.system.steps.FileOperationsSteps;

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
