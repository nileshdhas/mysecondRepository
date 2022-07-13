package tabelehandeleing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablereading {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.get("https://vctcpune.com/selenium/practice.html");
      Thread.sleep(1000);
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2@@@@@@@");
      // how to find rowes of coloum
    List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
      int noofrowes = rows.size();
      System.out.println(noofrowes);
      System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
      // how to find column of column
       List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th"));
      int noofcolumn = column.size();
      System.out.println(noofcolumn);
      System.out.println("***********************************************************");
      //how to read headers
      // using for each loop
      for(WebElement c:column) {
    	  System.out.print(c.getText()+"// ");
    	  
    	  System.out.println("=======================================================");
    	  // how to read all rowes in table by using iterator 
    	  List<WebElement> alltextintable = driver.findElements(By.xpath("//table//tr"));
    	  Iterator<WebElement> r = alltextintable.iterator();// iterator use
    	  while(r.hasNext()) {
    		  
    		  System.out.print(r.next().getText()+" ");
    		  
    	  }
    	  System.out.println();
      }
	}

}
