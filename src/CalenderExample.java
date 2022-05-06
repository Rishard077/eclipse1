import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions"); 
		driver.findElement(ByName.id("travel_date")).click();
		Selectmonth(driver);
		SelectDay(driver);
	}
	public static void Selectmonth (WebDriver driver) {
		
		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("April")) 
		{driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
			
		}
	}
	public static void SelectDay (WebDriver driver) {
		List<WebElement> dates = driver.findElements(By.cssSelector("div.datepicker-days tr td.day"));
		int count = driver.findElements(By.cssSelector("div.datepicker-days tr td.day")).size();
		for (int i=0;i<count;i++) { String texts= driver.findElements(By.cssSelector("div.datepicker-days tr td.day")).get(i).getText();
		if (texts.equalsIgnoreCase("27"))
		{
             driver.findElements(By.cssSelector("div.datepicker-days tr td.day")).get(i).click();
             break;
		}
			
		}
	}

}
