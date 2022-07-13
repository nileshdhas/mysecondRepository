package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PINbutton_page {

	// data memeber ,/ variable
	
	@FindBy(id = "pin")private WebElement pin;
	
@FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;
	
	
  //create constrouctor
  public PINbutton_page(WebDriver driver) 
  {
	PageFactory.initElements(driver, this);
  }
	
//methods
  public void pin() {
	  pin.sendKeys("982278");
  }
  public void continuebutoon() {
	  continuebutton.click();
  }
  
  
}
