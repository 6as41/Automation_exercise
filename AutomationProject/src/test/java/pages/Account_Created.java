package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Account_Created {
	
	                // Locators //
	private By acc_created = By.xpath("//h2[@data-qa='account-created']");
	private By continue_btn = By.xpath("//a[@class='btn btn-primary']");

	                // Methods //
	public void verify_acc_created(WebDriver driver) {
		WebElement acc_createdtext = driver.findElement(acc_created);
		Assert.assertTrue(acc_createdtext.isDisplayed(), "Account NOT created");
	}

	public void click_continue(WebDriver driver) throws InterruptedException {
		WebElement continue_btntext = driver.findElement(continue_btn);
		continue_btntext.click();
		Thread.sleep(2000);
		continue_btntext.click();
		System.out.println("Account created successfully");
	}
}
