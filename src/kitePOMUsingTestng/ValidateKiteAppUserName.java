package kitePOMUsingTestng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	 WebDriver driver;
	 Sheet mysheet;
	 Kiteloginpage login;
	 Pinpage pin;
	 Homepage home;
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException 
     {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
       driver.get("https://kite.zerodha.com/");
	   driver.manage().window().maximize();
	   Reporter.log("launching browser",true);
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   File myfile = new File("E:\\apaache pio\\poi-bin-5.2.2-20220312\\myExcelsheet.xlsx");
       mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
       
	   login = new Kiteloginpage(driver);
	    pin = new Pinpage(driver);
	    home = new Homepage(driver); 
    }
  @BeforeMethod
  public void loginToKiteApp() 
      {
	    String UN = mysheet.getRow(4).getCell(0).getStringCellValue();
		String PASS = mysheet.getRow(4).getCell(1).getStringCellValue();
		String PIN1= mysheet.getRow(4).getCell(2).getStringCellValue();
		
		login.sendusername(UN);
		Reporter.log("sending username",true);
		
		login.passwords(PASS);
		Reporter.log("sending password",true);
		
		login.loginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendpin(PIN1);
		Reporter.log("sending pin",true);
		
		pin.continuebutton();
		Reporter.log("clicking on continue button",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  }
  @Test
  public void validateusername() 
  {
	  String expectedUN = mysheet.getRow(4).getCell(0).getStringCellValue();
	  String actualUN = home.getActualUsername();
	  Reporter.log("validating username",true);
	  Assert.assertEquals(actualUN,expectedUN ,"tc is fail username are not match");
	  Reporter.log("tc is pass username is matching",true);
  }
  @AfterMethod
  public void logoutapp() throws InterruptedException 
  {
	  home.logoutbtton();
	  Reporter.log("logging out",true);
  }
  @AfterClass
  public void closebrowser() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  Reporter.log("closing browser",true);
	  driver.close();
  }
}
