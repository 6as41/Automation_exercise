package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Search_Product;
import utils.Driver_setup;

public class Script_9 
  {
	 WebDriver driver;
     @Test
     public void Search_product() throws InterruptedException 
     {
    	  driver = Driver_setup.launch_Browser();
    	  Homepage hp = new Homepage();
    	  hp.navigate_to_autoex(driver);
    	  hp.homepage_displayed(driver);
    	  
    	  Search_Product sp = new Search_Product();
    	  sp.Search_Page(driver);	  
    	  sp.seacrched_product_visible(driver);	  
    	  sp.Related_product(driver);
    	  sp.Navigated_to_All_Pro_Page(driver); 
  }
}