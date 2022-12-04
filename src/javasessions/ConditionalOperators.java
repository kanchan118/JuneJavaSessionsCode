package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		
		int i = 20;//= is assignment operator
		int j = 10;
		
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		//> < >= <= ==
		
		if(10==20) {
			System.out.println("hii");//dead code
		}else {
			System.out.println("bye");
		}
		
		//
		if(false) {
			System.out.println("selenium");
		}
		else {
			System.out.println("cypress");
		}
		
		//
		boolean flag = true;
		if(flag) {
			System.out.println("testing with selenium");
		}
		else
		{
			System.out.println("testing with cypress");
		}
		
		//
		//nested if
		int total = 82;
		if(total<= 100) {
			System.out.println("PASS");
			if(total>=90) {
				System.out.println("A Grade");
					if(total >= 95) {
						System.out.println("100% discount....");
					}
					else
					System.out.println("70% discount ....");
					}
					else {
						System.out.println("B Grade");
					}			
		}
		else {
			System.out.println("Invalid marks");
		}
		
		//
		//take a browser value ..ch//ff//ie//safari
		// if the condition is matched ..launch the browser
//		String browser = "ie";
//		if(browser.equals("chrome")) {
//			System.out.println("launch the chrome ...");
//		}
//		if (browser.equals("firefox")){
//				System.out.println("launch the firefox ...");
//		}
//		if (browser.equals("ie")){
//			System.out.println("launch the ie ...");
//		}
//		else {
//			System.out.println("Please pass the right browser.."+browser);
//		}
		
		//if - else if:
		//take a browser value ..ch//ff//ie//safari
		// if the condition is matched ..launch the browser
		//else print a msg : please pass the right browser
		
		String browserName = "opera";
		if(browserName.equals("chrome")) {
			System.out.println("launch chrome.....");
		}else if(browserName.equals("firefox")) {
			System.out.println("lanch firefox....");
		}else if(browserName.equals("ie")) {
			System.out.println("launch ie....");
		}else {
			System.out.println("please pass the right browser ..." + browserName);
		}
		
		
		

	}

}
