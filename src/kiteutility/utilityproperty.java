package kiteutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityproperty 
{
public static void capturescreenshot(WebDriver driver,String TCID) throws IOException {
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des=new File("D:\\myscreenshot"+TCID+".png");
	org.openqa.selenium.io.FileHandler.copy(src, des);
}
	public static String getdatafromproperty(String key) throws IOException {
		Properties pro= new Properties();
		FileInputStream myfile=new FileInputStream("/selenium/myproperty.properties");
		pro.load(myfile);
		String value = pro.getProperty(key);
		return value;
	}


	
}
