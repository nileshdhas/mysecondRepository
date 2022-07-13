package kiteutility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	//excel
	//screenshot
	//closing
	
	
	public static String stratRedingDatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
	
	File myfile = new File("E:\\apaache pio\\poi-bin-5.2.2-20220312\\myExcelsheet.xlsx");
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}
	public static void capturescreenshot(WebDriver 	driver,String TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\myscreenshot"+TCID+".png");
		org.openqa.selenium.io.FileHandler.copy(src, des);
	}
}
