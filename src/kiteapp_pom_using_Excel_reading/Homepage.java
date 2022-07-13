package kiteapp_pom_using_Excel_reading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	// VARIABLE
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement username;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
	// create consrtouctor
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    }
	
	
	// methods
	public void validateUserName(String excpectedusername1 ) 
	{
		String excpectedusername=excpectedusername1;
		String actualusername = username.getText();
		
		if(excpectedusername.equals(actualusername)) {
			System.out.println("TC PASS USER NAME IS CORRECT");
		}
		else {
			System.out.println("tc fail user name is not match");
		}
		
	}
	
	public void logoutbtton() throws InterruptedException {
		username.click();
		Thread.sleep(1000);
		logoutbutton.click();
	}
	
	
}
