package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Subscription_In_Home_Page;
import utils.Driver_setup;

public class Script_10
  {
	WebDriver driver;
    @Test
    public void Verify_Subscription_in_home_page() throws InterruptedException {
     
     driver = Driver_setup.launch_Browser();
  	 Homepage hp = new Homepage();
  	 hp.navigate_to_autoex(driver);
  	 hp.homepage_displayed(driver);
  	  
  	 Subscription_In_Home_Page subs = new Subscription_In_Home_Page();
  	 subs.Search_Page(driver);
  	 subs.verifying_sub_text(driver);
  	 subs.successfully_msg_(driver); 

  }
}