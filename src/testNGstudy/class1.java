package testNGstudy;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 {
  @Test
  public void a() 
  {
	  Reporter.log("a method is running",true);
	  Assert.fail();
  }
  @Test
  public void b() 
  {    //Assert.fail();
	  Reporter.log("b method is running",true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("c method is running",true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("d method is running",true);
  }
  @Test
  public void e() 
  {
	 //Assert.fail();
	  Reporter.log("e method is running",true);
  }
  @Test
  public void f() 
  {
	  Reporter.log("f method is running",true);
  }
  
  
}
