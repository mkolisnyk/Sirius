/**
 * 
 */
package org.sirius.server.system;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebResult;
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
	@WebResult(name = "machine")
	public String getMachineName() {
		return System.getenv("ComputerName");
	}

	/**
	 * 
	 * @return
	 */
	@WebResult(name = "freeMemory")
	public long getFreeMemory() {
		return Runtime.getRuntime().freeMemory();
	}

	/**
	 * 
	 * @return
	 */
	@WebResult(name = "freeDiskSpace")
	public long getFreeDiskSpace(String path) {
		File file = new File(path);
		return file.getUsableSpace();
	}

	/**
	 * 
	 * @return
	 */
	@WebResult(name = "date")
	public Date getDate() {
		Date dt = new Date();
		return dt;
	}

	/**
	 * 
	 * @return
	 */
	@WebResult(name = "userName")
	public String getCurrentUser() {
		return System.getenv("USERNAME");
	}

	/**
	 * 
	 * @param variableName
	 * @return
	 */
	@WebResult(name = "value")
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
	@SuppressWarnings("unchecked")
	@WebResult(name = "status")
	public boolean setEnvironmentVariable(
			@WebParam(name = "variableName") String variableName,
			@WebParam(name = "value") String value) throws IOException {

		try {
			Class<?> processEnvironmentClass = Class
					.forName("java.lang.ProcessEnvironment");
			Field theEnvironmentField = processEnvironmentClass
					.getDeclaredField("theEnvironment");
			theEnvironmentField.setAccessible(true);

			Map<String, String> env = (Map<String, String>) theEnvironmentField
					.get(null);
			env.put(variableName, value);
			Field theCaseInsensitiveEnvironmentField = processEnvironmentClass
					.getDeclaredField("theCaseInsensitiveEnvironment");
			theCaseInsensitiveEnvironmentField.setAccessible(true);
			
			Map<String, String> cienv = (Map<String, String>) theCaseInsensitiveEnvironmentField
					.get(null);
			cienv.put(variableName, value);
		} catch (NoSuchFieldException e) {
			try {
				Class<?>[] classes = Collections.class.getDeclaredClasses();
				Map<String, String> env = System.getenv();
				for (Class<?> cl : classes) {
					if ("java.util.Collections$UnmodifiableMap".equals(cl
							.getName())) {
						Field field = cl.getDeclaredField("m");
						field.setAccessible(true);
						Object obj = field.get(env);
						Map<String, String> map = (Map<String, String>) obj;
						map.clear();
						map.put(variableName, value);
					}
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				return false;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
		return true;
	}

}
