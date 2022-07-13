package testngkeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testclass1 {
	 @Test
	  public void p() 
	  {
		  
		  Reporter.log("p method is running",true);
	  }
	  @Test
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