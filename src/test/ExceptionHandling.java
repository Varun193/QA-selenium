package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {
 static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
     driver = new ChromeDriver();
    driver.get("https://google.com");
    try {
    driver.findElement(By.name("varun"));
    
	}catch(Exception e){
		System.out.print("no such element varun");
	throw(e);
	}
    driver.quit();

 }
}