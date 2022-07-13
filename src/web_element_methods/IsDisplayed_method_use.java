package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_method_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
      nk.get("https://vctcpune.com/selenium/practice.html");
      Thread.sleep(1000);
      WebElement hidebutton = nk.findElement(By.id("hide-textbox"));
      WebElement showbutton = nk.findElement(By.id("show-textbox"));
WebElement textbox = nk.findElement(By.id("displayed-text"));

hidebutton.click();
if(textbox.isDisplayed()) {
	System.out.println("text box is dissplayed");
}
else {
	showbutton.click();
	if(textbox.isDisplayed())
	{
		System.out.println("text box  displayed now ");
	
	}
	else {
		System.out.println("text box is not diplayed");
	}
	
	
	}


	}

}
