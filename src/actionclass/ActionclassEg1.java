package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassEg1 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	      Thread.sleep(1000);
		// 1. Create object of Actions class and pass the webdriver as parameter
		Actions act = new Actions(driver);
		//2. identify element where action to be perform
		WebElement rightclickme = driver.findElement(By.xpath("//span[text()='right click me']"));
		//3. using actins class methods perform desired opraetion
		System.out.println("1].right click on web element========================");
	    //1st way to right click 
		//act.moveToElement(rightclickme).perform();// move the mouse to desired location
		//act.contextClick().perform();// perform right click on operation
		System.out.println("==============================");
		//2nd way to right click
		//act.moveToElement(rightclickme).contextClick().build().perform();
		System.out.println("============================");
		//3rd wayes to right click
		act.contextClick(rightclickme).perform();
		Thread.sleep(1000);
		System.out.println("2].click on web element==========================================");
		// click on WebElement using  actoins class
		//1. itentify the element to oprration perform
		WebElement clickme = driver.findElement(By.linkText("Selenium"));
		// 2.using actions class method perform the desired operation
		//1st way to click
		//act.moveToElement(clickme).perform();
		//act.click().perform();
		//2.way
		//act.moveToElement(clickme).click().build().perform();
	   //3RD Wayes to click
		//act.click(clickme).perform();
	
	System.out.println("3]double click button=====================================================");
	//1.idetntify the web element to prform opration
	WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//2. using action class method 
	//act.moveToElement(doubleclick).perform();
	//act.doubleClick().perform();
	//2.way
	//act.doubleClick(doubleclick).perform();
	
	
	
	}

}
