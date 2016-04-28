package Entity;

public class Log {
	private String appenderName;
	private String conversionPattern;
	private String File;
	private String Target;
	private String message;
	public String getAppenderName() {
		return appenderName;
	}
	public void setAppenderName(String appenderName) {
		this.appenderName = appenderName;
	}
	public String getConversionPattern() {
		return conversionPattern;
	}
	public void setConversionPattern(String conversionPattern) {
		this.conversionPattern = conversionPattern;
	}
	public String getFile() {
		return File;
	}
	public void setFile(String file) {
		File = file;
	}
	public String getTarget() {
		return Target;
	}
	public void setTarget(String target) {
		Target = target;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Log [appenderName=" + appenderName + ", conversionPattern=" + conversionPattern + ", File=" + File
				+ ", Target=" + Target + ", message=" + message + "]";
	}
	public Log(String appenderName, String conversionPattern, String file, String target, String message) {
		super();
		this.appenderName = appenderName;
		this.conversionPattern = conversionPattern;
		File = file;
		Target = target;
		this.message = message;
	}
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
