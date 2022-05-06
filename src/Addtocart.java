import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 int j=0;
		String [] productsNeeded = {"Brocolli","Cucumber","Beetroot"}; // add to cart differnt items
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000);
		List <WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0;i<product.size();i++) 
		
		{
			// Brocolli - 1 Kg
			
			String[] name = product.get(i).getText().split("-");
			String formatedName=name[0].trim();// we have to split(SEPERATE THE WORDS FROM GIVEN LETTER TO FORM A ARRAY) and trim(REMOVE WHITE SPACE) the name to get the actual vegitable name
			
			// check weather name is present in array
			// convert array into arraylist for easy search,, just google it
			 List productList = Arrays.asList(productsNeeded);
			
			
			if(productList.contains(formatedName)) {
				j++;
				driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
			if (j==3)
				break;
			}
		} 
	}

}
