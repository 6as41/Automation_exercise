package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Search_Pro_Verify_cart;
import pages.Search_Product;
import utils.Driver_setup;

public class Script_20 
  {
	WebDriver driver;
	   @Test
	   public void Search_product_and_verify_cart_after_login() throws InterruptedException 
	    {
		   driver = Driver_setup.launch_Browser();
		   Homepage hp = new Homepage();
		   hp.navigate_to_autoex(driver);
		   
		   Search_Product sp =new Search_Product();
		   sp.Search_Page(driver);
		   sp.seacrched_product_visible(driver);
		   sp.Related_product(driver);
		   sp.Navigated_to_All_Pro_Page(driver);
		   
		   Search_Pro_Verify_cart spvc = new Search_Pro_Verify_cart();
		   spvc.prod1_atc(driver);
		   spvc.prod2_atc(driver);
		   spvc.prod3_atc(driver);
		   spvc.Pro_Cart_Page_Visible(driver);
		   
		   spvc.Loggin_signup(driver);
		   spvc.Again_CartPage_Verify(driver);
		   spvc.Pro_Cart_Page_Visible(driver);
		   
   }
 }