package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class H_TestNG_TimeOut_Feature {
	WebDriver driver;
	
	@Test(timeOut=3000)
	public void method1() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Vinitha");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		
	}
	
	@Test
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Mohana");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
