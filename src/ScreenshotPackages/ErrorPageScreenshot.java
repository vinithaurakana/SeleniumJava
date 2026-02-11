package ScreenshotPackages;

import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenshot {
WebDriver driver;

public void errorPageLineScreenshot() throws Exception {	
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\Vinitha\\Screenshots\\ErrorLineScreenPage.png"));
}
		
	@Test
	public void techlearnlogin() throws Exception {
		driver.get("https://www.techlearn.in/admin");			
		
		try
		{
		
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Vintha U");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='rememberme']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"user_loginxyz\"]")).sendKeys("vinitha123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		}
		
		catch(Exception e)
		{
			System.out.println("Error Page: "+e);
			errorPageLineScreenshot();
		}
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}