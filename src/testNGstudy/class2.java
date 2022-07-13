package testNGstudy;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 {
	@Test
	  public void m() 
	  {
		  Reporter.log("m method is running",true);
	  }
	@Test
	  public void n() 
	  {
		  Reporter.log("n method is running",true);
	  }
	@Test
	  public void o() 
	  {
		  Reporter.log("o method is running",true);
	  }
	@Test
	  public void p() 
	  {
		  Reporter.log("p method is running",true);
	  }
	@Test
	  public void q() 
	  {
		  //Assert.fail();
		  Reporter.log("q method is running",true);
	  }
	  
}
