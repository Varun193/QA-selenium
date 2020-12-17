package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webelements {
 WebDriver driver;
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.manage().window().maximize();
	 	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
		sendKeys(driver,search,10,"nba");
		
		WebElement click=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		clickOn(driver,click,10);
		Thread.sleep(10000);
		driver.quit();
	}
	public static void sendKeys(WebDriver driver1,WebElement element,int timeout,String value) {
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	public static void clickOn(WebDriver driver1,WebElement element,int timeout) {
		new WebDriverWait(driver1,10).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
