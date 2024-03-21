package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Contact_us_Form 
   {
                     // locators //
	By Contact_button = By.xpath("//a[@href='/contact_us']");
	By get_touch = By.xpath("//div/h2[text()='Get In Touch']");
	By NAMEBTN = By.name("name");
	By Email_btn = By.name("email");
	By Subject_btn = By.name("subject");
	By Messagetxt = By.id("message");
	By Choosefile_btn = By.name("upload_file");
	By Submit_btn = By.name("submit");
	By success_txt = By.xpath("//div[@class='status alert alert-success']");
	By home_btn = By.xpath("//a[@class='btn btn-success']");
	
	                  // methods //	
	public void Succesfull_msgDisplayed(WebDriver driver) {
		WebElement Succesfull_msg = driver.findElement(success_txt);
		Assert.assertTrue(Succesfull_msg.isDisplayed(), "Succesfull_msg not displayed");
	}
	public void GetintouchDisplayed(WebDriver driver) {
		WebElement Getintouch = driver.findElement(get_touch);
		Assert.assertTrue(Getintouch.isDisplayed(), "Getintouch not displayed");
		System.out.println("Getintouch is displayed");
	}
	
	         //////////Entering Data////////////////////
	 public void enter_details(WebDriver driver) throws InterruptedException
	 { 
		 WebElement contact_btn = driver.findElement(Contact_button);
		 contact_btn.click();
		 Thread.sleep(1000);
		 
		 WebElement GetINTOUCH_text = driver.findElement(get_touch);
		 Assert.assertTrue(GetINTOUCH_text.isDisplayed(), "Get In Touch");
		 Thread.sleep(3000);
		 
		 WebElement name_btn =driver.findElement(NAMEBTN);
		 name_btn.sendKeys("Ajinkya Patil");
		 Thread.sleep(1000);
		 
		 WebElement email_btn =driver.findElement(Email_btn);
		 email_btn.sendKeys("aju1@gmail.com");
		 Thread.sleep(1000);
		 
		 WebElement subject_btn =driver.findElement(Subject_btn);
		 subject_btn.sendKeys("hiiiii");
		 Thread.sleep(1000);
		 
		 WebElement Message_btn =driver.findElement(Messagetxt);
		 Message_btn.sendKeys("hiii automation project");
		 Thread.sleep(1000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,200)", "");
			
		 WebElement Choosefile = driver.findElement(Choosefile_btn);
		 Choosefile.sendKeys("C:\\Users\\Abhi_aaa\\Desktop\\DDF.xlsx");
		 Thread.sleep(1000);

		 WebElement submit = driver.findElement(Submit_btn);
		 submit.click();
		 Thread.sleep(1000);

		 // Handle the prompt
		 Alert alert = driver.switchTo().alert();
		 // Click OK on the prompt
		 alert.accept();
		 Thread.sleep(1000);

		 WebElement Succesfull_msg = driver.findElement(success_txt);
		 Assert.assertTrue(Succesfull_msg.isDisplayed(), "successfull msg not displayed");
		 Thread.sleep(3000);

		 WebElement HomeButton = driver.findElement(home_btn);
		 HomeButton.click();
		 Thread.sleep(1000);
	 }

  }