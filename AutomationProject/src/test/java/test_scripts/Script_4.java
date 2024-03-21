package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_4 
    {
      WebDriver driver;
      @Test
      public void logout_user() throws InterruptedException 
      {
    	driver = Driver_setup.launch_Browser();
    	  
    	Homepage hp = new Homepage();    
  		hp.navigate_to_autoex(driver);     
  		hp.homepage_displayed(driver);     
  		hp.click_signup_login(driver);     
  		

  	    Signup_login slp = new Signup_login();   
        slp.login_to_acctxtDisplayed(driver);         
    
        slp.logout_user_process(driver);       
        Thread.sleep(3000);
        slp.log_outtxtDisplayed(driver);
        Thread.sleep(2000);
        slp.logged_as_usernametxtDisplayed(driver);
   
      }
    }
