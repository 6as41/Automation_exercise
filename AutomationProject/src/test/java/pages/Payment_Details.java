package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment_Details 
  {
	                     // locators //
    private By name_on_card = By.name("name_on_card");
	private By card_no = By.name("card_number");
	private By cvc_no = By.name("cvc");
	private By expiry_mnth = By.name("expiry_month");
	private By expiry_yr = By.name("expiry_year");
	private By pay_conf = By.id("submit");
	
	                    // methods //
	public void PayDeatils(WebDriver driver) throws InterruptedException 
	{
		WebElement Name_On_Card = driver.findElement(name_on_card);
		Name_On_Card.sendKeys("Ajinkya");
		Thread.sleep(1000);
		
		WebElement CARDNUM = driver.findElement(card_no);
		CARDNUM.sendKeys("123456789");
		Thread.sleep(1000);
		
		WebElement CVCNumber = driver.findElement(cvc_no);
		CVCNumber.sendKeys("787");
		Thread.sleep(1000);
		
		WebElement EXPMonth = driver.findElement(expiry_mnth);
		EXPMonth.sendKeys("12");
		Thread.sleep(1000);
		
		WebElement EXPYEAR = driver.findElement(expiry_yr);
		EXPYEAR.sendKeys("2028");
		Thread.sleep(1000);
		
		WebElement PayConfirmOrder = driver.findElement(pay_conf);
		PayConfirmOrder.click();
		Thread.sleep(1000);
		
	 }
	
  }
