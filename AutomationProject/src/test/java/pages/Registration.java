package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Registration 
   {
                         	// locators //
		private By enter_info_txt = By.xpath("//h2/b[text()='Enter Account Information']");
		private By title = By.id("uniform-id_gender1");
		private By pwd = By.xpath("//input[@id='password']");
		private By day_sel = By.xpath("//select[@id='days']");
		private By month_sel = By.xpath("//select[@id='months']");
		private By year_sel = By.xpath("//select[@id='years']");
		private By newsletter = By.id("newsletter");
		private By offer_ckhbx = By.id("optin");
		private By fname = By.id("first_name");
		private By lname = By.id("last_name");
		private By company = By.id("company");
		private By addr1 = By.id("address1");
		private By addr2 = By.id("address2");
		private By country_sel = By.xpath("//select[@id='country']");
		private By state = By.id("state");
		private By city = By.id("city");
		private By zipcode = By.id("zipcode");
		private By mob_no = By.id("mobile_number");
		private By create_acc_btn = By.xpath("//button[@data-qa='create-account']");
		private By delete_btn = By.xpath("//a[@href='/delete_account']");
		private By Continue_btn = By.xpath("//a[@data-qa='continue-button']");
		private By accVeriytxt = By.xpath("//h2/b[text()='Account Created!']");	
		
		                  // methods // 
		    public void AccVerified_txtDisplayed(WebDriver driver) {
			WebElement new_user_text = driver.findElement(accVeriytxt);
			Assert.assertTrue(new_user_text.isDisplayed(), "ACCOUNT CREATED! not displayed");
		}
		
		    public void enter_details1(WebDriver driver) throws InterruptedException {
			WebElement enter_info_text = driver.findElement(enter_info_txt);
			Assert.assertTrue(enter_info_text.isDisplayed(), "Enter Account Information not displayed");
			
			WebElement titletext = driver.findElement(title);
			titletext.click();	
			Thread.sleep(1000);
			
			WebElement pwdtext = driver.findElement(pwd);
			pwdtext.sendKeys("aju");
			Thread.sleep(1000);
			
			WebElement day_seltext = driver.findElement(day_sel);
			Select sel_dtext = new Select(day_seltext);
			sel_dtext.selectByValue("30");
			Thread.sleep(1000);
			
			WebElement month_seltext = driver.findElement(month_sel);
			Select sel_mtext = new Select(month_seltext);
			sel_mtext.selectByVisibleText("March");
			Thread.sleep(1000);
			
			WebElement year_seltext = driver.findElement(year_sel);
			Select sel_y = new Select(year_seltext);
			sel_y.selectByVisibleText("1999");
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			
			WebElement newslettertext = driver.findElement(newsletter);
			newslettertext.click();
			Thread.sleep(1000);
			WebElement offer_chkbxtext = driver.findElement(offer_ckhbx);
			offer_chkbxtext.click();	
			Thread.sleep(1000);
		}
		public void enter_addr_info(WebDriver driver) throws InterruptedException {
			WebElement fnametext = driver.findElement(fname);
			fnametext.sendKeys("Ajinkya");
			Thread.sleep(1000);
			
			WebElement lnametext = driver.findElement(lname);
			lnametext.sendKeys("Patil");
			Thread.sleep(1000);
			
			WebElement companytext =  driver.findElement(company);
			companytext.sendKeys("Tcs");
			Thread.sleep(1000);
			
			WebElement addr1text = driver.findElement(addr1);
			addr1text.sendKeys("TCS SP2,Phase 3,Hinjawadi Rajiv Gandhi Infotech Parkt");
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(1000);
			
			WebElement addr2text = driver.findElement(addr2);
			addr2text.sendKeys("Hinjawadi,Pimpri-Chinchwad,Pune-411057");
			Thread.sleep(1000);
			
			WebElement country_seltext = driver.findElement(country_sel);
			Select sel_ctext = new Select(country_seltext);
			sel_ctext.selectByValue("India");
			Thread.sleep(1000);
			
			WebElement statetext = driver.findElement(state);
			statetext.sendKeys("Maharashtra");	
			Thread.sleep(1000);
			
			WebElement citytext = driver.findElement(city);
			citytext.sendKeys("Pune");
			Thread.sleep(1000);
					
			WebElement zipcodetext = driver.findElement(zipcode);
			zipcodetext.sendKeys("411057");
			Thread.sleep(1000);
			
			WebElement mob_notext = driver.findElement(mob_no);
			mob_notext.sendKeys("9146612776");
			Thread.sleep(1000);
			
			WebElement create_acc_btntext = driver.findElement(create_acc_btn);
			create_acc_btntext.click();	
			Thread.sleep(1000);
			
			WebElement continue_btntext = driver.findElement(Continue_btn);
			continue_btntext.click();
			driver.navigate().back();
			continue_btntext.click();
			Thread.sleep(2000);
			
	//		WebElement delete_btntext = driver.findElement(delete_btn);
	//		delete_btntext.click();
		}

   }
