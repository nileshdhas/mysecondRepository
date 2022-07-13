package verification_In_TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void mymethod () 
  {
	  String a = "pune";
	  String b = null;
	  // created a object of Soft Assert(soft assert is class in testng)
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertEquals(a, b,"tc is fail value is not matching");
//	  Reporter.log("tc is pass value is matching",true); this is not allowed  here
	  
	  soft.assertNotNull(b,"tc is fail value is null");
//	  Reporter.log("tc is pass value is notnull");
	  soft.assertAll();
  }
  @Test
  public void mymethod2() 
  {
	  String x = null;
     String y = "nilesh" ;
     boolean z = false;
     SoftAssert soft1=new SoftAssert();
     soft1.assertEquals(x, y,"tc is fail x and y are not equals");
     soft1.assertTrue(z,"tc is fail value is fasle");
     soft1.assertNotNull(y,"tc is fail value is null");
     soft1.assertAll();
     
  }
  
  
  
}
