package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Listeners {
         static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
		 driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		EventFiringWebDriver eventHandler=new EventFiringWebDriver(driver);
		EventCapture ecapture= new EventCapture();
		eventHandler.register(ecapture);
		eventHandler.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAiA4o79BRBvEiwAjteoYD1R3_vOcgYz8seJMrt_0EczjxbZVZ8QLGrndwIHfjXZswkO1HhzAhoCdOoQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiA4o79BRBvEiwAjteoYD1R3_vOcgYz8seJMrt_0EczjxbZVZ8QLGrndwIHfjXZswkO1HhzAhoCdOoQAvD_BwE");
		eventHandler.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("realme");
		js.executeScript("window.scrollBy(0,400)");
		driver.quit();
        eventHandler.unregister(ecapture);
	   
		
		
		

	}

}
