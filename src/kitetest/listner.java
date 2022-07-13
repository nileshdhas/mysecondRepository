package kitetest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kitebase.Basenew;
import kiteutility.utilityproperty;

public class listner extends Basenew implements ITestListener
{
@Override
public void onTestFailure(ITestResult result) 
    {

	try {
		utilityproperty.capturescreenshot(driver,result.getName() );
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
@Override
	public void onTestSuccess(ITestResult result) 
   {

		Reporter.log("Tc is passed and tc name is "+result.getName(),true);
	}
	
	
}
