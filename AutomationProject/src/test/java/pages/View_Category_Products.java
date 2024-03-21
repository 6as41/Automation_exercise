package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class View_Category_Products 
  {
	                        // locators //
    private By categories_Visible = By.xpath("//div/h2[text()='Category']");
    private By women_category_btn = By.xpath("//a[@href='#Women']");		
    private By womenSubcategory_btn = By.xpath("//a[@href='/category_products/1']");
    private By Wcategory_page_Displayed = By.xpath("//h2[text()='Women - Dress Products']"); 
    private By men_category_btn =By.xpath("//a[@href='#Men']");
    private By men_Subcategory_btn = By.xpath("//a[@href='/category_products/3']");
    private By Mcategory_page_Displayed = By.xpath("//h2[text()='Men - Tshirts Products']");
 
                            // methods //
    public void categoryTxtVisible(WebDriver driver) {
      WebElement Category_txt_visible = driver.findElement(categories_Visible);
      Assert.assertTrue(Category_txt_visible.isDisplayed(), "Category_txt_Display not display");
    }
    public void womenCategory(WebDriver driver) throws InterruptedException   {
      
      JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500)", "");
	  Thread.sleep(2000);
	  
      WebElement Women_btn_click = driver.findElement(women_category_btn);
      Women_btn_click.click();
      Thread.sleep(1000);
      
      WebElement women_sub_category = driver.findElement(womenSubcategory_btn);
      women_sub_category.click();
      Thread.sleep(1000);
      driver.navigate().back();
      women_sub_category.click();
      Thread.sleep(1000);
    }
      public void Women_category_Page_txt_Visible(WebDriver driver) {
      WebElement Categorypage_txt_visible = driver.findElement(Wcategory_page_Displayed);
      Assert.assertTrue(Categorypage_txt_visible.isDisplayed(), "Category page_txt_ not display"); 
    }
      public void menCategory(WebDriver driver) throws InterruptedException   {
      WebElement men_btn_click = driver.findElement(men_category_btn);
      men_btn_click.click();
      Thread.sleep(1000);
          
      WebElement men_sub_category = driver.findElement(men_Subcategory_btn);
      men_sub_category.click();
      Thread.sleep(1000);
    }
      public void Men_category_Page_txt_Visible(WebDriver driver) {
      WebElement Categorypage_txt_visible = driver.findElement(Mcategory_page_Displayed);
      Assert.assertTrue(Categorypage_txt_visible.isDisplayed(), "Category page_txt_ not display"); 
    }
    
 }
  
