package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframestudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\chrome\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
		nk.manage().window().maximize();
	    nk.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    Thread.sleep(100);
	    nk.switchTo().frame("iframeResult");  // using id or  we can use name as well
	//    nk.switchTo().frame(0);//using index of frame
        nk.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(100);
        nk.switchTo().parentFrame();
   //     nk.switchTo().defaultContent();
        nk.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
