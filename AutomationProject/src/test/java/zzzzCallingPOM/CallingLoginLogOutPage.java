package zzzzCallingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import zzzPomDemo.LoginOHRMwithPAGE;
import zzzPomDemo.LogoutOHRMwithPage;

public class CallingLoginLogOutPage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginOHRMwithPAGE logopt = new LoginOHRMwithPAGE(driver);
		logopt.url();
		logopt.username("Admin");
		logopt.password("admin123");
		logopt.loginbutton();
		
		LogoutOHRMwithPage logoutopt = new LogoutOHRMwithPage(driver);
		logoutopt.profilepic();
		logoutopt.logout();

	}

}
