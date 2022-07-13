package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/drag_drop.html");
	      Thread.sleep(1000);
	   //1.find the source and destination Elements
	    WebElement sourceElement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));// source element
     WebElement destinationElement = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));// destinatoion element
	// 2. create the object of actions class
     Actions act= new Actions(driver);
     //3. by Cascade methods
     //1. way
     //act.moveToElement(sourceElement).clickAndHold().moveToElement(destinationElement).release().build().perform();
     //2. wayes
     act.dragAndDrop(sourceElement, destinationElement).perform();
     
	
	
	}

}
