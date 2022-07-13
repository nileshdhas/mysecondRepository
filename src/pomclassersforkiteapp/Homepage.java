package pomclassersforkiteapp;

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
	
	// TO get actual User Name
	public String getActualUsername() {
		String actualusername = username.getText();
		return actualusername;
	}
	
	public void logoutbtton() throws InterruptedException {
		username.click();
		Thread.sleep(1000);
		logoutbutton.click();
	}
	
	
}
