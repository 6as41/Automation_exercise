package zzzPomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOHRMwithPAGE 
   {
     WebDriver driver;
     public LoginOHRMwithPAGE(WebDriver wd) 
     {
    	 driver = wd;
    	 PageFactory.initElements(driver, this);
    	 
     }
   //making ******Repository of webelement with using @findby annotation*******
           // its hardcore data
     
     @FindBy(xpath="//input[@name='username']")WebElement USERname;
     @FindBy(xpath="//input[@name='password']")WebElement PASSword;
     @FindBy(xpath="//button[@type='submit']")WebElement LOGinbtn;
     
     // its method which we'r going to call in calling class with their action(send.click...)
     public void url() throws InterruptedException 
     {
    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 Thread.sleep(2000);
     }
     public void username(String un) 
     {
    	 USERname.sendKeys(un);
     }
     public void password(String pw) 
     {
    	 PASSword.sendKeys(pw);
     }
     public void loginbutton() 
     {
    	 LOGinbtn.click();
     }
     
  // calling all methods in single method(with mthd name)
     public void loginprocess(String un,String pw) throws InterruptedException 
     {
    	 url();
    	 username(un);
    	 password(pw);
    	 loginbutton();
     }
   }

