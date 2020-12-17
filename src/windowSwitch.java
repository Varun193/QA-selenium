import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class windowSwitch {
	static WebDriver driver;
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver" );
	
	
	driver = new ChromeDriver();
	 WebDriverWait Wait=new WebDriverWait(driver,20);
	 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	driver.get("https://demoqa.com/browser-windows");
	
	//driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//button[@id='windowButton']\""))).click();;
	// Open new child window within the main window
	String mainWindowHandle=driver.getWindowHandle();
	//get all window handles
	Set<String> allWindowHandles=driver.getWindowHandles();
	Iterator<String> iterator=allWindowHandles.iterator();
    // Here we will check if child window has other child windows and will fetch the heading of the child window
    while(iterator.hasNext()) {
		String ChildWindow = iterator.next();
        if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
        driver.switchTo().window(ChildWindow);
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println("Heading of child window is " + text.getText()); 
        driver.close();
        Thread.sleep(5);
        	
	}
	
	
}

 	
}
}



	


