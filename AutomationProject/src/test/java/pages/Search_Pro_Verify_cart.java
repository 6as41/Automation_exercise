package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Search_Pro_Verify_cart
  {
	                       // locators //
	private By prod1_atc = By.xpath("//div[@class='overlay-content']/p[text()='Cotton Silk Hand Block Print Saree']/following-sibling::a");
	private By prod2_atc = By.xpath("//div[@class='overlay-content']/p[text()='Rust Red Linen Saree']/following-sibling::a");
	private By prod3_atc = By.xpath("//div[@class='overlay-content']/p[text()='Beautiful Peacock Blue Cotton Linen Saree']/following-sibling::a");
	private By hover1_btn = By.xpath("//div/img[@src='/get_product_picture/39']");
	private By hover2_btn = By.xpath("//div/img[@src='/get_product_picture/40']");
	private By hover3_btn = By.xpath("//div/img[@src='/get_product_picture/41']");
	private By continue_btn = By.xpath("//div/button[text()='Continue Shopping']");
	private By view_cart_btn_xpath = By.xpath("//a/u[text()='View Cart']");
	private By LogorSIGN_btn = By.xpath("//a[@href='/login']");
	private By pro_visible_in_cart =By.xpath("//div[@class='table-responsive cart_info']");
	private By cemail = By.xpath("//input[@data-qa='login-email']");
	private By pass = By.name("password");
	private By cart_btn = By.xpath("//ul[@class='nav navbar-nav']//child::li[3]");
	
	                        // methods // 
	public void Pro_Cart_Page_Visible(WebDriver driver) throws InterruptedException {
		WebElement Cart_pro_Visible_page = driver.findElement(pro_visible_in_cart);
	    Assert.assertTrue(Cart_pro_Visible_page.isDisplayed(), " products are not visible in cart");
	}
	 public void prod1_atc(WebDriver driver) throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)", "");
			
			Actions action = new Actions(driver);
			WebElement hover1 = driver.findElement(hover1_btn);
			action.moveToElement(hover1).perform();
			WebElement prod1_atc_btn = driver.findElement(prod1_atc);
			prod1_atc_btn.click();
			Thread.sleep(1000);
			WebElement view_cart_btn = driver.findElement(view_cart_btn_xpath);
			view_cart_btn.click();
			Thread.sleep(2000);
		}
		 public void prod2_atc(WebDriver driver) throws InterruptedException {
			Actions action = new Actions(driver);
			WebElement hover2 = driver.findElement(hover2_btn);
			action.moveToElement(hover2).perform();
			WebElement prod2_atc_btn = driver.findElement(prod2_atc);
			prod2_atc_btn.click();
			Thread.sleep(1000);
			WebElement con_btnn = driver.findElement(continue_btn);
			con_btnn.click();
			Thread.sleep(1000);
	  }
		 public void prod3_atc(WebDriver driver) throws InterruptedException {
			Actions action = new Actions(driver);
			WebElement hover3 = driver.findElement(hover3_btn);
			action.moveToElement(hover3).perform();
			WebElement prod3_atc_btn = driver.findElement(prod3_atc);
			prod3_atc_btn.click();
			Thread.sleep(1000);
			WebElement con_btnn = driver.findElement(continue_btn);
			con_btnn.click();
			Thread.sleep(1000);
	 }
		 public void Loggin_signup(WebDriver driver) throws InterruptedException {
			WebElement logORsign_btn = driver.findElement(LogorSIGN_btn);
			logORsign_btn.click();
			Thread.sleep(1000);
			WebElement cemailtext = driver.findElement(cemail);
			cemailtext.sendKeys("batch@gmail.com");
			Thread.sleep(1000);
			WebElement passtext = driver.findElement(pass);
			passtext.sendKeys("123");
			Thread.sleep(1000);
	}	
		 public void Again_CartPage_Verify(WebDriver driver) throws InterruptedException {
            WebElement cartButton =driver.findElement(cart_btn);
            cartButton.click();
            Thread.sleep(1000);
		 }
  }