package verification_In_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Verification_Study_on_app
{  

  @Test
  public void Vctc() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	  
	   //*********************AsertEqualUse****************
	  
	  String actualtext = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	  String expectedtext = "Welcome To Practice Page";
      Assert.assertEquals(actualtext, expectedtext,"tc is fail value is not equal");
	  Reporter.log("tc is pass value ia equals",true);
	  
	   //********************AssertNotEqualsUse **********
	  
	   String act1 = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	   String exp1 = "welcome to home page";
	   Assert.assertNotEquals(act1 ,exp1 ,"tc is fial value is equal");
	   Reporter.log("tc is pass value is not equal",true);
	  
	    //*******************AssertTrueUse*****************
	  
	   WebElement opt1 = driver.findElement(By.id("checkBoxOption1"));
	   opt1.click();
	   Assert.assertTrue(opt1.isSelected(),"tc is fail opt1 is not selected");
	   Reporter.log("tc is pass opt1 is selected",true);
	  
	    //********************AssertFalseUse***************
	  
	   WebElement button = driver.findElement(By.xpath("//label[text()='Radio3']"));
	   Assert.assertFalse(button.isSelected(),"tc is fail button is selected");
	   Reporter.log("tc is pass button is not selected",true);
	  
	     //*******************AssertNullUse****************
	   
	    WebElement textfield = driver.findElement(By.id("autocomplete"));
	    textfield=null;
	    Assert.assertNull(textfield,"tc is a fail value is not null");
	    Reporter.log("tc is pass value is null",true);
	    
	      //******************AsertNotNullUse**************
	    
	   WebElement textfield1 = driver.findElement(By.id("autocomplete"));
	   textfield1.sendKeys("something");
	    Assert.assertNotNull(textfield1,"tc is fail textfiled1 is null");
	    Reporter.log("tc is pass textfiled is not null",true);
	    
	    //*******************assertFailUse********************
	   // Assert.fail();   this is use when we want to fail any method 
	    }
  
  @Test
  public void kiteapp() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  
  }
  
  
}
