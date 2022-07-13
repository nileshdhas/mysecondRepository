package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
   {
      @Override
    public void onTestSuccess(ITestResult result) 
        {
	    Reporter.log("Tc pass succsessfully ",true);
	    result.getName();
	    Reporter.log("name of test method completely sucuess is  "+ result.getName(),true);
        }	
     
      @Override
    public void onTestFailure(ITestResult result) 
        {
	    Reporter.log("Tc is fail please check it again",true);
	    Reporter.log("name of test method failed is  "+ result.getName(),true);
        }   
     
      @Override
    public void onTestSkipped(ITestResult result) 
        {
	    Reporter.log("Tc is skipped please check the dependant method",true);
	    Reporter.log("name of test method skipped is  "+ result.getName(),true);
        }
      
     
      
      
      
    }
