package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Test_Pages;
import utils.Driver_setup;

public class Script_7 
   {
	 WebDriver driver;
     @Test
     public void Verify_test_cases_page() throws InterruptedException 
     {
    	  driver = Driver_setup.launch_Browser();
    	  Homepage hp = new Homepage();
    	  hp.navigate_to_autoex(driver);
    	  hp.homepage_displayed(driver);
     
    	  Test_Pages tp =new Test_Pages();
          tp.navigated_TestCase_Page(driver);
     
     }
}