/**
 * 
 */
package tests.core.system.steps;

import java.io.IOException;
import java.util.Date;

import org.jbehave.core.annotations.Then;
import org.sirius.server.system.SystemOperations;

/**
 * @author KaNoN
 *
 */
public class SystemOperationsSteps extends SystemOperations {

	@Then(value = "")
	public String getCurrentUser() {
		
		return super.getCurrentUser();
	}

	public Date getDate() {
		
		return super.getDate();
	}

	@Then(value = "")
	public String getEnvironmentVariable(String variableName) {
		
		return super.getEnvironmentVariable(variableName);
	}

	@Then(value = "")
	public long getFreeDiskSpace(String path) {
		
		return super.getFreeDiskSpace(path);
	}

	@Then(value = "")
	public long getFreeMemory() {
		
		return super.getFreeMemory();
	}

	@Then(value = "")
	public String getMachineName() {
		
		return super.getMachineName();
	}

	@Then(value = "")
	public boolean setEnvironmentVariable(
			String variableName,
			String value) throws IOException {
		
		return super.setEnvironmentVariable(variableName, value);
	}

	/**
	 * 
	 */
	public SystemOperationsSteps() {
	}

}
