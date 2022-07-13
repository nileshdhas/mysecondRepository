package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page {
     // data memebers
	
	@FindBy(id = "userid")  private WebElement username;
	
	@FindBy(id = "password")private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	
	
	//create constructor
	public  Kite_login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods
	public void sendusername() 
	{
		username.sendKeys("ELR321");
	}
	
	public void password() {
		password.sendKeys("Dhana1111");
	}
	public void loginbutton() {
		loginbutton.click();
	}
	
	
	
}
