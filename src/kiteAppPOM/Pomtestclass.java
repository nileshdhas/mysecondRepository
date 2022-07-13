package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomtestclass {

	public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://kite.zerodha.com/");
	      Thread.sleep(2000);
		// create object of login page 
	      Kite_login_page login= new Kite_login_page(driver);
		login.sendusername();
		login.password();
		login.loginbutton();
		Thread.sleep(2000);
		
		
     // cretate object of pin page
		PINbutton_page pin= new PINbutton_page(driver);
		pin.pin();
		pin.continuebutoon();
		
		Thread.sleep(2000);
		
		// create object of homepage
		homepage home= new homepage(driver);
		home.valiadatedusername();
		home.logoutbutton();
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
