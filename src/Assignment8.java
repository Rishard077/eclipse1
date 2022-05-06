import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).click();
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("Ind");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
	
	System.out.println(	driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).getAttribute("value"));
		
		

	}

}
