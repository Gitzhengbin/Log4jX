package Factory;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Entity.Log;

public class LogErrorFactory extends LogFactory{
	
	public LogErrorFactory() {
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
				System.out.print("[ERROR] " + time + " , ");
				System.out.println(lines);
				System.out.println(message);
			}else {
				System.err.print("[ERROR] " + time + " , ");
				System.err.println(lines);
				System.err.println(message);
			}
		}
		if(filePath != null){
			path = filePath;
			fileLogger("[ERROR] " + time + " , " + lines);
			fileLogger(message);
		}
	}
}
