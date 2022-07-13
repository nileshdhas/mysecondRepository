package screenshot;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoteg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
		nk.manage().window().maximize();
	    nk.get("https://demoqa.com/");
	    Thread.sleep(10000);
	    File source = ((TakesScreenshot)nk).getScreenshotAs(OutputType.FILE);
	    File dist=new File("D:\\screenshot2.png");
	  org.openqa.selenium.io.FileHandler.copy(source, dist);
	  
	}

}
