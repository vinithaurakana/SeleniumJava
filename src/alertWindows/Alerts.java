package alertWindows;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alerts {
	WebDriver driver;
	 @Test
	  public void alertokbutton() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();

	  }
	  
	  
	  @Test
	  public void alertcancelbutton() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(3000);
		  driver.switchTo().alert().dismiss();
	  }
	  
	  @Test
	  public void alertsendtextokcancelbutton() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().sendKeys("Vintha");
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept();	 
	  }
	  
	  
	  @Test
	  public void UsingAlertClasssendtextokcancelbutton() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(2000);
		  
		  Alert a = driver.switchTo().alert();
		  a.sendKeys("Urakana");
		  a.accept();
	  }
	  
	  @Test
	  public void noalertwindow() throws InterruptedException {
		  driver.get("https://www.techlearn.in/");
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();
		 // NoAlertPresentExecption
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

	}

}
