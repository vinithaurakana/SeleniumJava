package testng;

import org.testng.annotations.Test;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class D_TestNG_TCs_Exection_Skip_Disabled_Ignore {
	WebDriver driver;
	  @Test(priority=2, enabled=false)
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test(priority=4)
	  public void flipkart() {
		  driver.get("https://www.flipkart.com");
	  }
	  @Test(enabled=false, priority=1)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test(priority=3, enabled=true)
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
	  @Ignore
	  @Test(priority=5)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(priority=0, enabled = false)
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

	}
