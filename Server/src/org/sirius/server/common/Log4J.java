/**
 * 
 */
package org.sirius.server.common;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author KaNoN
 * 
 */
public final class Log4J {

	private static Logger logger = null;

	private Log4J() {
		;
	}

	public static Logger log() {
		Exception e = new Exception();
		String className = e.getStackTrace()[1].getClassName();
		
		DOMConfigurator.configure(".\\log4j.xml");
		logger = Logger.getLogger(Log4J.class);
		return logger;
	}
}
