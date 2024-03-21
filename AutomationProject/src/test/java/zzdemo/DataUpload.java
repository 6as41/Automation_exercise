package zzdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataUpload {
	WebDriver driver;

	@DataProvider(name = "searchdatatest") // method name
	public Object[][] searchdata() {
		Object[][] searchphone = new Object[2][2];
		searchphone[0][0] = "Samsung";
		searchphone[0][1] = "s24";
		searchphone[1][0] = "iPhone";
		searchphone[1][1] = "15";
		
		return searchphone;
	}

	@Test(priority = 1)
	public void launchflipkart() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 2, dataProvider = "searchdatatest")
	public void testcasesFlipkart(String brand, String model) throws InterruptedException {
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys(brand + " " + model);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement loginpopup = driver.findElement(By.xpath("//div[@class='JFPqaw']"));
		Thread.sleep(2000);
		if (loginpopup.isDisplayed()) {
			driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		}
	}
}
