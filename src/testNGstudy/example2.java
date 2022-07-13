package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2 {
  @Test
  public void kiteapplogin() throws InterruptedException {
  
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
      driver.get("https://kite.zerodha.com/");
      Thread.sleep(2000);
      Reporter.log("kite app is login succesfully", true);
      
      
      
  }
  @Test
  public void vctc() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      Thread.sleep(2000);
      Reporter.log("vctc app login succesfully");
      
      
  }
  
  
  
  
}
