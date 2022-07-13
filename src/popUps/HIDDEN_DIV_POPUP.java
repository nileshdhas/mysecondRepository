package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIDDEN_DIV_POPUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
		nk.manage().window().maximize();
	    nk.get("https://www.flipkart.com/");
	    Thread.sleep(1000);
	    nk.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();// i am hidding popup
	    Thread.sleep(1000);
	    nk.findElement(By.xpath("//input[@type='text']")).sendKeys("headphones");
	    Thread.sleep(1000);
	    nk.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
