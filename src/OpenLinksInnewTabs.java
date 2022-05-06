import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinksInnewTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		footDriver(driver);
		columndriver(driver);
	
	}
	public static void footDriver(WebDriver driver) {
		WebElement fdriver = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		System.out.println(fdriver.findElements(By.tagName("a")).size());

	}
	public static void columndriver(WebDriver fdriver) {
		WebElement cdriver = fdriver.findElement(By.xpath("//tr/td[1]/ul"));
		for (int i=1; i<cdriver.findElements(By.tagName("a")).size();i++) {
		String keys =	Keys.chord(Keys.CONTROL,Keys.ENTER);
			cdriver.findElements(By.tagName("a")).get(i).sendKeys(keys);

			
		}
	}

}
