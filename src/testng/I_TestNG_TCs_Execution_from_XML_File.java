package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class I_TestNG_TCs_Execution_from_XML_File {
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
	  @Test
	  public void redmine() {
		  driver.get("https://www.redmine.org");
	  }
	  @Test
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
@BeforeTest
public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
}

}
