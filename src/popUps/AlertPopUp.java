package popUps;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver nk=new ChromeDriver();
		nk.manage().window().maximize();
	    nk.get("https://demoqa.com/alerts");
	    Thread.sleep(1000);
	    nk.findElement(By.id("alertButton")).click();
	    /*1. to handle alert pop_up we need to switch selenium focus from main page to alert
	    popup by using syntax*/
		Alert al = nk.switchTo().alert();
		/* Alert is an interface which contains abstract method like
		 * 1.accept():use to click on ok button.
		 * 2.dismiss():use to click on cancel button.
		 * 3.getText():use to getText present in an a alert popup
		 */
		System.out.println(al.getText());
		al.accept();
		nk.findElement(By.id("timerAlertButton")).click();

	}

}
