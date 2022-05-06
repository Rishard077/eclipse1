import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
		List <WebElement> numbers = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		
		
		for (int i=0; i<numbers.size();i++) {

		sum = sum+	Integer.parseInt(numbers.get(i).getText());
	
		}
		System.out.println(sum);
         int total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
         Assert.assertEquals(sum, total);
         List <WebElement> numbers1 = driver.findElements(By.cssSelector(".left-align td:nth-child(3)"));
         int sum1 =0;
         for(int j =0; j<numbers.size();j++) {
        	 sum1 = sum1 + Integer.parseInt(numbers1.get(j).getText());
         }
   // int total1 = Integer.parseInt(driver.findElement
	}

}
