package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Product_Page
  {
	                         // locators //
	private By Pro_button = By.xpath("//ul[@class='nav navbar-nav']//child::li[2]");
	private By Allpropage = By.xpath("//div[@class='features_items']//child::h2[text()='All Products']");
	private By Viewpro = By.xpath("//a[@href='/product_details/1']");
	private By Prodetails = By.xpath("//div[@class='product-details']");
	private By viewpro_btn = By.xpath("//a[@href='/product_details/1']");
	private By proInfo = By.xpath("//div[@class='product-information']");
	private By quantityInput = By.id("quantity");
	private By Addtocartbtn = By.xpath("//button[@type='button']");
	private By viewcartBtn = By.xpath("//a/u[text()='View Cart']");
	private By proquantity = By.xpath("//table[@class='table table-condensed']//child::tbody/child::tr//child::td[4]");
			
	                        // methods // 
	public void Navigated_to_All_Pro_Page(WebDriver driver) throws InterruptedException {
		WebElement navigated_to_allproductpage = driver.findElement(Allpropage);
	    Assert.assertTrue(navigated_to_allproductpage.isDisplayed(), "all product page not displayed"); 
	}
	public void allproDetailPage(WebDriver driver) throws InterruptedException {
	    WebElement Allprodetail = driver.findElement(Prodetails);	    
        Assert.assertTrue(Allprodetail.isDisplayed(), "All prode detail not displayed");
	}
	public void ProductInfo(WebDriver driver) {
		WebElement PROINFO = driver.findElement(proInfo);	    
        Assert.assertTrue(PROINFO.isDisplayed(), "PRO INFO detail not displayed");
	}
	public void ProductQuantityVerify(WebDriver driver) {
		WebElement pquantity = driver.findElement(proquantity);	    
        Assert.assertTrue(pquantity.isDisplayed(), "product quantity detail not displayed");
	}
	public void Navigated_Product_Page(WebDriver driver) throws InterruptedException {	
	    WebElement Pro_btn = driver.findElement(Pro_button );
	    Pro_btn.click(); 
	    driver.navigate().back();
	    Thread.sleep(5000);
	    
	    WebElement viewpro_btn = driver.findElement(Viewpro);    
	    viewpro_btn.click();
	    Thread.sleep(2000);         
   }
	public void viewpro_page(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		WebElement viewproButton = driver .findElement(viewpro_btn);
		viewproButton.click();
		Thread.sleep(1000);
		driver.navigate().back();
		viewproButton.click();
		
		WebElement QuantityIncrease = driver.findElement(quantityInput);
		QuantityIncrease.clear();
		QuantityIncrease.sendKeys("4");
		Thread.sleep(1000);
		
		WebElement addcartButton = driver.findElement(Addtocartbtn);
		addcartButton.click();
		
		WebElement viewcartbutton = driver.findElement(viewcartBtn);
		viewcartbutton.click();
		Thread.sleep(1000);
	}	
 }