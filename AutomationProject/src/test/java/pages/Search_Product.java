package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Search_Product 
  {
	                      // locators //
	private By Pro_button = By.xpath("//ul[@class='nav navbar-nav']//child::li[2]");
	private By Allpropage = By.xpath("//div[@class='col-sm-9 padding-right']");
	private By Search_btn = By.id("search_product");
	private By Searc_logo = By.id("submit_search");
	private By Searched_pro = By.xpath("//h2[text()='Searched Products']");
	private By Related_pro = By.xpath("//div[@class='features_items']");
	
	                      // methods // 
	public void Navigated_to_All_Pro_Page(WebDriver driver) throws InterruptedException {
		WebElement navigated_to_allproductpage = driver.findElement(Allpropage);
	    Assert.assertTrue(navigated_to_allproductpage.isDisplayed(), "allproductpage not displayed");
	}
	public void seacrched_product_visible(WebDriver driver) 
	{
		WebElement Searched_proDisplay = driver.findElement(Searched_pro);
		Assert.assertTrue(Searched_proDisplay.isDisplayed(), "Searched_proDisplay is not displayed");
	}
	public void Related_product(WebDriver driver) 
	{
		WebElement related_proDisplay = driver.findElement(Related_pro);
		Assert.assertTrue(related_proDisplay.isDisplayed(), "Searched_proDisplay is not displayed");
	}
	
    public void Search_Page(WebDriver driver) throws InterruptedException {
		
	    WebElement Pro_btn = driver.findElement(Pro_button );
	    Pro_btn.click(); 
	    driver.navigate().back();
	    Pro_btn.click(); 
	    
	    JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);

	    WebElement Search_button = driver.findElement(Search_btn);
	    Search_button.sendKeys("Saree");
	    Thread.sleep(1000);
	    
	    WebElement Seach_logo_btn = driver.findElement(Searc_logo);
	    Seach_logo_btn.click();
	    Thread.sleep(1000);
	    
	    JavascriptExecutor jsss = (JavascriptExecutor) driver;
		jsss.executeScript("window.scrollBy(0,450)", "");
	 }			
	
  }
