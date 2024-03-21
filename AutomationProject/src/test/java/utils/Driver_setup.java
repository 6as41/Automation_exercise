package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver_setup
    {
	public static WebDriver launch_Browser() {
		WebDriver driver;
		System.setProperty("webdriver.chromedriver", "D:\\Selenium Download.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	  }
   }
