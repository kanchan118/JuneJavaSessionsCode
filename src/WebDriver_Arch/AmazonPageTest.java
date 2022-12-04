package WebDriver_Arch;

public class AmazonPageTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//chrome
		//firefox
		//safari
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			//System.out.println();
			break;
			
		case "firefox":
			driver = new FireFoxDriver();
			//System.out.println();
			break;
			
		case "safari":
			driver = new SafariDriver();
			//System.out.println();
			break;

		default:
			System.out.println("plz pass the right browser ::: " + browser);
			break;
		}
		
		
		//WebDriver driver = new ChromeDriver();//top casting
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.sendKeys("emailID", "naveen@gmail.com");
		driver.sendKeys("password", "naveen123");
		driver.click("loginbtn");
		
		driver.close();
		
		
		
	}

}
