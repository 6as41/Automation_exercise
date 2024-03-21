package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Cart_page {
  
	                         // locators //
		private By subscrptn_btn_xpath = By.xpath("//input[@id='susbscribe_email']");
		private By sub_arrow_btn_xpath = By.xpath("//button[@id='subscribe']");
		private By subscrptn_txt_xpath = By.xpath("//div/h2[text()='Subscription']");
		private By prod1_xpath = By.xpath("//a[@href='/product_details/1']");
		private By prod2_xpath = By.xpath("//a[@href='/product_details/2']");
	    
		                    // methods //
		public void subscrptn(WebDriver driver) {
			WebElement subscrptn_txt= driver.findElement(subscrptn_txt_xpath);
			Assert.assertTrue(subscrptn_txt.isDisplayed(), "Subscription text not displayed");
			WebElement subscrptn_btn = driver.findElement(subscrptn_btn_xpath);
			subscrptn_btn.sendKeys("sanajsheikh@gmail.com");
			WebElement sub_arrow_btn = driver.findElement(sub_arrow_btn_xpath);
			sub_arrow_btn.click();
		}
		
		public void verify_prod_added(WebDriver driver) {		
   //	    WebElement prod1 = (WebElement) Products.prod1_xpath;
  //		Assert.assertTrue(prod1.isDisplayed(), "added prod1 not displayed");
			
			WebElement prod1 = driver.findElement(prod1_xpath);
			Assert.assertTrue(prod1.isDisplayed(), "added prod1 not displayed");
			WebElement prod2 = driver.findElement(prod2_xpath);
			Assert.assertTrue(prod2.isDisplayed(), "added prod1 not displayed");
		}
	   
   }
