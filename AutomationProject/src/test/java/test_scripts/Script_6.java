package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Contact_us_Form;
import pages.Homepage;
import utils.Driver_setup;

public class Script_6 
{
	 WebDriver driver;
     @Test
     public void Contact_us_form() throws InterruptedException 
     {
 	  driver = Driver_setup.launch_Browser();
 	  Homepage hp = new Homepage();
 	  hp.navigate_to_autoex(driver);
 	  hp.homepage_displayed(driver);
     
      Contact_us_Form csform =new Contact_us_Form();
      csform.enter_details(driver);
      csform.GetintouchDisplayed(driver);
      csform.Succesfull_msgDisplayed(driver);
     
      hp.homepage_displayed(driver);
     }
}