package pomclassersforkiteapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage {

	// VARIABLE
	@FindBy(id = "pin") private WebElement PIN;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	//  create constructor
	public Pinpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	 
	
	// methods
	public void sendpin(String pin) 
	{
		PIN.sendKeys(pin);
	}
	
	public void continuebutton() {
		continuebutton.click();
	}
	
}
