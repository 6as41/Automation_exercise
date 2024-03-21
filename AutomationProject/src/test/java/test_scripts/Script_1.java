package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Account_Created;
import pages.Homepage;
import pages.Logged_in_page;
import pages.Registration;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_1 
   {
	WebDriver driver;
	@Test
	public void register_user() throws InterruptedException {
		driver = Driver_setup.launch_Browser();       
		Homepage hp = new Homepage();
		hp.navigate_to_autoex(driver);                
		hp.homepage_displayed(driver);                
		hp.click_signup_login(driver);               
		
		Signup_login slp = new Signup_login();
		slp.new_user_txtDisplayed(driver);           
		slp.new_user_register(driver);                
		
		Registration rp = new Registration();         
		rp.enter_details1(driver);                    
		rp.enter_addr_info(driver);
		
		Account_Created ac = new Account_Created();
		ac.verify_acc_created(driver);
					
		Logged_in_page lp = new Logged_in_page();
		lp.verify_logged_in(driver);
		
		slp.account_deletedtxtDisplayed(driver);
	}
	
   } 
