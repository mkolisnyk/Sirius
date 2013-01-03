/**
 * 
 */
package core.system;

import common.StoryCommon;
import core.system.steps.SystemOperationsSteps;

/**
 * @author KaNoN
 *
 */
public class SystemOperationsTest extends StoryCommon {

	/**
	 * 
	 */
	public SystemOperationsTest() {
		this.stepDefinitions.add(new SystemOperationsSteps());
	}

}
