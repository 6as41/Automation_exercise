package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Add_Product_InCart;
import pages.Cart_page;
import pages.Dn_invoice_afterPurchase_Order;
import pages.Homepage;
import pages.PO_Reg_While_Checkout;
import pages.Payment_Details;
import pages.Registration;
import pages.Signup_login;
import utils.Driver_setup;

public class Script_24 
  {
	WebDriver driver;
	@Test
	 public void Download_invoice_after_purchase_order() throws InterruptedException {
	     
	    driver = Driver_setup.launch_Browser();
	  	Homepage hp = new Homepage();
	  	hp.navigate_to_autoex(driver);
	  	hp.homepage_displayed(driver);
	  	  
	  	Add_Product_InCart apc = new Add_Product_InCart();
	  	apc.prod1_atc(driver);
	  	apc.continue_shopping(driver);
	  	apc.prod2_atc(driver);
	  	apc.view_cart(driver);
	  	  
	  	Cart_page cp = new Cart_page();
		cp.verify_prod_added(driver);  
	  	
		PO_Reg_While_Checkout prwc= new PO_Reg_While_Checkout();	
		prwc.CheckObtn(driver);
		
		Signup_login sl = new Signup_login();
		sl.new_user_register(driver);
		
		Registration r = new Registration();
		r.enter_details1(driver);
		r.enter_addr_info(driver);
		
		sl.logged_as_usernametxtDisplayed(driver);
		
		prwc.cartbtn(driver);
		prwc.CheckObtn(driver);
		prwc.VerifyAddressDetailstxtDisplayed(driver);
		prwc.Review_Your_Order_Deatils_txtDisplayed(driver);
		prwc.Add_txt_cmntBox(driver);
		
		Payment_Details pd =new Payment_Details();
		pd.PayDeatils(driver);
		
		prwc.VerifySuccessOrdertxtDisplayed(driver);
		
		Dn_invoice_afterPurchase_Order diao =new Dn_invoice_afterPurchase_Order();
		diao.Download_Button(driver);
		diao.Continue_Button(driver);
		diao.DeleteButton(driver);
		diao.AccountDeletedtxtDisplayed(driver);
    }
  }