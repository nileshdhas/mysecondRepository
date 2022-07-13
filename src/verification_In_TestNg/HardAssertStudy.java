package verification_In_TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void MYMETHOD() 
  {
	String a="abc";
	String b ="abc";
	  
	  Assert.assertEquals(a, b,"tc is fail a and b is not equal");
	  Reporter.log("tc is pass a and b is equals",true);
	  
	  Assert.assertNull(b,"tc is fail value is not null");
	  Reporter.log("tc is pass value is null",true);
	  
  }
}
