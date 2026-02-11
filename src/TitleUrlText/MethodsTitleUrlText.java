package TitleUrlText;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MethodsTitleUrlText {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void verifyTabTitle() {
		driver.get("https://www.google.com");
		
		String exptabtext = "Google";
		System.out.println("Expected Tab Text is :"+exptabtext);
		
		String acttabtext = driver.getTitle();
		System.out.println("Actual Tab text is :"+acttabtext);
		
		Assert.assertEquals(acttabtext, exptabtext);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void verifyApplicationURL() {
		driver.get("https://www.google.com");
		
		String expurl = "https://www.google.com/";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
	}
	
	@Test
	public void verifyApplicationText() {
		driver.get("https://www.google.com");
		
		String expemailtext = "Gmail";
		
		String actemailtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).getText();
		
		Assert.assertEquals(actemailtext, expemailtext);
		
		String expeimgtext = "Images";
		
		String actimgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Images')]")).getText();
		
		Assert.assertEquals(actimgtext, expeimgtext);
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}