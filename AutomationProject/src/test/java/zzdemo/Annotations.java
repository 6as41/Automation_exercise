package zzdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
  {
	@BeforeSuite   //Collection of Test Cases
	public void beforeSuiteMethod()
	{
		System.out.println("This is Before Suite Method");
	}
    
    @BeforeTest   //before invoking test
    public void beforeTestMethod()
	{
		System.out.println("This is Before Test Method");
	}
    @BeforeClass   //before invoking any class
    public void beforeClassMethod()
   	{
   		System.out.println("This is Before Class Method");
   	}
    @BeforeMethod  
    public void beforeMethod()
   	{
   		System.out.println("This is Before Method");
   	}
    @Test
    public void testMethod()
    {
   		System.out.println("This is test Method 1");
   	}
    @Test(priority = 1)
    public void testMethod3()
    {
   		System.out.println("This is test Method 3");
   	}
    @AfterMethod
    public void afterMethod()
    {
   		System.out.println("This is After Method");
   	}
    @AfterClass
    public void afterClassMethod()
    {
   		System.out.println("This is After class Method");
   	}
    @AfterTest
    public void aftertestMethod()
    {
   		System.out.println("This is After Test Method");
   	}
    @AfterSuite
    public void afterSuiteMethod()
    {
   		System.out.println("This is After Suite Method");
   	}
   }
