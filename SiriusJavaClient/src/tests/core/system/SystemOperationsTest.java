/**
 * 
 */
package tests.core.system;

import tests.common.StoryCommon;
import tests.core.system.steps.SystemOperationsSteps;

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
