package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.View_and_Cart_Brand_Products;
import utils.Driver_setup;

public class Script_19 
  {
    WebDriver driver;
   @Test
   public void View_and_cart_brand_poducts() throws InterruptedException 
    {
	   driver = Driver_setup.launch_Browser();
	   Homepage hp = new Homepage();
	   hp.navigate_to_autoex(driver);
	   
	   View_and_Cart_Brand_Products vcbp = new View_and_Cart_Brand_Products();
	   vcbp.Product_Page(driver);
	   vcbp.Brands_Option_Visible(driver);
	   vcbp.Navigated_BrandPage_Visible(driver);
	   vcbp.Navigated_BrandProducts_Visible(driver);
	   
	   vcbp.Navigate_Other_Brandpage(driver);
	   vcbp.Navigated_Other_BrandPage_Visible(driver);	 
	   vcbp.Navigated_Other_BrandProducts_Visible(driver);
    }
  }
