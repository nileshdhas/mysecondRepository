package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
	    nk.get("https://demoqa.com/select-menu");
	    Thread.sleep(1000);
	   WebElement dropdowns = nk.findElement(By.name("cars"));
	   Thread.sleep(1000);
      Select s=new Select(dropdowns);
      System.out.println(s.isMultiple());
       s.selectByIndex(0);   
       Thread.sleep(1000);
       s.selectByValue("saab");
       Thread.sleep(1000);
       s.selectByVisibleText("Audi");
       
    //   s.deselectAll();
       s.deselectByIndex(0);
       s.deselectByValue("saab");
	}

	
}
