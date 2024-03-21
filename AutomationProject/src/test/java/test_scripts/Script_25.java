package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Scrollup_Using_Arrow;
import utils.Driver_setup;

public class Script_25 
  {
	WebDriver driver;
    @Test
    public void Verify_Scroll_Up_using_Arrow_btn_and_Scroll_Down_functionality() throws InterruptedException
    {
      driver = Driver_setup.launch_Browser();
  	  Homepage hp = new Homepage();
  	  hp.navigate_to_autoex(driver);
  	  hp.homepage_displayed(driver);
  	  
  	  Scrollup_Using_Arrow sua = new Scrollup_Using_Arrow();
  	  sua.verifying_subscription_text(driver);
  	  sua.Scroll_Up_with_Arrow(driver);
  	  sua.Page_title_txt_Visible(driver);
   }
  }