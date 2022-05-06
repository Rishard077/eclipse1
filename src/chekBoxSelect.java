import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class chekBoxSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());//to chek is the chekbox is selected
		//System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());// to count the number of chekboxes, the locator should be commen to all check boxes
		//driver.close();
 
	}

}
