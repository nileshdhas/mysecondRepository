package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NO_OF_LINKS_ON_WEBPAGE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    //
	    List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
        Iterator<WebElement> result = links.iterator();
        while(result.hasNext()) {
        	System.out.println(result.next().getText());
        }
	}

}
