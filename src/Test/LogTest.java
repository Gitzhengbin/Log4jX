package Test;

import Factory.Logger;

public class LogTest {

	public static void main(String[] args) throws Exception {
		Logger logger = Logger.getLogger(LogTest.class);
		logger.debug("这是一个DEBUG");
		logger.info("这是一个INFO");
		logger.debug("这是一个DEFUG");
		logger.error("这是一个ERROR");
	}
	
}
