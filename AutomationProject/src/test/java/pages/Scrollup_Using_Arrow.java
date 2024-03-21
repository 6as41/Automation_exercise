package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

    public class Scrollup_Using_Arrow {
    	
                       	   // locators //
    private By sub_txt = By.xpath("//h2[text()='Subscription']");
    private By scrollup_arrow = By.id("scrollUp");
    private By pagetitle = By.xpath("//div/h2[text()='Full-Fledged practice website for Automation Engineers']");
               
                           // methods // 
	public void verifying_subscription_text(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8500)", "");
		Thread.sleep(2000);
		
		WebElement verifying_sub_text = driver.findElement(sub_txt);
		Assert.assertTrue(verifying_sub_text.isDisplayed(), "subscription text not verify");
		Thread.sleep(2000);
	}
	public void Scroll_Up_with_Arrow(WebDriver driver) throws InterruptedException {
		WebElement scroll_arrow = driver.findElement(scrollup_arrow);
		scroll_arrow.click();
		Thread.sleep(1000);
	}
	public void Page_title_txt_Visible(WebDriver driver) throws InterruptedException {
	WebElement page_title_text = driver.findElement(pagetitle);
	Assert.assertTrue(page_title_text.isDisplayed(), "page title not visible");
    }
}