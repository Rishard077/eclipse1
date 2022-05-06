import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSingleProductToCartPractica {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0; i<products.size();i++) 
		{
			String name =products.get(i).getText();
			if (name.contains("Cucumber - 1 Kg")) 
			{driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
			break;}
				
			
			
			
		}
		}
			
			
		// TODO Auto-generated method stub

	

}
