package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngexample2 {

	public String url="https://www.amazon.com/";
			public WebDriver driver;
	String Path="/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver";
	String geturl;
	
	@BeforeTest
	public void geturl() {
		System.setProperty("webdriver.chrome.driver", "/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	@Test
	public void checkLink() throws Exception {
		 geturl=driver.getCurrentUrl();
	 Thread.sleep(1000);
	
	 
	 
	}
	
	@AfterTest
	public void comparing(){
		Assert.assertEquals(url,geturl,"Both url matched");
		driver.quit();
	}
	
	
}

