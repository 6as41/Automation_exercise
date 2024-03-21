package zzzPomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutOHRmwithBYClass 
   {
	WebDriver driver;
   public LogoutOHRmwithBYClass(WebDriver driver) //constructor without void
   {
	   this.driver = driver;
   }
     //making ******Repository of webelement with using By Class*******
            // its hardcore data
	By PROFILEPIC = By.xpath("//span[@class='oxd-userdropdown-tab']");
	By LOGOUT = By.xpath("//a[@href='/web/index.php/auth/logout']");
	
	// its method which we'r going to call in calling class with their acton(send.click...)
	public void ProfilePic() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(PROFILEPIC).click();
		Thread.sleep(2000);
	}
	public void LogOut() throws InterruptedException 
	{
		driver.findElement(LOGOUT).click();
		Thread.sleep(2000);
	}
	
	
   }
