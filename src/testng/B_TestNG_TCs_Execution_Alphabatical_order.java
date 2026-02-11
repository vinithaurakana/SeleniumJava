package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class B_TestNG_TCs_Execution_Alphabatical_order {
	WebDriver driver;
	@Test
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test
	  public void flipkart() {
		  driver.get("https://www.flipkart.com");
	  }
	  @Test
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
	  @Test
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

}
 
