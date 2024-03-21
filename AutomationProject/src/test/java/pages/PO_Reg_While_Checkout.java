package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PO_Reg_While_Checkout 
  {
	                          // locators //
    private By checkout_btn = By.xpath("//a[@class='btn btn-default check_out']");
    private By reg_login_btn = By.xpath("//a/u[text()='Register / Login']");
    private By cart_butn = By.xpath("//a[@href='/view_cart']");
    private By cmnt_msg = By.xpath("//*[@id=\"ordermsg\"]/textarea");
    private By placeOrder_btn = By.xpath("PlaceOrder");
    private By delete = By.xpath("//a[@href='/delete_account']");
    private By contiune_btn = By.xpath("//a[@data-qa='continue-button']");
    private By logged_as_username = By.xpath("//i[@class='fa fa-user']");
    private By add_details = By.xpath("//div/h2[text()='Address Details']");
    private By review_ordrDeatils = By.xpath("//div/h2[text()='Review Your Order']");
    private By Succesmsg = By.id("id=\"success_message\"");
    private By account_deleted_txt = By.xpath("//h2/b[text()='Account Deleted!']");
    
                             // methods //
    public void logged_as_usernametxtDisplayed(WebDriver driver) {
		WebElement logged_as_usernametxt = driver.findElement(logged_as_username);
		Assert.assertTrue(logged_as_usernametxt.isDisplayed(), "logged_as_username txt not displlayed");	
	}
    public void VerifyAddressDetailstxtDisplayed(WebDriver driver) {
		WebElement verifyaddDetails = driver.findElement(add_details);
		Assert.assertTrue(verifyaddDetails.isDisplayed(), "verify add Details txt not displlayed");
    }
    public void Review_Your_Order_Deatils_txtDisplayed(WebDriver driver) {
		WebElement orderDeatils = driver.findElement(review_ordrDeatils);
		Assert.assertTrue(orderDeatils.isDisplayed(), "order Deatils txt not displlayed");	
	}
    public void VerifySuccessOrdertxtDisplayed(WebDriver driver) {
		WebElement SuccessOrdermsg = driver.findElement(Succesmsg);
		Assert.assertTrue(SuccessOrdermsg.isDisplayed(), "Success Order msg not displlayed");	
	}
    public void AccountDeletedtxtDisplayed(WebDriver driver) {
		WebElement accDeltxt = driver.findElement(account_deleted_txt);
		Assert.assertTrue(accDeltxt.isDisplayed(), "Account Deleted txt not displlayed");	
	}
    
    public void CheckObtn(WebDriver driver) throws InterruptedException 
    {
    	WebElement checkout_button = driver.findElement(checkout_btn);
    	checkout_button.click();
    	Thread.sleep(1000);	
    	
    	WebElement reg_login_Button = driver.findElement(reg_login_btn);
    	reg_login_Button.click();
    	Thread.sleep(1000);
    }
    
    public void cartbtn (WebDriver driver) throws InterruptedException 
    {
    	WebElement cartbutton = driver.findElement(cart_butn);
    	cartbutton.click();
    	Thread.sleep(1000);
    }
    
    public void Add_txt_cmntBox (WebDriver driver) throws InterruptedException{
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(1000);
		
		WebElement Add_Cmnt_msg= driver.findElement(cmnt_msg);
		Add_Cmnt_msg.sendKeys("Good Products....");
		Thread.sleep(10000);
		
		WebElement PlaceOrder = driver.findElement(placeOrder_btn);
		PlaceOrder.click();
		Thread.sleep(1000);		
    }
    
    public void DeleteButton (WebDriver driver) throws InterruptedException{
       WebElement deletebtn = driver.findElement(delete);
       deletebtn.click();
       Thread.sleep(1000);
       
       WebElement continuebtn = driver.findElement(contiune_btn);
       continuebtn.click();
       Thread.sleep(1000);
   
    }
  }
