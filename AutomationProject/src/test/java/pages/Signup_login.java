package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Signup_login 
   { 
	                           // locators //
		private By new_user_txt = By.xpath("//div/h2[text()='New User Signup!']");
		private By login_to_acc = By.xpath("//div/h2[text()='Login to your account']");
		private By account_deleted = By.xpath("//h2/b[text()='Account Deleted!']");
		private By logged_as_username = By.xpath("//i[@class='fa fa-user']");
		private By name = By.xpath("//form/input[@name='name']");
		private By email = By.xpath("//form[@action='/signup']/input[@name='email']");
		private By cemail = By.xpath("//input[@data-qa='login-email']");
		private By pass = By.name("password");
		private By invalid = By.xpath("//p[text()='Your email or password is incorrect!']");
		private By LogorSIGN_btn = By.xpath("//a[@href='/login']");
		private By signup = By.xpath("//form/button[text()='Signup']");
		private By login = By.xpath("//button[@data-qa='login-button']");
		private By delete = By.xpath("//a[@href='/delete_account']");
		private By logout_btn = By.xpath("//ul[@class='nav navbar-nav']//child::li[4]");
		private By email_allredy_exit = By.xpath("//form/p[text()='Email Address already exist!']");

		
		                       // methods // 
		public void new_user_txtDisplayed(WebDriver driver) {
			WebElement new_user_text = driver.findElement(new_user_txt);
			Assert.assertTrue(new_user_text.isDisplayed(), "New user Signup! not displayed");
			System.out.println("new_user_txt is displayed");
		}
		
		public void account_deletedtxtDisplayed(WebDriver driver) {
			WebElement account_deletedtext = driver.findElement(account_deleted);
			Assert.assertTrue(account_deletedtext.isDisplayed(), "acc deleted is not displayed");
			System.out.println("accuont deleted txt is displayed correctly");
		}
		  public void invalid_passtxtDisplay(WebDriver driver) {
				WebElement invalid_passtext = driver.findElement(invalid);
				Assert.assertTrue(invalid_passtext.isDisplayed(), "invalid data txt is not displayed");
				System.out.println("invalid data txt is displayed correctly");
			}
		  public void login_to_acctxtDisplayed(WebDriver driver) {
				WebElement login_to_acctext = driver.findElement(login_to_acc);
				Assert.assertTrue(login_to_acctext.isDisplayed(), "Login to your account txt not displlayed");
				System.out.println("login_to_acc txt is displayed correctly");
			}
		  public void log_outtxtDisplayed(WebDriver driver) {
				WebElement log_outtext = driver.findElement(logout_btn);
				Assert.assertTrue(log_outtext.isDisplayed(), "log_out txt not displlayed");
				System.out.println("log_out txt is displayed correctly");
			}
		  public void logged_as_usernametxtDisplayed(WebDriver driver) {
				WebElement logged_as_usernametxt = driver.findElement(logged_as_username);
				Assert.assertTrue(logged_as_usernametxt.isDisplayed(), "logged_as_username txt not displlayed");	
			}
		  public void email_allredy_exittxtDisplayed(WebDriver driver) {
				WebElement email_allredy_exittxt = driver.findElement(email_allredy_exit);
				Assert.assertTrue(email_allredy_exittxt.isDisplayed(),"email_allredy_exit txt is not displayed correctly");
				System.out.println("email_allredy_exit txt is displayed correctly");
		  }
		public void new_user_register(WebDriver driver) throws InterruptedException {
			WebElement logORsign_btn = driver.findElement(LogorSIGN_btn);
			logORsign_btn.click();
			Thread.sleep(1000);
			WebElement nametext = driver.findElement(name);
			nametext.sendKeys("ajinkya");
			Thread.sleep(1000);
			WebElement emailtext = driver.findElement(email);
			emailtext.sendKeys("ixvovbjy@gmail.com");
			Thread.sleep(1000);
			WebElement signup_btntext = driver.findElement(signup);
			signup_btntext.click();
			Thread.sleep(1000);
		}			
	   public void signup_user_valid_cred(WebDriver driver) throws InterruptedException {
		   WebElement logORsign_btn = driver.findElement(LogorSIGN_btn);
		   logORsign_btn.click();
		   Thread.sleep(1000);
		   WebElement cemailtext = driver.findElement(cemail);
		   cemailtext.sendKeys("batch@gmail.com");
		   Thread.sleep(1000);
		   WebElement passtext = driver.findElement(pass);
		   passtext.sendKeys("123");
		   Thread.sleep(1000);
		   WebElement login_btntext = driver.findElement(login);
		   login_btntext.click();
		   Thread.sleep(5000);
	//	   WebElement delete_btntext = driver.findElement(delete);
	//	   delete_btntext.click();
	//	   Thread.sleep(2000);
	//	   driver.navigate().back();
	//	   delete_btntext.click();  
	   }
	   public void signup_invalid_cred(WebDriver driver) throws InterruptedException {
		   WebElement cemailtext = driver.findElement(cemail);
		   cemailtext.sendKeys("aju7@gmail.com");
		   Thread.sleep(1000);
		   WebElement passtext = driver.findElement(pass);
		   passtext.sendKeys("aju7.");
		   Thread.sleep(1000);
		   WebElement login_btntext = driver.findElement(login);
		   login_btntext.click();
		   Thread.sleep(5000);	    
	   }
	   public void logout_user_process(WebDriver driver) throws InterruptedException {
		   WebElement cemailtext = driver.findElement(cemail);
		   cemailtext.sendKeys("plm@gmail.com");
		   Thread.sleep(1000);
		   WebElement passtext = driver.findElement(pass);
		   passtext.sendKeys("plm");
		   Thread.sleep(1000);
		   WebElement login_btntext = driver.findElement(login);
		   login_btntext.click();
		   Thread.sleep(5000);	    
           WebElement logout_btntext = driver.findElement(logout_btn);
		   logout_btntext.click();
		   Thread.sleep(2000); 
	   }
	   public void email_allredy_exit(WebDriver driver) throws InterruptedException {
		   WebElement nametext = driver.findElement(name);
			nametext.sendKeys("aju");
			WebElement emailtext = driver.findElement(email);
			emailtext.sendKeys("aju7@gmail.com");
			WebElement signup_btntext = driver.findElement(signup);
			signup_btntext.click();
	   } 
   }
