package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v100.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.SendKeysAction;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      Thread.sleep(1000);
	      System.out.println("==================================");
		// HOW TO SEND A KEYES BY USING ACTIONS CLASS
	      //1. find element
	      WebElement textbox = driver.findElement(By.id("autocomplete"));
		//textbox.sendKeys("nilesh");// web emlement method
		
	      //2.create a object of actions class
		Actions act = new Actions(driver);
		//3. take action
		
		act.sendKeys(textbox, "nilesh").perform();
		
		System.out.println("=================================");
		
		
		//KEYBOARD ACTION UP_DOWN KEYS
		//1.identify the element 
		WebElement dropdownbox = driver.findElement(By.id("dropdown-class-example"));
        //2.use  action class method 
		// keys.arrowdown and keys.enter for enter that value 
		act.click(dropdownbox).sendKeys(Keys.ARROW_DOWN);
	   act.click(dropdownbox).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  // keys.aarowup and keys.enter for up the value and enter the value
	  act.click(dropdownbox).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
	
	
	}

}
