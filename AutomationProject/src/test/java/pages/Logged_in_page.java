package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Logged_in_page 
   {
	                       // locators //
		private By logged_in = By.xpath("//a/i[@class='fa fa-user']");
		private By delete_btn = By.xpath("//a/i[@class='fa fa-trash-o']");
		
                          // methods //
		public void verify_logged_in(WebDriver driver) {
			WebElement logged_in_txt = driver.findElement(logged_in);
			Assert.assertTrue(logged_in_txt.isDisplayed(), "Not logged-in");
			System.out.println("Successfully logged in");
		}
		
		public void delete_acc(WebDriver driver) {
			WebElement delete_btntext = driver.findElement(delete_btn);
			delete_btntext.click();
		}
   }
