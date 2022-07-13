package Set_Postion_And_Set_size_OF_Window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(1000);
	    // to get the current size of the window
	         System.out.println(driver.manage().window().getSize());

	   // 1. to set size of window we need to create object of Dimension class
	         Dimension d= new Dimension(500, 1050);
	   // 2. by using setSize method we can change the size
	         driver.manage().window().setSize(d);
	   
	   
	}

}
