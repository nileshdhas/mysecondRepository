package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX_METHOD1 {

	public static void main(String[] args) throws InterruptedException 
	{	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	WebDriver nk=new ChromeDriver();
    nk.get("https://vctcpune.com/selenium/practice.html");
    Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement dropdown = nk.findElement(By.name("dropdown-class-example"));
		//2. create an object of select classwhich will accept webelement as parameter
		Select s=new Select(dropdown);
		//3. By using on of the class method we can select values form list 
		Thread.sleep(1000);
		//1. by using visibel text
		s.selectByVisibleText("Option1");
		Thread.sleep(1000);
		//2 by using index
		s.selectByIndex(3);
		Thread.sleep(1000);
		//3. by using text value
		s.selectByValue("option2");
		
		
		
	}

}
