package ScreenshotPackages;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MethodsofScreenshots {
	private static final String FileUtils = null;
	WebDriver driver;
	
	public void takeScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date(0);
		String time = dateFormat.format(date);
		//System.out.println(time);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Vinitha\\Screenshots\\Techlearn_" + time + ".png"));
	}	
		

		@Test
		public void techlearnlogin() throws Exception {
			driver.get("https://www.techlearn.in/admin");
			Thread.sleep(2000);
			takeScreenshot();
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Vinitha");
			Thread.sleep(1000);
			takeScreenshot();
			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Test@12345");
			Thread.sleep(1000);
			takeScreenshot();
			driver.findElement(By.xpath("//input[@id='rememberme']")).click();
			Thread.sleep(2000);
			takeScreenshot();
			driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
			takeScreenshot();
		}

		@Test(enabled=false)
		public void facebook() throws Exception {
			driver.get("http://seleniumlearn.com/selenium-commands");
			Thread.sleep(6000);
			

			String selectalltext = Keys.chord(Keys.CONTROL, "a"); // select all text in techlearn.in home page
			driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(selectalltext);		           
			
		}

		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}