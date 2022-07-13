package pomclassersforkiteapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {

	//1st step VARIABLE
	@FindBy(id = "userid")private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")private WebElement passwords;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	
	
	   //2nd step create CONSTRUCTOR
	 public  Kiteloginpage(WebDriver driver) 
	   {
		 PageFactory.initElements(driver, this);
	   }
	 
	 
	    //3rd step  methods
	 
	 
	 public void sendusername(String userName) 
	   {
		 username.sendKeys(userName);
	   }
	 
	public void passwords(String password) 
	  {
		passwords.sendKeys( password);
	  }
	
	public void loginbutton() 
	{
		loginbutton.click();
	}
	
}
