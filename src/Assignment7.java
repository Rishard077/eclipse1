import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> numberOfRaws = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(numberOfRaws.size());
		List <WebElement> numberOfColumns =driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(numberOfColumns.size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
	}

}
