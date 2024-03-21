package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Add_recomnded_item 
  { 	                     
                                // Locators //
	private By rec_itm_visible = By.xpath("//h2[text()='recommended items']");
	private By add_cart = By.xpath("//img[@src='get_product_picture/4']/following-sibling::a");
	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");
	private By verify_pro_addedtoCart = By.xpath("//div[@class='table-responsive cart_info']");
    
	                            // Methods //
	public void rec_Item_Visible(WebDriver driver) throws InterruptedException {
	    WebElement visible_txt = driver.findElement(rec_itm_visible);
	    Assert.assertTrue(visible_txt.isDisplayed(), "Rcommended items' are not visible");
       }
	public void pro_displayed_in_cartpage(WebDriver driver) throws InterruptedException {
	    WebElement visible_txt = driver.findElement(verify_pro_addedtoCart);
	    Assert.assertTrue(visible_txt.isDisplayed(), "product are not displayed in cart page");
       }
	
	public void Add_pro(WebDriver driver) throws InterruptedException {
    	JavascriptExecutor jss = (JavascriptExecutor) driver;
    	jss.executeScript("window.scrollBy(0,7500)", "");
    	Thread.sleep(1000);
       
    	WebElement addToCart = driver.findElement(add_cart);
    	addToCart.click();
    	Thread.sleep(1000);
    	
    	WebElement viewCart = driver.findElement(view_cart_btn_xpath);
    	viewCart.click();
    	Thread.sleep(1000);
	}
  }
