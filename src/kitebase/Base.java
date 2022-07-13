package kitebase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver=null;
	
	public void openBrowser(String name) {
				 
		if(name.equals("chrome")) 
		   {
		   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		   driver=new ChromeDriver();
		   }
		else if(name.equals("firefox")) 
		   {
			 System.setProperty("webdriver.gecko.driver", "E:\\firefox\\geckodriver.exe");
		        driver =new FirefoxDriver();
		   }
		  
	      driver.get("https://kite.zerodha.com/");
	      driver.manage().window().maximize();
	      Reporter.log("launching browser",true);
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	      
	}
	
}
