/**
 * 
 */
package tests.core.system;

import org.junit.Ignore;

import tests.common.StoryCommon;
import tests.core.system.steps.FileOperationsSteps;

/**
 * @author KaNoN
 * 
 */
@Ignore
public class FileOperationsTest extends StoryCommon {

	/**
	 * 
	 */
	public FileOperationsTest() {
		this.stepDefinitions.add(new FileOperationsSteps());
	}

}
