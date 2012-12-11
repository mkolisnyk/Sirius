/**
 * 
 */
package org.sirius.server.system;

import java.io.IOException;
import java.util.Date;

import javax.jws.WebService;

/**
 * @author KaNoN
 * 
 */
@WebService
public class SystemOperations {

	/**
	 * 
	 * @return
	 */
	public String GetMachineName() {
		return System.getenv("ComputerName");
	}

	/**
	 * 
	 * @return
	 */
	public long GetFreeMemory() {
		return Runtime.getRuntime().freeMemory();
	}

	/**
	 * 
	 * @return
	 */
	public int GetFreeDiskSpace() {
		return -1;
	}

	/**
	 * 
	 */
	public Object GetSystemMetrics() {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Date GetDate() {
		return null;
	}

	/**
	 * 
	 * @param dt
	 * @return
	 */
	public boolean SetDate(Date dt) {
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public String GetCurrentUser() {
		return System.getenv("USERNAME");
	}

	/**
	 * 
	 * @param variableName
	 * @return
	 */
	public String GetEnvironmentVariable(String variableName) {
		return System.getenv(variableName);
	}

	/**
	 * 
	 * @param variableName
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public boolean SetEnvironmentVariable(String variableName, String value)
			throws IOException {
		// TODO Add implementation
		return false;
	}

}
