package verification_In_TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void mymethod() 
  {
	   String a= "pune";
	  String b="pune";
//	  Assert.assertEquals(a, b,"actual and expected is not match");
//	  Reporter.log("actual and expected is matching",true);
//	  
	 
	  Assert.assertNotEquals(a, b,"tc is fail value is equal");
	  Reporter.log("tc is pass value is not null",true);
	  
  }
}
