package ScreenshotPackages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectedWebElementScreenshot {
	private static final String FileUtils = null;
	WebDriver driver;
	
	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
								
		WebElement lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']"));

		File f = lyp.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Vinitha\\Screenshots\\lostlink.png")); 
		
		
		
	/*	WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("TestNG"); */
		
	//	driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
