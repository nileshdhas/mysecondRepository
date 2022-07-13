package serialRunnigAndPrallelRunninginTESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myclass1 {
  @Test
  public void myMethod() throws InterruptedException 
  {
	   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://kite.zerodha.com/");
	      Reporter.log("kite app is runnig properly",true);
	      Thread.sleep(2000);  
  }
}
