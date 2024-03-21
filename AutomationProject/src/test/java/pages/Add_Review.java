package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Add_Review
  {
                             // Locators //
	private By Pro_button = By.xpath("//ul[@class='nav navbar-nav']//child::li[2]");
	private By Allpropage = By.xpath("//div[@class='col-sm-9 padding-right']");
	private By view_pro = By.xpath("//a[@href='/product_details/1']");
	private By write_review_txt = By.xpath("//a[text()='Write Your Review']");
	                 
	private By Name = By.id("name");
	private By Email = By.id("email");
	private By Review = By.id("review");
	private By Submit = By.id("button-review");
	private By Success_msg = By.xpath("//span[text()='Thank you for your review.']");
	
	                         // Methods //
	public void Navigated_to_All_Pro_Page(WebDriver driver) throws InterruptedException {
		WebElement navigated_to_allproductpage = driver.findElement(Allpropage);
	    Assert.assertTrue(navigated_to_allproductpage.isDisplayed(), "allproductpage not displayed");
	  }	
	public void Write_review_txt_Visble(WebDriver driver) throws InterruptedException {
		WebElement writeReviewtxt = driver.findElement(write_review_txt);
	    Assert.assertTrue(writeReviewtxt.isDisplayed(), "Write your review not displayed");
	  }	
	public void Verify_success_message(WebDriver driver) throws InterruptedException {
		WebElement successTXT = driver.findElement(Success_msg);
	    Assert.assertTrue(successTXT.isDisplayed(), "Verify success message not displayed");
	  }	
    public void Search_Page(WebDriver driver) throws InterruptedException {	
	    WebElement Pro_btn = driver.findElement(Pro_button );
	    Pro_btn.click(); 
	    driver.navigate().back();
	    Pro_btn.click(); 
	    
	    JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		
		WebElement ViewPro_btn = driver.findElement(view_pro);
		ViewPro_btn.click();
		Thread.sleep(1000);
		
		JavascriptExecutor jsss = (JavascriptExecutor) driver;
		jsss.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);	
     }	
    public void add_review(WebDriver driver) throws InterruptedException {
    	WebElement NAME_btn = driver.findElement(Name);
    	NAME_btn.sendKeys("Ajinkya");
    	Thread.sleep(1000);
    	
    	WebElement EMAIL_btn = driver.findElement(Email);
    	EMAIL_btn.sendKeys("aju@gmail.com");
    	Thread.sleep(1000);
    	
    	WebElement REVIEW_btn = driver.findElement(Review);
    	REVIEW_btn.sendKeys("Good products");
    	Thread.sleep(1000);
    	
    	JavascriptExecutor jsss = (JavascriptExecutor) driver;
		jsss.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(1000);	
		
    	WebElement SUBMIT_btn = driver.findElement(Submit);
    	SUBMIT_btn.click();
    	Thread.sleep(1000);	
    }
  
 }
  