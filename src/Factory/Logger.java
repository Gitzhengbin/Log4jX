package Factory;

import java.lang.reflect.Method;
import Entity.Log;
import Util.ReadProperties;

public class Logger {
	@SuppressWarnings("unused")
	private Class<?> c;

	public Logger() {
	}

	public Logger(Class<?> c) {
		this.c = c;
	}

	public static Logger getLogger(Class<?> c) {
		if(ReadProperties.isEmpty(c.getName())) {
			return new Logger(c);
		}else {
			return new Logger();
		}
	}

	public void debug(String message) throws Exception {
		Log log = ReadProperties.readAppenders("debug",message);
		Class<?> c = Class.forName("Factory.Log"+"Debug"+"Factory");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("logger",Log.class);
		m.invoke(o, log);
	}

	public void info(String message) throws Exception {
		Log log = ReadProperties.readAppenders("info",message);
		Class<?> c = Class.forName("Factory.Log"+"Info"+"Factory");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("logger",Log.class);
		m.invoke(o, log);
	}

	public void error(String message) throws Exception {
		Log log = ReadProperties.readAppenders("error",message);
		Class<?> c = Class.forName("Factory.Log"+"Error"+"Factory");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("logger",Log.class);
		m.invoke(o, log);
	}

}
