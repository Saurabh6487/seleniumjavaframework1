package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		System.out.println("\n  Hellow World...! \n");
		logger.trace("This is trace message");
		logger.info("This is Information message");
		logger.error("This is Error Message");
		logger.warn("This is Warning Message");
		logger.fatal("This is Fatal Message");
		System.out.println("\n completed");

	}

}
