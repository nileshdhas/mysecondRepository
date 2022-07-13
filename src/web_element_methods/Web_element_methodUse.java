package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Web_element_methodUse {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
WebDriver bk=new ChromeDriver();
bk.get("https://signup.zerodha.com/");
bk.findElement(By.xpath("//input[@label='Mobile number']")).sendKeys("123");
//bk.findElement(By.xpath("//input[@label='Mobile number']")).clear();
//System.out.println(bk.getTitle());
//System.out.println(bk.getCurrentUrl());
bk.navigate().to("https://www.cricbuzz.com/");
//bk.navigate().back();
//bk.navigate().forward();
bk.manage().window().maximize();
//bk.manage().window().minimize();
//bk.close();	




	}

}
