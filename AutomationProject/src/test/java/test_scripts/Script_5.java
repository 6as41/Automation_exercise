package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_5 
    {
         WebDriver driver;
         @Test
         public void Register_user_with_existing_email() throws InterruptedException 
         {
        	driver = Driver_setup.launch_Browser();
       	  
         	Homepage hp = new Homepage();      
       		hp.navigate_to_autoex(driver);     
       		hp.homepage_displayed(driver);     
       		hp.click_signup_login(driver);    
       		
       		Signup_login slp = new Signup_login();  
            slp.email_allredy_exit(driver);
            slp.email_allredy_exittxtDisplayed(driver);
         }  
    }