import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// switching to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		// after switching to new tab selenium will not understand its in new tab so we have to give the window ID using following step
		Set<String> handles =driver.getWindowHandles();
		// window IDs are stored in a set so we have to declare the set as above step
		// here we have two windows 1 is parent window and 2.child window, the we have to iterate it to get to the child window,
		Iterator <String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindwo = it.next();
		driver.switchTo().window(childWindwo);
		driver.get("https://rahulshettyacademy.com/#/index");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys(courseName);

	}

}
