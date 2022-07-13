package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookAppKwyboardaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      Thread.sleep(1000);
   WebElement createNewAcc = driver.findElement(By.linkText("Create New Account"));
      // 1. CREATE THE OBJECT OF ACTIONS CLASS
       Actions act=new Actions(driver);
      act.click(createNewAcc).perform();
      Thread.sleep(1000);
      System.out.println("==========================");
     // find the element 
      WebElement day = driver.findElement(By.id("day"));
      act.click(day).perform();
      // For loop for arrow down fast
      for(int i=1;i<=5;i++) 
      {
    	  act.sendKeys(Keys.ARROW_DOWN).perform();
    	  Thread.sleep(1000);
      }
      act.sendKeys(Keys.ENTER).perform();
      
      System.out.println("==========================");
      // FIND THE FIRST NAME ELEMENT 
      WebElement firstname = driver.findElement(By.name("firstname"));
	//act.keyDown(firstname, Keys.SHIFT).sendKeys("n").keyUp(firstname, Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).sendKeys("ilesh").build().perform();
	
      act.sendKeys(firstname, "Nilesh").perform();
	
	}

}
