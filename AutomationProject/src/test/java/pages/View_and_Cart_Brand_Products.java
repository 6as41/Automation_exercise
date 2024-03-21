package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class View_and_Cart_Brand_Products 
  {
	                        // locators //
	private By Pro_button = By.xpath("//ul[@class='nav navbar-nav']//child::li[2]");
	private By brand_option_Visible = By.xpath("//h2[text()='Brands']");
	private By brand_btn = By.xpath("//a[@href='/brand_products/Polo']");
	private By navigate_brandpage = By.xpath("//h2[text()='Brand - Polo Products']");
	private By navigated_brandProduct_display  = By.xpath("//div[@class='features_items']");
	private By Other_brand =By.xpath("//a[@href='/brand_products/H&M']");
	private By navigate_Other_brandpage = By.xpath("//h2[text()='Brand - H&M Products']");
	private By navigated_Other_brandProduct_display  = By.xpath("//div[@class='features_items']");
	
	                        // methods //
	public void Brands_Option_Visible(WebDriver driver) {
	  WebElement Verify_brand_txt = driver.findElement(brand_option_Visible);
	  Assert.assertTrue(Verify_brand_txt.isDisplayed(), "Brand option not displayed");
	}
	public void Navigated_BrandPage_Visible(WebDriver driver) {
	  WebElement brand_page_txt = driver.findElement(navigate_brandpage);
	  Assert.assertTrue(brand_page_txt.isDisplayed(), "Navigated brand page not visible");
	}
	public void Navigated_BrandProducts_Visible(WebDriver driver) {
	  WebElement brand_page_txt = driver.findElement(navigated_brandProduct_display);
	  Assert.assertTrue(brand_page_txt.isDisplayed(), "Navigated brand product not visible");
	}
	public void Navigated_Other_BrandPage_Visible(WebDriver driver) {
	  WebElement Otherbrand_page_txt = driver.findElement(navigate_Other_brandpage);
	  Assert.assertTrue(Otherbrand_page_txt.isDisplayed(), "Navigated Other BrandPage not Visible ");
	}
	public void Navigated_Other_BrandProducts_Visible(WebDriver driver) {
      WebElement Otherbrand_Product = driver.findElement(navigated_Other_brandProduct_display);
	  Assert.assertTrue(Otherbrand_Product.isDisplayed(), "Navigated Other Brandproduct not visible");
	}	
	
	
    public void Product_Page(WebDriver driver) throws InterruptedException {  
	  WebElement Pro_btn = driver.findElement(Pro_button );
	  Pro_btn.click(); 
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Pro_btn.click(); 
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
  	  js.executeScript("window.scrollBy(0,400)", "");
  	  Thread.sleep(2000);
  	    
	  WebElement SelectBrand = driver.findElement(brand_btn);
	  SelectBrand.click();
	  Thread.sleep(2000);
    }
    public void Navigate_Other_Brandpage(WebDriver driver) throws InterruptedException {
      WebElement OtherBrand = driver.findElement(Other_brand);
      OtherBrand.click();
  	  Thread.sleep(2000);
    }
  }
