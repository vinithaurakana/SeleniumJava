package Actions;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsRCDCDDMHKF {
	WebDriver driver;
	
	@Test
	public void rightClick() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(7000);
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Downloads']"))).build().perform();
		}
	
	@Test
	public void doubleClick() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/double-tap/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
	//	act.doubleClick(driver.findElement(By.xpath("//button[@doubleblclick='handleDoubleTap()']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).doubleClick().build().perform();
	}
	
	@Test
	public void draganddrop() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/drag-and-drop/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
		
		act.dragAndDrop(source, target).build().perform();
	}
	
	
	@Test
	public void mouseover() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-46\"]/a"))).click().build().perform();
		//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-46\"]/a")).click();
		
	}
	
	@Test
	public void keyboardfunctions() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//act.sendKeys(Keys.TAB).build().perform();
	
	}
	
	
	@Test
	public void robotclass() throws InterruptedException, AWTException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	@Test
	public void Enterbutton() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Vinitha");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}