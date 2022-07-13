package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class un_ordered_list {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    System.out.println("================================================================");
	    //1. insepect search button and write x path and send a key
		driver.findElement(By.name("q")).sendKeys("honda");
		 Thread.sleep(1000);
		 System.out.println("=============================================================");
		 //2. inspect the unorerded list open by search button and write x path for that when one one item is not selected
		 List<WebElement> searchresult = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]//li"));
		   System.out.println(searchresult.size());
		   //getting the text on unordered list 
		   // use for each loop for get text
		   System.out.println("=============================================================");
           for(WebElement r:searchresult)  
              {
	         System.out.println(r.getText());
               }
       System.out.println("================================================================");
    //3. for select a particcular things of that ordered list by using for each loop and if condition in that
       for(WebElement result:searchresult) 
           {
    	   String actualtext=result.getText();
    	   String expectedtext="honda amaze";
    	   if(actualtext.equals(expectedtext)) {
    		   result.click();
    		   break;
    	   }
       }
       System.out.println("=================================================================");
       // then we want to images of that honda amze then write x path for images
       driver.findElement(By.linkText("Images")).click();
       
	}

}
