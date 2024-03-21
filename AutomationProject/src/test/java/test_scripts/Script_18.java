package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.View_Category_Products;
import utils.Driver_setup;

public class Script_18 
  {
    WebDriver driver;
    @Test
    public void View_category_products() throws InterruptedException 
    {
    	driver = Driver_setup.launch_Browser();
	  	Homepage hp = new Homepage();
	  	hp.navigate_to_autoex(driver);
	  	
	  	View_Category_Products vcp = new View_Category_Products();
	  	vcp.categoryTxtVisible(driver);
	  	
	  	vcp.womenCategory(driver);
	  	vcp.Women_category_Page_txt_Visible(driver);
	  	
	  	vcp.menCategory(driver);
	  	vcp.Men_category_Page_txt_Visible(driver);
    }
  }
