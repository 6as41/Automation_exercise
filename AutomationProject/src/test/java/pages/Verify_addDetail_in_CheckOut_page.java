package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verify_addDetail_in_CheckOut_page {
	
	                      // locators //
	private By checkout_btn = By.xpath("//a[@class='btn btn-default check_out']");
    private By deliveryAdd = By.xpath("//h3[text()='Your delivery address']");
    private By BillingAdd = By.xpath("//h3[text()='Your billing address']");
    private By delete_btn = By.xpath("//a[@href='/delete_account']");
    private By account_deleted = By.xpath("//h2/b[text()='Account Deleted!']");
    private By Continue_btn = By.xpath("//a[@data-qa='continue-button']");
 
                         // methods //
	public void DeliveryAdd_isSameAdd_Displayed(WebDriver driver) {
		WebElement new_user_text = driver.findElement(deliveryAdd);
		Assert.assertTrue(new_user_text.isDisplayed(), "delivery add is NOT same add filled at the time registration of account");
	}	
	public void BilingAdd_isSameAdd_Displayed(WebDriver driver) {
		WebElement new_user_text = driver.findElement(BillingAdd);
		Assert.assertTrue(new_user_text.isDisplayed(), "billing add is NOT same add filled at the time registration of account");
	}
	public void account_deletedtxtDisplayed(WebDriver driver) {
		WebElement account_deletedtext = driver.findElement(account_deleted);
		Assert.assertTrue(account_deletedtext.isDisplayed(), "acc deleted is not displayed");
		System.out.println("accuont deleted txt is displayed correctly");
	}
	
	public void pro_CheckObtn(WebDriver driver) throws InterruptedException {
		WebElement checkout_button = driver.findElement(checkout_btn);
		checkout_button.click();
		Thread.sleep(1000);
	}
	public void Delete_btn(WebDriver driver) throws InterruptedException {
		WebElement delete_btntext = driver.findElement(delete_btn);
		delete_btntext.click();
		Thread.sleep(1000);
	}
	public void Continue_btn(WebDriver driver) {
		WebElement con_btn = driver.findElement(Continue_btn);
		con_btn.click();
	}		
  }