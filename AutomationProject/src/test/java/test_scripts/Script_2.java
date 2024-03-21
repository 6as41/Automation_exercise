package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Logged_in_page;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_2 
    {
      WebDriver driver;
      @Test
      
      public void login_User_with_correct_credentials() throws InterruptedException 
     {
  	  driver = Driver_setup.launch_Browser();
  	  Homepage hp = new Homepage();
  	  hp.navigate_to_autoex(driver);
  	  hp.homepage_displayed(driver);
      hp.click_signup_login(driver);
      
      Signup_login slp = new Signup_login();   
      slp.login_to_acctxtDisplayed(driver);         
      slp.signup_user_valid_cred(driver);              
      slp.account_deletedtxtDisplayed(driver);     
  
      Logged_in_page lp = new Logged_in_page();
	  lp.verify_logged_in(driver);             
      
	  slp.account_deletedtxtDisplayed(driver);
      } 
   
   }
