package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstcode {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://vctcpune.com/selenium/practice.html");


//driver.findElement(By.xpath("//lable[@for='radio1']")).click(); //find element method by clss.xpath for atrribute 
//driver.findElement(By.xpath("//label[@for='Radio4']")).click();
//driver.findElement(By.xpath("//td[text()='Velocity Trainers']")).click();// find element meyhod byclass.xpath of text
//	
//3. x path by conatin meyhod 
//tagname[contains(text(),'text value')] ..........   xpath express for text 
	
	//driver.findElement(By.xpath("//td[contains(text(),'Velocity Trainers')]")).click();
	
//tagname[contains(@atrributename,'atrribute value')] .......xpath exoression for atrribute   
	//driver.findElement(By.xpath("//td[contains(tesxt(),'Velocity Trainers')]")).click();
	
	
//4.x path by index method
//	(//tagname[@attributename='attibute valu'][index no])
	driver.findElement(By.xpath("(//div[@class='extradiv col-lg-3 col-md-6 col-12'])[2]")).click();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	
	}
	
	

	
}
