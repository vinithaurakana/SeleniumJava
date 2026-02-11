package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class E_TestNG_Description_Feature {
	WebDriver driver;
	
	@Test(description="Zomoto application")
	  public void testcase1() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test(description="Flipkart application")
	  public void testcase2() {
		  driver.get("https://www.flipkart.com");
	  }
	  @Test(description="Google application")
	  public void testcase3() {
		  driver.get("https://www.google.com");
	  }
	  @Test(description="Twitter application")
	  public void testcase4() {
		  driver.get("https://www.x.com");
	  }
	
	  @Test(description="Facebook application")
	  public void testcase5() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(description="Swiggy application")
	  public void testcase6() {
		  driver.get("https://www.swiggy.com");
	  }
	  @Test(description="Redmine application")
	  public void testcase7() {
		  driver.get("https://www.redmine.org");
	  }
	  @Test(description="Selenium application")
	  public void testcase8() {
		  driver.get("https://www.selenium.dev");
	  }
@BeforeTest
public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
}

}
