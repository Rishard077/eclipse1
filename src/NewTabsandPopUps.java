import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabsandPopUps {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("1st Window is "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.netflix.com/lk/");
		
		System.out.println("2nd window is :"+driver.getTitle());
		
		driver.findElement(By.cssSelector("a[class='authLinks redButton']")).click();
		//System.out.println("2nd window is :"+driver.getTitle());
		Set<String> windH = driver.getWindowHandles();
		java.util.Iterator<String> it = windH.iterator();
	//String firstWindow =	it.next();
	String secondWindow = 	it.next();
	String thirdwindow =	it.next();
	driver.switchTo().window(thirdwindow);
	System.out.println("3nd window is :"+driver.getTitle());
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
	System.out.println("4thwindow window is"+driver.getTitle());
	//driver.close();
	//driver.switchTo().window(secondWindow);
	//driver.close();
	//driver.switchTo().window(firstWindow);
	//driver.close();
	//driver.close();
	driver.quit();
	

	}

}
