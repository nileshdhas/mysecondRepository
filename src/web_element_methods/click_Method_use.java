package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_Method_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
      nk.get("https://vctcpune.com/selenium/practice.html");
      Thread.sleep(1000);
      // click method use
      nk.findElement(By.name("checkBoxOption2")).click();





	}

}
