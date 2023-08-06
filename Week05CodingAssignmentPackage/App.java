package Week05CodingAssignmentPackage;

public class App {

	public static void main(String[] args) {
		Logger ALogger = new AsteriskLogger();
		System.out.println("Asterisk Logger, log method: ");
		ALogger.log("Hello");
		System.out.println("-------------------------------------------");
		System.out.println("Asterisk Logger, error method: ");
		ALogger.error("Hello");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Logger SLogger = new SpacedLogger();
		System.out.println("Spaced Logger, log method: ");
		SLogger.log("Hello");
		System.out.println("-------------------------------------------");
		System.out.println("Spaced Logger, error method: ");
		SLogger.error("Hello");
		
	}

}
