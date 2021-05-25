package log;

public class loggertester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");

	}

}
