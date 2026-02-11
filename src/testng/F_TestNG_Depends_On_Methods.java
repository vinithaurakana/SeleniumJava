package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class F_TestNG_Depends_On_Methods {
	WebDriver driver;
	
	@Test(dependsOnMethods="method2")
	public void method1() {
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Vinitha");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		
	}
	
	@Test
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
