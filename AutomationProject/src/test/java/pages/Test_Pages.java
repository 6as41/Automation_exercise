package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Test_Pages
  {
	                      // locators //
	private By Testcase_button = By.xpath("//ul[@class='nav navbar-nav']//child::li[5]");
	private By Navigated_tc_Page = By.xpath("//h2/b[text()='Test Cases']");
  
	                      // methods //
	 public void navigated_TestCase_Page(WebDriver driver) throws InterruptedException {
	    WebElement Tcbutton = driver.findElement(Testcase_button );
	    Tcbutton.click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Tcbutton.click();
	   
		WebElement navigatedmsg = driver.findElement(Navigated_tc_Page);
		Assert.assertTrue(navigatedmsg.isDisplayed(), "navigatedmsg not displayed");
		Thread.sleep(2000);
	}

  }