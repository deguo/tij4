package ch12exceptions;

import java.util.logging.*;
import java.io.*;

/**
 * An exception that reports through a Logger.
 * 
 * <pre>
 * Output: (85% match)
  * Aug 30, 2005 4:02:31 PM LoggingException <init>
  * SEVERE: LoggingException
  * at D03_LoggingExceptions.main(D03_LoggingExceptions.java:19)
  * 
  * Caught LoggingException
  * Aug 30, 2005 4:02:31 PM LoggingException <init>
  * SEVERE: LoggingException
  * at D03_LoggingExceptions.main(D03_LoggingExceptions.java:24)
  * 
  * Caught LoggingException
 * </pre>
 */
class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class D03_LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
	}
}