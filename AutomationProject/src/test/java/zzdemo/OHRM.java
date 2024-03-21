package zzdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRM 
{
	WebDriver driver;
    @BeforeSuite
    public void launchBrowser() throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	Thread.sleep(3000);
    }
	
	@Test(priority=1)
	public void loginOHRM() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	Thread.sleep(2000);
    	String dashboard = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
    	Assert.assertEquals(dashboard, "Dashboard");
	}
	@Test(priority=2)
	public void pim() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/child::li[2]")).click();
		Thread.sleep(2000);
		String addemp = driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']//child::li[3]")).getText();
		Assert.assertEquals(addemp, "Add Employee");
	}
	
	@Test(priority=3)
	public void addemp() throws InterruptedException 
	{   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']//child::li[3]")).click();
		Thread.sleep(2000);
		String emp = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")).getText();
		Assert.assertEquals(emp, "Add Employee");
		Thread.sleep(2000);	
	}
	
	@Test(priority=4)
	public void report() throws InterruptedException 
	{
		driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']//child::li[4]")).click();
		Thread.sleep(2000);	
		
		String empreport = driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")).getText();
		Assert.assertEquals(empreport, "Employee Reports");
	}
	
	@AfterSuite
	public void closeApp()
	{
		driver.quit();
	}
}
