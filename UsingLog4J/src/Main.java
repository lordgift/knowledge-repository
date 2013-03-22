import org.apache.log4j.Logger;

public class Main {
	private static final Logger log = MyLog.getLogger(Main.class);

	public static void main(String[] args) {
		/* order by log4j level */
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
	}

}
