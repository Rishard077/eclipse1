import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildparentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		//Switching to the other window, which is a child window
		Set<String>windows =   driver.getWindowHandles();
		Iterator<String>it=windows.iterator();// we iterate to get the window id 
		String parentID= it.next();// window id of parent window
		String childID  =it.next();// window id of child window
		driver.switchTo().window(childID);// switching to child window
	 	System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());// grabbing the text from child window
	    String emailId=	driver.findElement(By.cssSelector("p.im-para.red")).getText().split("with")[0].split("at")[1].trim();	//mentor@rahulshettyacademy.com	
	    driver.switchTo().window(parentID);
	    driver.findElement(By.id("username")).sendKeys(emailId);

		WebDriverWait wait = new WebDriverWait(driver, 10);
	
	}

}
