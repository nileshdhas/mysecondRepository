package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Text_methoduse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
      nk.get("https://vctcpune.com/selenium/practice.html");
      // gettext 1st way to call
	System.out.println	(nk.findElement(By.xpath("(//td[text()='Velocity Trainers'])[3]")).getText());
		// gettext 2nd way to call
	WebElement element = nk.findElement(By.xpath("(//td[text()='Velocity Trainers'])[3]"));
	System.out.println(element.getText());
	// gettext 3rd way
	String result = element.getText();
	System.out.println("result is " +result);
	
	}

}
