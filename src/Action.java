import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		//move to specific element hover the mouse over the element
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		//a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hi").doubleClick().build().perform();
		//a.moveToElement(move).

	}

}
