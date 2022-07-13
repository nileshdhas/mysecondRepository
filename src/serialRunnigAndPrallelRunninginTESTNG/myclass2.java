package serialRunnigAndPrallelRunninginTESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myclass2 {
  @Test
  public void myMethod2() throws InterruptedException 
  {
	   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("http://google.com/"); 
	      Reporter.log("google is open properly",true);
	      Thread.sleep(2000);  
  }
}
