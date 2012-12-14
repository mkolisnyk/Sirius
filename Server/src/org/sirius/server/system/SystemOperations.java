/**
 * 
 */
package org.sirius.server.system;

import java.io.File;
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
	public String getMachineName() {
		return System.getenv("ComputerName");
	}

	/**
	 * 
	 * @return
	 */
	public long getFreeMemory() {
		return Runtime.getRuntime().freeMemory();
	}

	/**
	 * 
	 * @return
	 */
	public long getFreeDiskSpace(String path) {
		File file = new File(path);
		return file.getUsableSpace();
	}

	/**
	 * 
	 */
	public Object getSystemMetrics() {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Date getDate() {
		return null;
	}

	/**
	 * 
	 * @param dt
	 * @return
	 */
	public boolean setDate(Date dt) {
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public String getCurrentUser() {
		return System.getenv("USERNAME");
	}

	/**
	 * 
	 * @param variableName
	 * @return
	 */
	public String getEnvironmentVariable(String variableName) {
		return System.getenv(variableName);
	}

	/**
	 * 
	 * @param variableName
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public boolean setEnvironmentVariable(String variableName, String value)
			throws IOException {
		// TODO Add implementation
		return false;
	}

}
