package kitebase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import kiteutility.utilityproperty;

public class Basenew 
{         // DECLARE THE WEBDRIVER AS PROTECTED For Inheritnce
	protected static  WebDriver driver;
	
	public void openbrowser() throws IOException 
	{     // BASE CLASS TO OPEN THE BROWSER
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(utilityproperty.getdatafromproperty("URL"));
		  Reporter.log("Lannching browser",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	
	
	
}
