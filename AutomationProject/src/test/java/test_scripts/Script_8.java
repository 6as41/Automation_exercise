package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Product_Page;
import utils.Driver_setup;

public class Script_8 
  {
	WebDriver driver;
    @Test
    public void Verify_all_products_and_product_deatail_page() throws InterruptedException 
    { 
      driver = Driver_setup.launch_Browser();
  	  Homepage hp = new Homepage();
  	  hp.navigate_to_autoex(driver);
  	  hp.homepage_displayed(driver);
  	  
  	  Product_Page pp = new Product_Page();
  	  pp.Navigated_Product_Page(driver);
  	  pp.allproDetailPage(driver); 
  	  
    }
  }