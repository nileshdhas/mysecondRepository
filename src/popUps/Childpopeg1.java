package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopeg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    driver.manage().window().maximize();
	    Thread.sleep(100);
	       String mainpageID = driver.getWindowHandle();// HANDLE METHOD GIVE MAIN PAGE ID
	      System.out.println(mainpageID);
	      System.out.println("****************");
	      driver.findElement(By.name("NewWindow")).click();// to open child pop up
	      Thread.sleep(100);      
	Set<String> allpageID = driver.getWindowHandles();// HANDLES METHOD GIVE THE ALL OAGE ID
	Iterator<String> it = allpageID.iterator();// iterator use 
	String mainpageid = it.next();// store in variable
	String childpageid = it.next();// store in variable
	driver.switchTo().window(childpageid);
	driver.manage().window().maximize();
	driver.findElement(By.id("the7-search")).sendKeys("nilesh");
	Thread.sleep(100);
	driver.close();// close the current tab open by slelnium toll
	// to chnage the foucs to main page
	
	driver.switchTo().window(mainpageid);
	WebElement al = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
	  System.out.println(al.getText());
	  driver.quit();
	}

}
