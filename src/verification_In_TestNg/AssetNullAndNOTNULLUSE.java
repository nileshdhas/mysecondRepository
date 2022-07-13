package verification_In_TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssetNullAndNOTNULLUSE {
  @Test
  public void mymethod() 
     {
           String a=null;
           String b="abc";
    
//        Assert.assertNull(a,"Tc is fail Value not null ");
//        Reporter.log("Tc case is pass value is null",true);       
//        
//        
        Assert.assertNotNull(b,"TC is fail value is null");
           Reporter.log("Tc is pass value is not null",true);
           Assert.fail();
           
     }
}
