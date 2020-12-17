package Listeners;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerTest.class)
public class testNgExample {
	WebDriver driver;

	@Test
	public void examplecase(){
		System.setProperty("webdriver.chrome.driver","/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
		driver=new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.amazon.com");
		js.executeScript("0", "400");
		driver.quit();
		
		
	}
}
