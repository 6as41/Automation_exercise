 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
 
public class Add_Product_InCart 
  {              
	                      // Locators //
	private By Pro_button = By.xpath("//ul[@class='nav navbar-nav']//child::li[2]");
	
	private By prod1_atc_xpath = By.xpath("//div[@class='overlay-content']/p[text()='Blue Top']/following-sibling::a");
	private By prod2_atc_xpath = By.xpath("//div[@class='overlay-content']/p[text()='Men Tshirt']/following-sibling::a");

	private By hover1_xpath = By.xpath("//div/img[@src='/get_product_picture/1']");
	private By hover2_xpath = By.xpath("//div/img[@src='/get_product_picture/2']");

	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");
	private By continue_btn_xpath = By.xpath("//div/button[text()='Continue Shopping']");
	
	private By remove_Cursor1 =By.xpath("//a[@data-product-id='1']");
	private By remove_Cursor2 =By.xpath("//a[@data-product-id='2']");
	private By verify_remove_cart = By.xpath("//p/b[text()='Cart is empty!']");
	private By pro_visible_in_cart =By.xpath("//div[@class='table-responsive cart_info']");
	                    
	                      // Methods //
	public void product_Btn_click(WebDriver driver) throws InterruptedException {	
	    WebElement Pro_btn = driver.findElement(Pro_button );
	    Pro_btn.click(); 
	    driver.navigate().back();
	    Thread.sleep(2000);
    }    
	 public void prod1_atc(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		Actions action = new Actions(driver);
		WebElement hover1 = driver.findElement(hover1_xpath);
		action.moveToElement(hover1).perform();
		WebElement prod1_atc_btn = driver.findElement(prod1_atc_xpath);
		prod1_atc_btn.click();		
	}
	 public void prod2_atc(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement hover2 = driver.findElement(hover2_xpath);
		action.moveToElement(hover2).perform();
		WebElement prod2_atc_btn = driver.findElement(prod2_atc_xpath);
		prod2_atc_btn.click();
	}	
	public void view_cart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement view_cart_btn = driver.findElement(view_cart_btn_xpath);
		view_cart_btn.click();
		Thread.sleep(2000);
	}	
	public void continue_shopping(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		WebElement continue_btn = driver.findElement(continue_btn_xpath);
		continue_btn.click();
	}  
	public void remove_products(WebDriver driver) throws InterruptedException {
		WebElement remove_pro_btn1 = driver.findElement(remove_Cursor1);
		remove_pro_btn1.click();
		Thread.sleep(2000);
		
		WebElement remove_pro_btn2 = driver.findElement(remove_Cursor2);
		remove_pro_btn2.click();
		Thread.sleep(2000);
	}
	public void cartEmptytxt(WebDriver driver) {
		WebElement empty_cart_txt= driver.findElement(verify_remove_cart);
		Assert.assertTrue(empty_cart_txt.isDisplayed(), "cart empty not displayed");
    }
	public void Pro_Cart_Page_Visible(WebDriver driver) throws InterruptedException {
		WebElement Cart_pro_Visible_page = driver.findElement(pro_visible_in_cart);
	    Assert.assertTrue(Cart_pro_Visible_page.isDisplayed(), " products are not visible in cart");
	}
  }