import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	private static final Logger log = Logger.getLogger(Main.class);
	private static final String LOG4J_PROPERTIES = "lib/log4j.properties";
	static {
		PropertyConfigurator.configure(LOG4J_PROPERTIES);
	}

	public static void main(String[] args) {
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");

	}

}
