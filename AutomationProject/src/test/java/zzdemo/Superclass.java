package zzdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Superclass 
   {
      WebDriver driver;
      @Test
      public void launOHRM() throws InterruptedException
      {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	  Thread.sleep(2000);
      } 
   }
 class childClass extends Superclass
    {
	 @Test
	 public void login() throws InterruptedException
	 {
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	 
}