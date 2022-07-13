package testngkeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethodUse {
  @Test
  public void p() 
  {
	  Assert.fail();
	  Reporter.log("p method is running",true);
  }
  @Test(dependsOnMethods = {"p","r"},priority = -3 )
  public void q() 
  {
	  Reporter.log("q method is running",true);
  }
  
  @Test
  public void r() 
  {
	  Reporter.log("r method is running",true);
  }
  
  
}
