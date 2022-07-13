package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");

		 Thread.sleep(1000);
		 driver.switchTo().frame("courses-iframe");
		 Thread.sleep(100);
		 driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();

	}
	// use the rporter class 

}
