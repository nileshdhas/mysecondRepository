package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderedlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.findElement(By.name("q")).sendKeys("honda");
	    Thread.sleep(1000);
	    List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	    System.out.println(searchresult.size());
	    // using for each loop
	    for(WebElement r:searchresult)// for geting text only
	    {
	    	System.out.println(r.getText());
	    }
	    
	    // useing to select particular things
	    
	    // for loop
	    for(WebElement result:searchresult) {
	    	String actualtext = result.getText();
	    	String expectedtext="honda amaze";
	    	if(actualtext.equals(expectedtext));
	    	{
	    	result.click();
	    	break;
	    }
	}
	driver.findElement(By.linkText("Images")).click();
	
}}

