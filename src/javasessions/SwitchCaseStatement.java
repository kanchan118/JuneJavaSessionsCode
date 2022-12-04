package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		
		//take a browser value ..ch//ff//ie//safari
		// if the condition is matched ..launch the browser
		//else print a msg : please pass the right browser
		
		String browser = "opera";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;//break entire switch case
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("Please pass the right browser.."+browser);
			break;
		}
		
		//multiple environment: QA/DEV/UAT/STAG/PROD
		//cross browser logic
		//locator:
		
		int total = 100;
		
		//switch case : byte, short, int, long, double, float, char, String
		
		
		
		

	}

}
