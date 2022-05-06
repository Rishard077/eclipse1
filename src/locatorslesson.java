import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatorslesson {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rishad");
		driver.findElement(By.name("inputPassword")).sendKeys("rishad123");
		driver.findElement(By.className("signInBtn")).click();
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

	}

}
