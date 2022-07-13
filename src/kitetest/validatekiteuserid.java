package kitetest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kiteapp_pom_using_Excel_reading.Kiteloginpage;
import kitebase.Base;
import kiteutility.Utility;
import pomclassersforkiteapp.Homepage;
import pomclassersforkiteapp.Pinpage;

public class validatekiteuserid extends Base
{
	pomclassersforkiteapp.Kiteloginpage login;
	Pinpage pin;
	Homepage home;
	String TCID="555";
	@Parameters("browsername")
  @BeforeClass
  public void launcebrowser(String name) 
  {      String n = name;
	     openBrowser(n);
	     login = new pomclassersforkiteapp.Kiteloginpage(driver);
	     pin   = new Pinpage (driver);
	     home  = new Homepage(driver);  
  }
  @BeforeMethod
  public void logintokiteapp() throws EncryptedDocumentException, IOException 
     {
	  login.sendusername(Utility.stratRedingDatafromExcel(4, 0));
	  login.passwords(Utility.stratRedingDatafromExcel(4, 1));
	  login.loginbutton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Reporter.log("login succesfully done",true);
	  
	  pin.sendpin(Utility.stratRedingDatafromExcel(4, 2));
	  pin.continuebutton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Reporter.log("pin read succesfully done",true);
     }
  @Test
  public void validatedusername() throws EncryptedDocumentException, IOException 
       {
	   Assert.assertEquals(home.getActualUsername(),Utility.stratRedingDatafromExcel(4, 0),"Actual and Expected are not matching tc is failed");  
       Reporter.log("tc is pass actualUN and expectedUN matching ",true);
       Utility.capturescreenshot(driver, TCID);
       }
  @AfterMethod
  public void logoutbutton() throws InterruptedException 
    {
	  home.logoutbtton();  
    }
  @AfterClass
  public void closebrowser() 
  {
	  driver.close();
  }
}
