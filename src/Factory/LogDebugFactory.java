package Factory;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Entity.Log;

public class LogDebugFactory extends LogFactory{
	public LogDebugFactory() {
	}
	
	public void logger(Log log) throws FileNotFoundException {
		String filePath = log.getFile();
		String targetWay = log.getTarget();
		String lines = lines();
		String message = log.getMessage();
		SimpleDateFormat format = new SimpleDateFormat(log.getConversionPattern());
		String time = format.format(new Date());
		if(targetWay != null) {
			if(targetWay.equals("System.out")) {
				System.out.print("[DEBUG] " + time + " , ");
				System.out.println(lines);
				System.out.println(message);
			}else {
				System.err.print("[DEBUG] " + time + " , ");
				System.err.println(lines);
				System.err.println(message);
			}
		}
		if(filePath != null){
			path = filePath;
			fileLogger("[DEBUG] " + time + " , " + lines);
			fileLogger(message);
		}
	}
	
}
