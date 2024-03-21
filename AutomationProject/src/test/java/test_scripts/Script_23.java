package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Add_Product_InCart;
import pages.Homepage;
import pages.Registration;
import pages.Signup_login;
import pages.Verify_addDetail_in_CheckOut_page;
import utils.Driver_setup;

public class Script_23
  {
	WebDriver driver;
	   @Test
	   public void Verify_address_detail_in_checkout_page() throws InterruptedException 
	    {
		   driver = Driver_setup.launch_Browser();
		   Homepage hp = new Homepage();
		   hp.navigate_to_autoex(driver);
		   hp.homepage_displayed(driver);
		   
		   Signup_login sp = new Signup_login();
		   sp.new_user_register(driver);
		  
		   Registration r = new Registration();
		   r.enter_details1(driver);
		   r.enter_addr_info(driver);
		   r.AccVerified_txtDisplayed(driver);
		   
		   sp.logged_as_usernametxtDisplayed(driver);
		   
		   Add_Product_InCart apc = new Add_Product_InCart();
		   apc.product_Btn_click(driver);
		   apc.prod1_atc(driver);
		   apc.continue_shopping(driver);
		   apc.prod2_atc(driver);
		   apc.view_cart(driver);
		   apc.Pro_Cart_Page_Visible(driver);
		   
		   Verify_addDetail_in_CheckOut_page vcp = new Verify_addDetail_in_CheckOut_page();
		   vcp.pro_CheckObtn(driver);
		   vcp.DeliveryAdd_isSameAdd_Displayed(driver);
		   vcp.BilingAdd_isSameAdd_Displayed(driver);
		   vcp.Delete_btn(driver);
		   vcp.account_deletedtxtDisplayed(driver);
		   vcp.Continue_btn(driver);
		   
        }
  }