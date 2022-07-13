package kiteapp_pom_using_Excel_reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.out.println("***=====================================***");
		File myfile = new File("E:\\apaache pio\\poi-bin-5.2.2-20220312\\myExcelsheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String UN = mysheet.getRow(4).getCell(0).getStringCellValue();
		String PASS = mysheet.getRow(4).getCell(1).getStringCellValue();
		String PIN1= mysheet.getRow(4).getCell(2).getStringCellValue();
		
		System.out.println("***=====================================***");
		
	    System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://kite.zerodha.com/");
	      Thread.sleep(2000);
	      System.out.println("======================================");
	      Kiteloginpage login =new Kiteloginpage(driver);
	      
	      login.sendusername(UN);
	      login.passwords(PASS);
	      login.loginbutton();
	      
	      Thread.sleep(2000);
	      System.out.println("======================================");
	      
	      Pinpage pinn= new Pinpage(driver);
	      pinn.sendpin(PIN1);
	      pinn.continuebutton();
	      
	      Thread.sleep(2000);
	      System.out.println("======================================");
	      
	      Homepage h =new Homepage(driver);
	      h.validateUserName(UN);
	      h.logoutbtton();
	      
	      
	      
	      
	}

}
