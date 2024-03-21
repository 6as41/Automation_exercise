package zzzzCallingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import zzzPomDemo.LoginOHRMwithBYClass;
import zzzPomDemo.LogoutOHRmwithBYClass;

public class CallingLoginLogout {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//creating object & calling methods
		LoginOHRMwithBYClass logopt = new LoginOHRMwithBYClass(driver);
		logopt.launchURL();
		logopt.Username("Admin");
		logopt.Password("admin123");
		logopt.Loginbutton();
		
		LogoutOHRmwithBYClass logoutopt = new LogoutOHRmwithBYClass(driver);
		logoutopt.ProfilePic();
		logoutopt.LogOut();
		driver.quit();

	}

}
