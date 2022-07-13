package wait_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
     
        WebDriverWait wait = new  WebDriverWait(driver,Duration.ofMillis(1000)); 
        WebElement mouse = driver.findElement(By.id("mousehover"));
        wait.until(ExpectedConditions.visibilityOf(mouse));
	
	}

}
