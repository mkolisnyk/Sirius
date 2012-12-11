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
		String host = "localhost";
		String port = "21212";

		Endpoint.publish(
				String.format("http://%1$:%2$/system/directory", host, port),
				new DirectoryOperations());
		Endpoint.publish(
				String.format("http://%1$:%2$/system/file", host, port),
				new FileOperations());
		Endpoint.publish(
				String.format("http://%1$:%2$/system/process", host, port),
				new ProcessOperations());
		Endpoint.publish(
				String.format("http://%1$:%2$/system/system", host, port),
				new SystemOperations());
		System.out.println("Done.");
	}

}
