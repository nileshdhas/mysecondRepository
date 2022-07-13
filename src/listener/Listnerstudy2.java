package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listener.Listener.class)
public class Listnerstudy2  
{
  @Test
  public void d() 
  {
	  Reporter.log("d method is ruuning",true);
  }
  @Test(priority = 0)
  public void e() 
  {
	  Reporter.log("e method is runnig",true);
  }
  @Test(dependsOnMethods = {"g"})
  public void f() 
  {
	  Reporter.log("f method is runnig",true);
  }
  @Test
  public void g() 
  {
	  Assert.fail();
	  Reporter.log("g method is runnig",true);
  }
  
}
