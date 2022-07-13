package scrolling_webpage_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_in_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
           driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(1000);
         
         //1 type : normal scrolling
		JavascriptExecutor e = (JavascriptExecutor)driver;
	     // e.executeScript("window.scrollBy(90,800)");
       // e.executeScript("window.scrollBy(90,799)");

	      
	    //  2nd type: scrollIntoview
	      
	      WebElement mouse = driver.findElement(By.id("mousehover"));
	      JavascriptExecutor b = (JavascriptExecutor)driver;
	      b.executeScript("arguments[0].scrollIntoView(true)",mouse);
	      
	}

}
