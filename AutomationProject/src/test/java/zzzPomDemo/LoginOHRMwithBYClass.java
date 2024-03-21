package zzzPomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOHRMwithBYClass 
  {
	WebDriver driver;
	
	public LoginOHRMwithBYClass(WebDriver driver)  //constructor without void
	{
		this.driver = driver;
	}
	
	//making ******Repository of webelement with using By Class*******
	    // its hardcore data
	By USERNAME = By.name("username");
	By PASSWORD = By.name("password");
	By LOGINBTN = By.xpath("//button[@type='submit']");
	
	 // its method which we'r going to call in calling class with their action(send.click...)
	public void launchURL() throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	public void Username(String un) 
	{
		driver.findElement(USERNAME).sendKeys(un);
	}
	public void Password(String pw) 
	{
		driver.findElement(PASSWORD).sendKeys(pw);
	}
	public void Loginbutton() 
	{
		driver.findElement(LOGINBTN).click();
	}
	
	// calling all methods in single method(with mthd name)
	public void Loginprocess(String un,String pw) throws InterruptedException 
	{
		launchURL();
		Username(un);
		Password(pw);
		Loginbutton();
	}
	
  }
