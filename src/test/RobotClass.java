package test;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



    public class RobotClass  {
    	
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/srudrappan/practice/practice/lib/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		System.out.println("R");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("realme");
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(100000);
		driver.quit();
		
		
		
	}

}
