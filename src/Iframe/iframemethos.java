package Iframe;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class iframemethos {
	WebDriver driver;
	@Test
	public void frames() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		
	/*	WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(obj); */
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		
	//	driver.switchTo().frame(0);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
