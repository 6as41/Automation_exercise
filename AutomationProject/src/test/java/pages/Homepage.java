package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Homepage 
   {
	                             // locators //
		private By signup_logintext = By.xpath("//li/a[text()=' Signup / Login']");	
   
                                 // methods //
		public void navigate_to_autoex(WebDriver driver) throws InterruptedException {
			driver.get("https://automationexercise.com");
			Thread.sleep(1000);
		}
		public void homepage_displayed(WebDriver driver) {
			String homepage_act = driver.getTitle();
			String homepage_exp = "Automation Exercise";
			Assert.assertEquals(homepage_act, homepage_exp,"Homepage not displayed correctly");		
		}	
		public void click_signup_login(WebDriver driver) {
			WebElement signup_login_btntext = driver.findElement(signup_logintext);
			signup_login_btntext.click();
		}

   }
