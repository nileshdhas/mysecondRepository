package testngkeywords;

//import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 3)
  public void z() 
  {
	  Reporter.log("z method is running ",true); 
  }
  
  @Test(invocationCount = 2)
  public void a() 
  {
	  Reporter.log("a method is running",true);
  }
  
  
  @AfterMethod
  public void aftermethod2() {
	  Reporter.log("aftermethod2 is running",true);
  }
  
  
  @AfterMethod
  public void aftermethod() {
	  Reporter.log("after method is running",true);
  }
  
  
}
