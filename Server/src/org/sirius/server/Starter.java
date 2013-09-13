/**
 * 
 */
package org.sirius.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.ws.Endpoint;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

/**
 * @author KaNoN
 */
public class Starter {

	/**
	 * .
	 */
	private static final int PARAMS_COUNT = 3;

	/**
	 * .
	 */
	private static final String HOST_KEY = "-host";

	/**
	 * .
	 */
	private static final String PORT_KEY = "-port";

	/**
	 * .
	 */
	private static final String CONFIG_KEY = "-config";

	/**
	 * .
	 */
	private static final String DEFAULT_HOST = "localhost";

	/**
	 * .
	 */
	private static final String DEFAULT_PORT = "21212";

	/**
	 * .
	 */
	private static final String DEFAULT_CONFIG = ".\\modules.csv";

	/**
	 * .
	 */
	private static ArrayList<Endpoint> endpoints = new ArrayList<Endpoint>();

	/**
     * @return the endpoints
     */
    public static ArrayList<Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
	 * .
	 */
	private static Logger logger = Logger.getLogger(Starter.class);

	static {
		logger.addAppender(new ConsoleAppender(new SimpleLayout()));
	}

	/**
	 * .
	 * @param config
	 * @return
	 * @throws IOException
	 */
	public final ArrayList<PackageOptions> readConfig(final String config)
			throws IOException {

		logger.info("Start reading configuration file: " + config);

		FileReader reader = new FileReader(config);
		BufferedReader br = new BufferedReader(reader);

		String line = br.readLine();

		logger.debug("Line read: " + line);

		ArrayList<PackageOptions> options =
				new ArrayList<PackageOptions>();

		while ((line = br.readLine()) != null) {
			logger.debug("Line read: " + line);

			if (line.startsWith("#")) {
				logger.debug("Commented line detected. " +
						"Skipping...");
				continue;
			}
			String[] row = line.split(",");
			if (row.length < PARAMS_COUNT) {
				logger.debug("Malformed line detected. " +
						"It should contain at least 3 fields. " +
						"Skipping...");
				continue;
			}
			PackageOptions option = 
					new PackageOptions(row[0].trim(),
							row[1].trim(), row[2].trim());
			options.add(option);
		}

		logger.info("Complete reading configuration file: " + config);

		br.close();
		reader.close();
		return options;
	}

	/**
	 * .
	 * @param filter .
	 * @return .
	 */
	private String findMatchingFile(final String filter) {
		File location = new File(filter);

		for (String file : location.getParentFile().list()) {
			if (file.matches(location.getName())) {
				return file;
			}
		}

		return "";
	}

	/**
	 * .
	 * @param options .
	 * @param host .
	 * @param port .
	 * @throws IOException 
	 * @throws MalformedURLException .
	 */
	public final void startEndPoints(
			final ArrayList<PackageOptions> options,
			final String host,
			final String port) throws IOException {
		for (PackageOptions option : options) {
			ClassLoader loader;
			
			if (!option.get_packageLocation().equals("Local")) {
				logger.info("Uploading binary file:"
						+ option.get_packageLocation());

				String packageFile = findMatchingFile(option
						.get_packageLocation());
				File location = new File(packageFile);

				URL[] url = {
						location.getAbsoluteFile().toURI().toURL()
				};
				loader = new URLClassLoader(url, this.getClass()
						.getClassLoader());
			} else {
				loader = this.getClass().getClassLoader();
			}
			try {
				String endPoint = option.get_endPoint();
				endPoint =
						endPoint.replaceAll(
								"\\$\\{HOST}",
								host
						);
				endPoint =
						endPoint.replaceAll(
								"\\$\\{PORT}",
								port
						);
				logger.info("Starting endpoint: " + endPoint);
				Endpoint endpoint = Endpoint.publish(endPoint,
						Class.forName(
								option.get_className(), 
								true,
								loader
						)
						.newInstance());
				endpoints.add(endpoint);
			} catch (Exception e) {
				logger.error(
						"Failed publishing server endpoint", e
				);
			} finally {
				logger.info("Done...");
			}
		}
		//logger.info("Initialization Completed...");
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(final String[] args) throws IOException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		String host = DEFAULT_HOST;
		String port = DEFAULT_PORT;
		String config = DEFAULT_CONFIG;

		logger.info("Parsing command line arguments");

		HashMap<String, String> params = new HashMap<String, String>();

		for (int i = 0; i < (2 * (args.length / 2)); i += 2) {
			if (i < args.length - 1) {
				params.put(args[i], args[i + 1]);
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

		logger.info("The following parameters were specified:");
		logger.info("Endpoint host name: " + host);
		logger.info("Endpoint port number: " + port);
		logger.info("Configuration file: " + config);

		Starter starter = new Starter();

		logger.info("Reading configuration file...");
		ArrayList<PackageOptions> options = starter.readConfig(config);

		logger.info("Starting interanl endpoint...");
		try {
			endpoints.add(Endpoint.publish("http://" + host + ":" + port
					+ "/internal", new Internal()));
		} catch (Exception e) {
			logger.error("Failed to start interanl endpoint", e);
		}
		logger.info("Done...");

		logger.info("Starting endpoints...");
		starter.startEndPoints(options, host, port);
		
	}

}
