package webdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethoduse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver nv=new ChromeDriver();
		nv.get("https://www.facebook.com/");
		nv.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		//((WebElement) nv).clear();
		Thread.sleep(1000);
		nv.manage().window().maximize();
		
	//	nv.manage().window().minimize();
		nv.navigate().to("https://www.instagram.com/accounts/login/");
	//	nv.close();
		//nv.navigate().back();
		//nv.navigate().forward();
		//nv.get("https://www.facebook.com/");
	//	System.out.println(nv.getTitle());
		//System.out.println(nv.getCurrentUrl());
	}

}
