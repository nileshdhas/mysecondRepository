package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass2 {
	@Test
	  public void x() 
	  {
		  
		  Reporter.log("x method is running",true);
	  }
	  @Test
	  public void y() 
	  {
		  Reporter.log("y method is running",true);
	  }
	  
	  @Test
	  public void z() 
	  {
		  Reporter.log("z method is running",true);
	  }
	  
}