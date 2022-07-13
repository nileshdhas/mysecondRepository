package kiteapp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteUserIDtest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.out.println("***=====================================***");
		File myfile = new File("E:\\apaache pio\\poi-bin-5.2.2-20220312\\myExcelsheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String UN = mysheet.getRow(4).getCell(0).getStringCellValue();
		String PASS = mysheet.getRow(4).getCell(1).getStringCellValue();
		String PIN1= mysheet.getRow(4).getCell(2).getStringCellValue();
		
		System.out.println("***=====================================***");
		
	    System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	    // create objrct of chromeoptions class 
	    ChromeOptions opt =new ChromeOptions();
	     //  opt.addArguments("--disable-notifications");
	     //  opt.addArguments("--headless");
	    opt.addArguments("--incognito");
	   
	    
	    
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://kite.zerodha.com/");
	      Thread.sleep(5000);
	      //1st page use elements store in refrence varaible and takes actions on that
		WebElement Username1 = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	        Username1.sendKeys(UN);
	        password.sendKeys(PASS);
	        loginbutton.click();
	         Thread.sleep(5000);
	    // 2nd page find elements and store it in refrence variable and takes action on it
	    WebElement pin = driver.findElement(By.id("pin"));
	WebElement countinuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
	          pin.sendKeys(PIN1);
	          countinuebutton.click();
	          Thread.sleep(8000);
	//test case to check the userid  
	// Identify the path of username for checking
	WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
	String AcutalUsername = username.getText();// get the actual text
	String Expectedusername = UN;
	   // USE IF Else statment
	if(AcutalUsername.equals(Expectedusername)) 
	{
		System.out.println("username(ID) is matching TC IS PASS ");
	}
	else {
		System.out.println("username(ID) Is not matching tc is fail");
	}
	//to further actions on elements
	Thread.sleep(5000);
	//username.click();
	//driver.findElement(By.xpath("//a[@target='_self']")).click();
	//Thread.sleep(5000);
	//driver.quit();
	}

}
