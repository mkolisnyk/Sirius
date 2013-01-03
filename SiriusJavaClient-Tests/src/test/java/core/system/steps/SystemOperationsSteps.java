/**
 * 
 */
package core.system.steps;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.sirius.client.core.system.sys.SystemOperationsProxy;

/**
 * @author KaNoN
 *
 */
public class SystemOperationsSteps extends SystemOperationsProxy {

	@Then(value = "")
	public String getCurrentUser() throws RemoteException {
		
		return super.getCurrentUser();
	}

	public Calendar getDate() throws RemoteException {
		
		return super.getDate();
	}

	@Then(value = "")
	public String getEnvironmentVariable(String variableName) throws RemoteException {
		
		return super.getEnvironmentVariable(variableName);
	}

	@Then(value = "")
	public long getFreeDiskSpace(String path) throws RemoteException {
		
		return super.getFreeDiskSpace(path);
	}

	@Then(value = "")
	public long getFreeMemory() throws RemoteException {
		
		return super.getFreeMemory();
	}

	@Then(value = "")
	public String getMachineName() throws RemoteException {
		
		return super.getMachineName();
	}

	@Then(value = "")
	public boolean setEnvironmentVariable(
			String variableName,
			String value) throws org.sirius.client.core.system.sys.IOException, RemoteException {
		
		return super.setEnvironmentVariable(variableName, value);
	}

	/**
	 * 
	 */
	public SystemOperationsSteps() {
	}

}
