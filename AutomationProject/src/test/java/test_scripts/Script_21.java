package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Add_Review;
import pages.Homepage;
import utils.Driver_setup;

public class Script_21
  {
	WebDriver driver;
	   @Test
	   public void Add_review_On_product() throws InterruptedException 
	    {
		   driver = Driver_setup.launch_Browser();
		   Homepage hp = new Homepage();
		   hp.navigate_to_autoex(driver);
		   
		   Add_Review ar = new Add_Review();
		   ar.Navigated_to_All_Pro_Page(driver);
		   ar.Search_Page(driver);
		   ar.Write_review_txt_Visble(driver);
		   ar.add_review(driver);
		   ar.Verify_success_message(driver);
		   
        }
  }