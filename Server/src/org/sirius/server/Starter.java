/**
 * 
 */
package org.sirius.server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.ws.Endpoint;

import org.sirius.server.common.Log4J;

/**
 * @author KaNoN
 * 
 */
public class Starter {

	private static final String HOST_KEY = "-host";
	private static final String PORT_KEY = "-port";
	private static final String CONFIG_KEY = "-config";
	private static final String DEFAULT_HOST = "localhost";
	private static final String DEFAULT_PORT = "21212";
	private static final String DEFAULT_CONFIG = ".\\modules.csv";

	/**
	 * 
	 * @param config
	 * @return
	 * @throws IOException
	 */
	public ArrayList<PackageOptions> readConfig(String config)
			throws IOException {
		FileReader reader = new FileReader(config);
		BufferedReader br = new BufferedReader(reader);

		String line = br.readLine();

		ArrayList<PackageOptions> options = new ArrayList<PackageOptions>();

		while ((line = br.readLine()) != null) {
			if(line.startsWith("#")){
				continue;
			}
			String[] row = line.split(",");
			if (row.length < 3) {
				continue;
			}
			PackageOptions option = new PackageOptions(row[0].trim(),
					row[1].trim(), row[2].trim());
			options.add(option);
		}

		br.close();
		reader.close();
		return options;
	}

	/**
	 * 
	 * @param options
	 * @param host
	 * @param port
	 */
	public void startEndPoints(ArrayList<PackageOptions> options, String host,
			String port) {
		for (PackageOptions option : options) {
			if (!option.get_packageLocation().equals("Local")) {
				Log4J.log().info("Uploading binary file:" + option.get_packageLocation());
				
				// TODO: Add load class instructions
			}
			try {
				String endPoint = option.get_endPoint();
				endPoint = endPoint.replaceAll("\\$\\{HOST}", host);
				endPoint = endPoint.replaceAll("\\$\\{PORT}", port);
				Log4J.log().info("Starting endpoint: " + endPoint);
				Endpoint.publish(endPoint, Class.forName(option.get_className())
						.newInstance());
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				Log4J.log().error("Failed publishing server endpoint", e);
				
			}
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args) throws IOException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		String host = DEFAULT_HOST;
		String port = DEFAULT_PORT;
		String config = DEFAULT_CONFIG;

		Log4J.log().info("Parsing command line arguments");
		
		HashMap<String, String> params = new HashMap<String, String>();

		for (int i = 0; i < args.length; i += 2) {
			if (i < args.length - 1) {
				params.put(args[i], args[i - 1]);
			}
		}

		if (params.containsKey(HOST_KEY)) {
			host = params.get(HOST_KEY);
		}
		if (params.containsKey(PORT_KEY)) {
			port = params.get(PORT_KEY);
		}
		if (params.containsKey(CONFIG_KEY)) {
			config = params.get(CONFIG_KEY);
		}

		Log4J.log().info("The following parameters were specified:");
		Log4J.log().info("Endpoint host name: " + host);
		Log4J.log().info("Endpoint port number: " + port);
		Log4J.log().info("Configuration file: " + config);
		
		
		Starter starter = new Starter();

		Log4J.log().info("Reading configuration file...");
		ArrayList<PackageOptions> options = starter.readConfig(config);
		
		Log4J.log().info("Starting endpoints...");
		starter.startEndPoints(options, host, port);
	}

}
