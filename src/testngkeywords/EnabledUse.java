package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void k() 
  {
	  Reporter.log("k method is runnig",true);
  }
  
  @Test(enabled = false)
  public void b() {
	  Reporter.log("b method id running",true);
  }
  
  @Test
  public void l() 
  {
	 
	  Reporter.log("l method is running",true);
  }
  
}
