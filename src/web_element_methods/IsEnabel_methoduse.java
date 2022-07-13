package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabel_methoduse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
      nk.get("https://www.discoveryplus.in/");
      Thread.sleep(30000);
	nk.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
	   WebElement otpbutton = nk.findElement(By.xpath("//button[text()='Get OTP']"));
//		boolean result1 = otpbutton.isEnabled();
//     System.out.println("result is "+ result1);
//     Thread.sleep(5000);
//     nk.findElement(By.id("mobileNumber")).sendKeys("8698203646");
//     boolean result2 = otpbutton.isEnabled();
//     System.out.println("result of button "+result2);
//     Thread.sleep(1000);
    // otpbutton.click();
     
    if(otpbutton.isEnabled()) {
    	System.out.println("otp button is enabel");
    	 nk.findElement(By.id("mobileNumber")).sendKeys("8698203646");
    	if(otpbutton.isEnabled()) {
    		System.out.println("otp button is enabel now");
    		}
    	else {
    		System.out.println("otp button is not enabel");
    	}	
    }
    else {
    	System.out.println("otp button not enabel");
    }
     
     
     
     
	}

}
