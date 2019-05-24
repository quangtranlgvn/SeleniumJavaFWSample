package com.logigear.testfw.conf;

import java.util.logging.Logger;

public class LogWrapper {
	
	static {
		String path = System.getProperty("user.dir") + "\\config\\log\\logging.properties";
		System.setProperty("java.util.logging.config.file", path);
	}

	/**
	 * @author luan.nguyen
	 * 
	 * Creates the logger.
	 *
	 * @param className the class name
	 * @return the logger
	 */
	public static final Logger createLogger(String className) {
		return Logger.getLogger(className);
	}
}	
