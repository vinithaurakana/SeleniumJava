package NewTabs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MethodsOfNewTabs {
	WebDriver driver;

	@Test
	public void newtabs() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Download Eclipse']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Collaborations']")).click();
		
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
		
	}
	
	
	@Test
	public void googlefacebook() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.facebook.com");
		
		
	}
	
	@Test
	public void techlearnnewtab() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);

		// driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.selenium.dev");

		// driver.close();
		Thread.sleep(2000);
		
		
	/* 	Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[1].toString()); */


		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(2000);
		
		Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[0].toString()); 

		driver.findElement(By.xpath("//a[contains(text(),'Placements')]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}