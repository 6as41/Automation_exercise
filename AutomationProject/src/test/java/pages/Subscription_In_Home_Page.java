package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Subscription_In_Home_Page 
  {
	                      // locators //
	private By sub_txt = By.xpath("//h2[text()='Subscription']");  
    private By sub_email = By.id("susbscribe_email");
	private By clicck_arow_btn = By.id("subscribe");
	private By cart_btn = By.xpath("//a[@href='/view_cart']");
	
	                     // methods //
	   public void verifying_sub_text(WebDriver driver){
	        WebElement verifying_sub_text = driver.findElement(sub_txt);
	        Assert.assertTrue(verifying_sub_text.isDisplayed(), "subs not verify");
	       }   
	   public void successfully_msg_(WebDriver driver){
		   String s1="You have been successfully subscribed!";
		   String s2="You have been successfully subscribed!";
	       System.out.println(s1.equals(s2));  
	   } 
	   public void Homepage_cart_Option(WebDriver driver) throws InterruptedException {   
		    WebElement cart_button = driver.findElement(cart_btn);
		    cart_button.click();
		    Thread.sleep(1000);		
		   
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,600)", "");
		   
		    WebElement enter_email = driver.findElement(sub_email);
			enter_email.sendKeys("aju@gmail.com");
			Thread.sleep(1000);
			
			WebElement arrow_btn = driver.findElement(clicck_arow_btn);
			arrow_btn.click();
			Thread.sleep(2000);
	   }			
	  public void Search_Page(WebDriver driver) throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,8500)", "");
			
			WebElement enter_email = driver.findElement(sub_email);
			enter_email.sendKeys("aju@gmail.com");
			Thread.sleep(1000);
			
			WebElement arrow_btn = driver.findElement(clicck_arow_btn);
			arrow_btn.click();
			Thread.sleep(2000);
	}
 
  }
