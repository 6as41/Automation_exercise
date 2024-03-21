package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Add_recomnded_item;
import pages.Homepage;
import utils.Driver_setup;

public class Script_22 
  {
	WebDriver driver;
	   @Test
	   public void Add_to_cart_from_recommnded_item() throws InterruptedException 
	    {
		   driver = Driver_setup.launch_Browser();
		   Homepage hp = new Homepage();
		   hp.navigate_to_autoex(driver);
		   
		   Add_recomnded_item ari = new Add_recomnded_item();
		   ari.rec_Item_Visible(driver);
		   ari.Add_pro(driver);
		   ari.pro_displayed_in_cartpage(driver);
        }
  }