package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex1testng {
  @Test
  public void kitelogin() throws InterruptedException {
  
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
      driver.get("https://kite.zerodha.com/");
      Thread.sleep(2000);
      
      System.out.println("hi i am noram class");
      Reporter.log("i am reporter class");
      Reporter.log("hi am reporter class 1", true);
      
  }
}
