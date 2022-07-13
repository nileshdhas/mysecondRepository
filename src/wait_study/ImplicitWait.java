package wait_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
     
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
	}

}
