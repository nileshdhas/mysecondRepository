package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotation_Study {
  @Test
  public void valiadteUserName() 
  {
	  Reporter.log("UserName is validated",true);
	  
  }
  @Test
public void dasboardvaliadted() {
	  Reporter.log("dasboard is validated",true);
  }
 
  @BeforeMethod
  public void logintokiteapp() {
	  Reporter.log("kite app login is succecfull",true);
  }
  @AfterMethod
  public void logoutTheApp() {
	  Reporter.log("kite app logout is done",true);
  }
  @BeforeClass
  public void launchBrowser() {
	  Reporter.log("browser launch succsefull",true);
  }
  @AfterClass
  public void closebrowser() {
	  Reporter.log("browser is close",true);
  }
  
}
