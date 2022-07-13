package kitetest;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.exec.environment.OpenVmsProcessingEnvironment;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import kiteapp_pom_using_Excel_reading.Kiteloginpage;
import kitebase.Basenew;
import kiteutility.utilityproperty;
import pomclassersforkiteapp.Homepage;
import pomclassersforkiteapp.Pinpage;
@Listeners(kitetest.listner.class)// add listener here with pacakge name and listener class name
public class ValidatekiteUserIDProperty extends Basenew
{
	pomclassersforkiteapp.Kiteloginpage login;
	 Pinpage pin;
	 Homepage home;
	//String TCID="555";
	
  @BeforeClass
  public void launchbrowser() throws IOException 
  {  
	  openbrowser();
	  login=new pomclassersforkiteapp.Kiteloginpage(driver);
	  pin=new Pinpage(driver);
	  home=new Homepage (driver);
  }
  @BeforeMethod
  public void logintokiteapp() throws IOException 
  {
	  login.sendusername(utilityproperty.getdatafromproperty("UN")); 
	  login.passwords(utilityproperty.getdatafromproperty("PWD"));
	  login.loginbutton();
	  Reporter.log("login succuess",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  
	  pin.sendpin(utilityproperty.getdatafromproperty("PIN1"));
	  pin.continuebutton();
	  Reporter.log("pin succuess",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateun() throws IOException 
  {
	  Assert.fail();
	 Assert.assertEquals(home.getActualUsername(), utilityproperty.getdatafromproperty("UN"),"TC is fail actual and expected un are not matching");
	 Reporter.log("tc is pass actual and expected un are matching",true);
	 // utilityproperty.capturescreenshot(driver, TCID);
	  
	  
  }
  @AfterMethod
  public void logoutkiteapp() throws InterruptedException 
  {
	home.logoutbtton();  
  }
  @AfterClass
  public void closebrowser() 
  {
	driver.close();  
  }
}
