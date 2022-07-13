package MOCKSTUDY;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class STUDY {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\\\\\\\chromedriver.exe");	
		WebDriver bc=new ChromeDriver();
		bc.get("https://signup.zerodha.com/");
	//	bc.manage().window().maximize();
	//	Thread.sleep(10000);
		//bc.findElement(By.xpath("//input[@label='Mobile number']")).sendKeys("8698203646");
	//	bc.findElement(By.xpath("//input[@label='Mobile number']")).clear();
		bc.navigate().to("https://www.cricbuzz.com/");
		bc.navigate().refresh();
	//	bc.navigate().back();
	//	bc.navigate().forward();
//		String url = bc.getTitle();
//		System.out.println(bc.getTitle());
//		System.out.println(url);
//		System.out.println(bc.getCurrentUrl());
//		bc.close();
		
		
	}

}
