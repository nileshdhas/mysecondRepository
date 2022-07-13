package Set_Postion_And_Set_size_OF_Window;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(1000);
	    //strep:1 to curretnt location of facebook window
	   System.out.println(driver.manage().window().getPosition());
		Thread.sleep(200);
		
		/*step:2 to set the position of window we need to create object of point class 
		and pass xand y value*/
		Point pt=new Point(15, 40);
		
		//3. using set position method we can set the position
		driver.manage().window().setPosition(pt);
		System.out.println(pt);

	}

}
