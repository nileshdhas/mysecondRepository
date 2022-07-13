package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityuse {
  @Test(priority = -4)
  public void x() 
  {
	  Reporter.log("x method is runnig",true);  
  }
  @Test(priority = 1)
  public void a() {
	  Reporter.log("a method is running ",true);
  }
  
  @Test(priority = -2)
  public void k() 
  {
	  Reporter.log("k method is running",true);
  }
  
}
