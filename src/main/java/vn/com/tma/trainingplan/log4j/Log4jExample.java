package vn.com.tma.trainingplan.log4j;

import org.apache.log4j.Logger;

public class Log4jExample {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Log4jExample.class);
		log.debug("Hello this is a debug message");
		log.info("Hello this is a info message");
	}
}
