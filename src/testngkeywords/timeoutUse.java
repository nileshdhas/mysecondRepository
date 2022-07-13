package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeoutUse {
  @Test(timeOut = 2000)
  public void x() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  Reporter.log("x method is running ",true);
  }
  @Test
  public void y() 
  {
	  Reporter.log("y method is running ",true);
  }
  @Test
  public void z() 
  {
	  Reporter.log("z method is running ",true);
  }
  
  
  
  
}
