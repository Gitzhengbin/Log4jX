package Factory;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public abstract class LogFactory {
	public static String path;
	
	/**
	 * 输出至文件
	 * @param out
	 * @throws FileNotFoundException
	 */
	public static void fileLogger(String out) throws FileNotFoundException {
		File file = new File(path);
		if(file.exists()){
			file.mkdirs();
		}
		PrintStream p = new PrintStream(new BufferedOutputStream(new FileOutputStream(file, true)));
		p.println(out);
		p.close();
	}
	
	/**
	 * 输出调用LOG所在行数
	 * @return
	 */
	public static String lines(){
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		return stacks[stacks.length - 1].toString();
	}
	
}
