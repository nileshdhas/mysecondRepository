package verification_In_TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrueAndFalseUSE {
  @Test
  public void MYMETHOD() 
  {
	  boolean a = true;
	  boolean b = false;
//	  Assert.assertTrue(a,"tc is fail value is not true");
//	  Reporter.log("tc is pass value is true",true);
  
	 Assert.assertFalse(a,"tc is fail value is not false"); 
	  Reporter.log("tc is pass value is false");
	  
  }
}
