package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class G_TestNG_TCs_Invocation_Count {
	WebDriver driver;

	@Test(invocationCount=5)
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
	  @Test(invocationCount=3)
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
