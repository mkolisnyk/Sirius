/**
 * 
 */
package org.sirius.server;

import javax.xml.ws.Endpoint;

import org.sirius.server.system.DirectoryOperations;
import org.sirius.server.system.FileOperations;
import org.sirius.server.system.ProcessOperations;
import org.sirius.server.system.SystemOperations;

/**
 * @author KaNoN
 * 
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:21212/system/directory",
				new DirectoryOperations());
		Endpoint.publish("http://localhost:21212/system/file",
				new FileOperations());
		Endpoint.publish("http://localhost:21212/system/process",
				new ProcessOperations());
		Endpoint.publish("http://localhost:21212/system/system",
				new SystemOperations());
		System.out.println("Done.");
	}

}
