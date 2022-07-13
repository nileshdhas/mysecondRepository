package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class iframeEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
         driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("welcome");
		 Thread.sleep(1000);
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		 Thread.sleep(1000);
		WebElement aNIMAL = driver.findElement(By.id("animals"));
		Select n=new Select( aNIMAL);
		 Thread.sleep(100);
		n.selectByValue("babycat");
		 Thread.sleep(100);
		 driver.switchTo().defaultContent();
		WebElement text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(text.getText()); 
        driver.close();
	}

}
