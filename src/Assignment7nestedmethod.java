import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7nestedmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table1 =driver.findElement(By.cssSelector(".table-display "));
	System.out.println(	table1.findElements(By.tagName("tr")).size());
	System.out.println( table1.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	System.out.println(table1.findElements(By.tagName("tr")).get(3).getText());

	}

}
