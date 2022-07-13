package facebookTestbYTESTNG;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fb {
	WebDriver driver;
    String UN;
   String PASS;
    
@BeforeClass
public void launchingBrowser() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(1000);
	driver.manage().window().maximize();
	
}
@BeforeMethod
public void enterUserNameAndPassword() throws EncryptedDocumentException, IOException, InterruptedException {
	File myfile = new File("E:\\apaache pio\\poi-bin-5.2.2-20220312\\myExcelsheet.xlsx");
	String UN = WorkbookFactory.create(myfile).getSheet("Sheet4").getRow(3).getCell(0).getStringCellValue();
	String PASS = WorkbookFactory.create(myfile).getSheet("Sheet4").getRow(0).getCell(1).getStringCellValue();
	
	
	driver.findElement(By.id("email")).sendKeys(UN);
	driver.findElement(By.id("pass")).sendKeys(PASS);
	driver.findElement(By.name("login")).click();
	Thread.sleep(500);
}
@Test
public void validatingUserName() 
{
	String actualusername = driver.findElement(By.xpath("//span[text()='Nilesh Dhas']")).getText();
	String expectedusername = "Nilesh Dhas";
	Assert.assertEquals(actualusername, expectedusername,"tc is fail username is not match");
	Reporter.log("tc pass username is same",true);
}
@AfterMethod
public void logoutfb() {
	
}
@AfterClass
public void closeBrowser() throws InterruptedException 
{
     Thread.sleep(500);	
	driver.close();
}
}
