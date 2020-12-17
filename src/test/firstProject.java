package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class firstProject {
	
	static String browser;
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
//	//	String projectLocation = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/chromedriver/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://cricbuzz.com/");
//		//driver.wait(10);
//        driver.quit();
		getBrowser();
		getBrowserConfig();
		getRunBrowser();
	}

	public static void getBrowser() {
		 browser="chromeDriver";
		
	}
	
	public static void getBrowserConfig() {
		 String projectLocation = System.getProperty("user.dir");
		if(browser.contains("chromeDriver")) {
			 driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", projectLocation+"/lib/chromedriver/chromedriver");
	 }
		else {
			Assert.fail("Fail");
		}
		
	}
	public static void getRunBrowser() {
		
		driver.get("https://cricbuzz.com/");
		driver.quit();
	}
 }
