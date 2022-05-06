import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Rishard");
		driver.findElement(By.name("email")).sendKeys("moahmed.risharrd@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123risha");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(staticDropdown);
        dropDown.selectByIndex(1);
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("22/10/1991");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println( driver.findElement(By.className("alert")).getText());
        Assert.assertEquals(driver.findElement(By.className("alert")).getText(),"Success! The Form has been submitted successfully!.");
       
		
		
		
		
	}

}
