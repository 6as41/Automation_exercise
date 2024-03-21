package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Add_Product_InCart;
import pages.Cart_page;
import pages.Homepage;
import utils.Driver_setup;

public class Script_12 
  {
	WebDriver driver;
	@Test
	 public void Add_products_in_cart() throws InterruptedException {
	     
	    driver = Driver_setup.launch_Browser();
	  	Homepage hp = new Homepage();
	  	hp.navigate_to_autoex(driver);
	  	hp.homepage_displayed(driver);
		
	  	Add_Product_InCart apc = new Add_Product_InCart();
	  	apc.product_Btn_click(driver);
	  	apc.prod1_atc(driver);
	  	apc.continue_shopping(driver);
	  	apc.prod2_atc(driver);
	  	apc.view_cart(driver);
		
		Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);
	}
  }
