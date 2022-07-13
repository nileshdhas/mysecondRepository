package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class) // (packagename.listenerclassname.class)
  public class listenerstudy {
  @Test
  public void a() 
  {
	  Reporter.log("a method is running ",true);  
  }
  @Test(dependsOnMethods = {"c"})
  public void b() 
  {
	  Reporter.log("b method is running ",true);  
  }
  @Test
  public void c() 
   {
	  Assert.fail();
	  Reporter.log("c method is running ",true);  
   }
  
  
  
}
