import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLog {
	
	private static final String LOG4J_PROPERTIES = "lib/log4j.properties";
	static {
		PropertyConfigurator.configure(LOG4J_PROPERTIES);
	}
	
	public static Logger getLogger(Class clazz) {
		Logger log = Logger.getLogger(clazz);
		return log;
	}
}
