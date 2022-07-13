package testngkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass3 {
  @Test(groups = "regression")
  public void a() 
  {
	  Reporter.log("a method is running",true);
  }
  
  @Test(groups = "sanity")
  public void b() 
  {
	  Reporter.log("b method is running",true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("c method is running",true);
  }
}
