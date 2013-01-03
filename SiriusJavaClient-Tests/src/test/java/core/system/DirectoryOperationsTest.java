/**
 * 
 */
package core.system;

import common.StoryCommon;
import core.system.steps.DirectoryOperationsSteps;

/**
 * @author KaNoN
 * 
 */
public class DirectoryOperationsTest extends StoryCommon {

	public DirectoryOperationsTest(){
		this.stepDefinitions.add(new DirectoryOperationsSteps());
	}
}
