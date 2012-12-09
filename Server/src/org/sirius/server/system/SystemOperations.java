/**
 * 
 */
package org.sirius.server.system;

import java.util.Date;

/**
 * @author KaNoN
 * 
 */
public class SystemOperations {

	/**
	 * 
	 * @return
	 */
	public String GetMachineName() {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public int GetFreeMemory() {
		return -1;
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
		return null;
	}

	/**
	 * 
	 * @param variableName
	 * @return
	 */
	public String GetEnvironmentVariable(String variableName) {
		return null;
	}

	/**
	 * 
	 * @param variableName
	 * @param value
	 * @return
	 */
	public boolean SetEnvironmentVariable(String variableName, String value) {
		return false;
	}

}
