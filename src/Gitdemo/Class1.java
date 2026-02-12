package Gitdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Class1 {
	WebDriver driver;
  @Test
  public void Techlearn() {
	  driver.get("https://www.techlearn.in/");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
