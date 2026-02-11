package Dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropdownOptions {
	WebDriver driver;
	
  @Test
  public void dropdownselect() throws InterruptedException {
		driver.get("https://www.redmine.org");
		driver.findElement(By.xpath("//a[@class='register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("vinitha123@gmail.com");
		Thread.sleep(2000);
		
		Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		obj.selectByContainsVisibleText("Bu");
	//	obj.selectByIndex(15);
	//	obj.selectByValue("pt");
	//	obj.selectByVisibleText("Dutch (Nederlands)");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
	

