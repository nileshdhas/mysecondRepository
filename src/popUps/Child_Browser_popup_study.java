package popUps;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_popup_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    driver.manage().window().maximize();
	    Thread.sleep(100);
		String mainpageID = driver.getWindowHandle();// for main page id
		System.out.println(mainpageID);// WE get the main page id 
		
		System.out.println("*************************************");
		driver.findElement(By.name("NewWindow")).click();// to open child window
		Thread.sleep(100);
		//to handele multiple windows /to get multiple IDs
		Set<String> allpageID = driver.getWindowHandles();
		// iterator use
		Iterator<String> it = allpageID.iterator();
		String mainpageid = it.next();// will return main page id
		String childpageid = it.next();// will return child page id
		// change the foucus to child page
		driver.switchTo().window(childpageid);// changing foucus from main page to child page
	    driver.manage().window().maximize();
	driver.findElement(By.id("id=\"the7-search\"")).sendKeys("nilesh");
	Thread.sleep(100);
	driver.close();// close only current tab opened by selenum tool
	//driver.quit(); //close all tab opened by selenium tool
	// to change foucus from child to main page 
	driver.switchTo().window(mainpageid);
   	WebElement al = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
	al.getText();
	System.out.println(al.getText());
	
	
	}
					
}
