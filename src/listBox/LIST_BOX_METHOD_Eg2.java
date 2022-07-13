package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class LIST_BOX_METHOD_Eg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
	    nk.get("https://www.facebook.com/");
	    Thread.sleep(10000);
	    nk.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	      Thread.sleep(1000);
	    
		WebElement day = nk.findElement(By.name("birthday_day"));
		Select v=new Select(day);
		v.selectByVisibleText("8");
		 Thread.sleep(8000);
		WebElement month = nk.findElement(By.id("month"));
		Select d=new Select(month);
		d.selectByVisibleText("Jan");
		Thread.sleep(8000);
		WebElement year = nk.findElement(By.id("year"));
		Select b=new Select(year);
		b.selectByValue("1996");
		Thread.sleep(8000);
		//nk.findElement(By.xpath("//label[text()='Male']")).click();
		
		for(int i=10;i<=25;i++) {
			
		v.selectByIndex(i);
		}
		for(int i=25;i>=10;i--) {
			v.selectByIndex(i);
		}
		
		for(int i=1;i<=12;i++) {
			d.selectByIndex(i);
		}
		
		}
		
		
		
	}


