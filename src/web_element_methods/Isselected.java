package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
      nk.get("https://vctcpune.com/selenium/practice.html");
      WebElement checkbox = nk.findElement(By.id("checkBoxOption1"));
      System.out.println(checkbox.isSelected());
      boolean result = checkbox.isSelected();
      System.out.println("result of checkbox is"+result);
      checkbox.click();
      boolean result1 = checkbox.isSelected();
      System.out.println("result 1 is " +result1 );
// if else ststment for this method
	if(checkbox.isSelected()) {
	System.out.println("check box is selected");	
	}
	else {
		System.out.println("checkbox is not selected");
	}
	}
}


