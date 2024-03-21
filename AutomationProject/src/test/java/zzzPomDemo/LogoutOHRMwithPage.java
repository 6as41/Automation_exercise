package zzzPomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutOHRMwithPage
   {
	WebDriver driver;
	
	public LogoutOHRMwithPage(WebDriver wd) 
	{
		driver = wd;
		PageFactory.initElements(driver, this);
	}
	//making ******Repository of webelement with using @findby annotation*******
           // its hardcore data
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")WebElement PROFILEPIC;
	@FindBy(xpath="//a[@href='/web/index.php/auth/logout']")WebElement LOGOUT;
	
	// its method which we'r going to call in calling class with their action(send.click...)
	public void profilepic() throws InterruptedException 
	{
		Thread.sleep(2000);
		PROFILEPIC.click();
	}
	public void logout() 
	{
		LOGOUT.click();
	}
	
	

   }
