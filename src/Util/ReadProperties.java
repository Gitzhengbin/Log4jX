package Util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Entity.Log;

public class ReadProperties {
	
	/**
	 * 读取LOG配置文件
	 * @param appenderName
	 * @param message
	 * @return
	 * @throws IOException
	 */
	public static Log readAppenders(String appenderName,String message) throws IOException{
			Properties properties = new Properties();
			InputStream in = Object.class.getResourceAsStream("/log4jX.properties");
			
			properties.load(in);
			
			Log logger = new Log();
			logger.setAppenderName(properties.getProperty("log4jX.appender."+appenderName+".appenderName"));
			logger.setConversionPattern(properties.getProperty("log4jX.appender."+appenderName+".layout.ConversionPattern"));
			logger.setFile(properties.getProperty("log4jX.appender."+appenderName+".File"));
			logger.setTarget(properties.getProperty("log4jX.appender."+appenderName+".Target"));
			logger.setMessage(message);
			
			return logger;
	}
	
	/**
	 * 判断LOG配置文件是否存在
	 * @param className
	 * @return
	 */
	public static boolean isEmpty(String className) {
		try{
			InputStream in = Object.class.getResourceAsStream("/log4jX.properties");
			in.close();
			return true;
		}catch(Exception e){
			System.err.println("log4jX:WARN No appenders could be found for logger ("+className+").\n"+
						"log4jX:WARN Please initialize the log4j system properly.\n"+
						"log4jX:DEFAULT Filename log4jX.properties");
			return false;
		}
	}
	
}
