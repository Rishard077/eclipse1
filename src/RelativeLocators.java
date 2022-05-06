import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		/*driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.findElement(By.xpath("//input[@minlength='2']"));
		WebElement nameBox = driver.findElement(By.xpath("//input[@minlength='2']"));
		
		//System.out.println( driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
		WebElement chekbox= driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(chekbox)).click();*/
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.cssSelector("input[name$='email']")).sendKeys("arabi@gmail.com");
		// there are two maching element for submit btn in above element so we use reltive loactor to identify what exactly we want
		//driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.linkText("Signin"))).click();
		driver.findElement(RelativeLocator.withTagName("input").below(By.xpath("//fieldset[7]/input"))).click();
	}
}
