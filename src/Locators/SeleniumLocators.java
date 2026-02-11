package Locators;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() 	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

    @Test
	void idnameclass() throws Exception {
    	driver.get("https://www.techlearn.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("user_login")).sendKeys("vinithaurakana");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Hello@12345");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("wp-login-lost-password")).click();	
		
	}
    @Test
	void cssSelectorlocator() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#user_login")).sendKeys("Vini");
	//	driver.findElement(By.cssSelector("input#user_login")).sendKeys("Vini");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
	//	driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
	}
    @Test
	void linktextandpatiallinketext() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost")).click();
	}
}
