package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Product_Page;
import utils.Driver_setup;

public class Script_13 
  {
	WebDriver driver;
	@Test
	 public void Verify_product_quantity_in_cart() throws InterruptedException {
	     
	      driver = Driver_setup.launch_Browser();
	  	  Homepage hp = new Homepage();
	  	  hp.navigate_to_autoex(driver);
	  	  hp.homepage_displayed(driver);
	  	  
	      Product_Page pp = new Product_Page();
	  	  pp.viewpro_page(driver);  
	  	  pp.ProductInfo(driver);  
	  	  pp.ProductQuantityVerify(driver);  

	}
}