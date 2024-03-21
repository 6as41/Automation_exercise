package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Scrollup_Without_Arrow;
import utils.Driver_setup;

public class Script_26 
  {
	  WebDriver driver;
      @Test
      public void Verify_Scroll_Up_without_Arrow_btn_and_Scroll_Down_functionality() throws InterruptedException
      {
      driver = Driver_setup.launch_Browser();
  	  Homepage hp = new Homepage();
  	  hp.navigate_to_autoex(driver);
  	  hp.homepage_displayed(driver);
  	  
  	  Scrollup_Without_Arrow swa =new Scrollup_Without_Arrow();
  	  swa.verifying_subscription_text(driver);
  	  swa.ScrollUp_Without_Arrow(driver);
  	 
   }
}