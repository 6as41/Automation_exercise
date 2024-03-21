package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_3 
    {
      WebDriver driver;
      @Test
      public void Login_user_with_incorrect_credentials() throws InterruptedException {
      	  driver = Driver_setup.launch_Browser();
      	  Homepage hp = new Homepage();
      	  hp.navigate_to_autoex(driver);
      	  hp.homepage_displayed(driver);
          hp.click_signup_login(driver);
          
          Signup_login slp = new Signup_login();  
          slp.login_to_acctxtDisplayed(driver);         
          slp.signup_invalid_cred(driver);              
          slp.invalid_passtxtDisplay(driver);            
   
    }
}