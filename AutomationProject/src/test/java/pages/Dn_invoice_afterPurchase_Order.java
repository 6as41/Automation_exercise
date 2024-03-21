package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Dn_invoice_afterPurchase_Order 
  {
                          // locators //
	  private By download_btn = By.xpath("//a[@href='/download_invoice/900']");
	  private By continue_btn = By.xpath("//a[@data-qa='continue-button']");
	  private By delete = By.xpath("//a[@href='/delete_account']");
	  private By contiune_btn = By.xpath("//a[@data-qa='continue-button']");
	  private By account_deleted_txt = By.xpath("//h2/b[text()='Account Deleted!']");
	  
                          // methods //
	  public void AccountDeletedtxtDisplayed(WebDriver driver) {
			WebElement accDeltxt = driver.findElement(account_deleted_txt);
			Assert.assertTrue(accDeltxt.isDisplayed(), "Account Deleted txt not displlayed");	
		}  
 	  public void Download_Button(WebDriver driver) throws InterruptedException {
	    	WebElement dn_button = driver.findElement(download_btn);
	    	dn_button.click();
	    	if(dn_button.isSelected()) {
	    		System.out.println("Invoice is downloaded");
	    	}else {
	    	System.out.println("Invoice is not downloaded");
	        }
 	    } 	
	 public void Continue_Button(WebDriver driver) throws InterruptedException {
	    	WebElement cn_button = driver.findElement(continue_btn);
	    	cn_button.click();
	    	Thread.sleep(1000);	
	    }
	 public void DeleteButton (WebDriver driver) throws InterruptedException{
	       WebElement deletebtn = driver.findElement(delete);
	       deletebtn.click();
	       Thread.sleep(1000);
	       
	       WebElement continuebtn = driver.findElement(contiune_btn);
	       continuebtn.click();
	       Thread.sleep(1000);
	    }
  }
 