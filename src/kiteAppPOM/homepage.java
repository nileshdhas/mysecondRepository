package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	    //variable
	@FindBy(xpath = "//span[@class='user-id']") private WebElement username;
	
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutbutton;
	
	 
	   // create the constoructor
	public homepage(WebDriver driver) 
	     {
		PageFactory.initElements(driver, this);
	     }
	
	   // methods
	 public void valiadatedusername () 
	       {
		String actualname = username.getText();
		
		String expectedname="ELR321";
		
		if(actualname.equals(expectedname)) {
			System.out.println("user name is coreect tc is pass");
		       }
		else {
			System.out.println("username is incorrect ts is fail");
		}
	}
	
	    public void logoutbutton() throws InterruptedException 
	    {
		username.click();
		Thread.sleep(2000);
		logoutbutton.click();
	     }
}
