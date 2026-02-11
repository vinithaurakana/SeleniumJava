package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jFramework {
	WebDriver driver;
	
  @Test
  public void techlearnlogin() {
	  Logger log= Logger.getLogger("Login Testcase");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome Browser Launched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser Window Maximised");
	  
	 
	  driver.get("https://www.techlearn.in/admin");
	  log.info("Navigate to the techlearn login page");
		
		driver.findElement(By.id("user_login")).sendKeys("vinitha");
	  log.info("Login User ID is Vinitha");
		
		driver.findElement(By.name("pwd")).sendKeys("Hello@12345");
		log.info("Password is Hello@12345");

		driver.findElement(By.id("rememberme")).click();
		log.info("Remember Checkbox to be selected");
	  
  }
}
