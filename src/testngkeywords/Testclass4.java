package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass4 {
	 @Test(groups = "regression")
	  public void m() 
	  {
		  Reporter.log("m method is running",true);
	  }
	  
	  @Test(groups = "sanity")
	  public void n() 
	  {
		  Reporter.log("n method is running",true);
	  }
	  
	  @Test(groups = "regression")
	  public void o() 
	  {
		  Reporter.log("o method is running",true);
	  }
	}

