package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class J_TestNG_TCs_Execution_from_Groups {
	WebDriver driver;
	
	@Test(groups="Food")
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  @Test(groups="E commerse")
	  public void flipkart() {
		  driver.get("https://www.flipkart.com");
	  }
	  @Test(groups="AI")
	  public void grok() {
		  driver.get("https://www.grok.com/");
	  }
	  @Test(groups={"Search", "AI"})
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test(groups="Socail")
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }	
	  @Test(groups="AI")
	  public void deepseek() {
		  driver.get("https://www.deepseek.com/");
	  }
	  @Test(groups="News")
	  public void ndtv() {
		  driver.get("https://www.ndtv.com");
	  }	
	  @Test(groups="Social")
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(groups="Food")
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  @Test(groups="Tech")
	  public void redmine() {
		  driver.get("https://www.redmine.org");
	  }
	  @Test(groups="News")
	  public void hindhu() {
		  driver.get("https://www.thehindu.com/");
	  }	
	  @Test(groups="Tech")
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  @Test(groups="AI")
	  public void chatgpt() {
		  driver.get("https://www.chatgpt.com/");
	  }
@BeforeTest(groups="AI")
public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
}

}
