package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Multiplescreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
		nk.manage().window().maximize();
	    nk.get("https://www.facebook.com/");
	    Thread.sleep(1000);
	    
	    File source = ((TakesScreenshot)nk).getScreenshotAs(OutputType.FILE);
	    
	    String str=RandomString.make(3);
	    File n=new File("D:\\MYSCREENSHOTno2"+str+".png");
	    FileHandler.copy(source, n);
	    
	    
	}

}
