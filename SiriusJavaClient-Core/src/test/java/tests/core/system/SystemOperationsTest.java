/**
 * 
 */
package tests.core.system;

import org.junit.Ignore;

import tests.common.StoryCommon;
import tests.core.system.steps.SystemOperationsSteps;

/**
 * @author KaNoN
 * 
 */
@Ignore
public class SystemOperationsTest extends StoryCommon {

	/**
	 * 
	 */
	public SystemOperationsTest() {
		this.stepDefinitions.add(new SystemOperationsSteps());
	}

}
