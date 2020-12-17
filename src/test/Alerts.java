package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	WebDriver driver;

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
	WebDriver driver=new ChromeDriver();
     driver.get("https://www.snapdeal.com/?utm_term=469343806318_57444771733_{bidstrategy}&gclid=CjwKCAiAnIT9BRAmEiwANaoE1ZgkssyohbFOqJGoAJE2IRTGTJreuzr7Tex060DLKiHgTeztyRwdxBoCrbMQAvD_BwE&utm_campaign=brand_account_brandcat_roas_ftu&utm_source=earth_sembrand&utm_medium=snapdeal");
    //Thread.sleep(1000);
    driver.findElement(By.xpath("//h3[contains(text(),'We would like to send you awesome offers!')]"));
    
	
	
	//Alert alert = driver.switchTo().alert();
//	String alertmessage =driver.switchTo().alert().getText();	
//	System.out.println(alertmessage);
	
	}

}
