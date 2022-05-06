import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text = "Rishad";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
	    System.out.println (driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // since popup alerts are made of javascript cant find elements using php, using switchto alert
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println (driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();

	}

}
