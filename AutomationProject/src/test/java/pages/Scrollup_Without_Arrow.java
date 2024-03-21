package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Scrollup_Without_Arrow 
  {
	                     // locators //
	private By sub_txt = By.xpath("//h2[text()='Subscription']");
    private By hover_on_img = By.xpath("//div/img[@src='/static/images/home/girl1.jpg']");
                     
                        // methods // 
	public void verifying_subscription_text(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8300)", "");
		Thread.sleep(2000);
		
		WebElement verifying_sub_text = driver.findElement(sub_txt);
		Assert.assertTrue(verifying_sub_text.isDisplayed(), "subscription text not verify");
		Thread.sleep(2000);
	}
	public void ScrollUp_Without_Arrow(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-8500)", "");
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(hover_on_img);
		action.moveToElement(hover).perform();
		hover.click();
		Thread.sleep(5000);
	}
	public void Page_title_txt_Visible(WebDriver driver) {
	String verify_text= driver.findElement(By.xpath("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]")).getText();
	Assert.assertEquals(verify_text,"Full-Fledged practice website for Automation Engineers");
  }
	
}