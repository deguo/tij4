package ch12exceptions;

import java.util.logging.*;
import java.io.*;

/**
 * Logging caught exceptions.
 * 
 * <pre>
 * Output: (90% match)
  * Aug 30, 2005 4:07:54 PM D04_LoggingExceptions2 logException
  * SEVERE: java.lang.NullPointerException
  * at D04_LoggingExceptions2.main(D04_LoggingExceptions2.java:16)
 * </pre>
 */
public class D04_LoggingExceptions2 {
	private static Logger logger = Logger.getLogger("D04_LoggingExceptions2");

	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			logException(e);
		}
	}
}