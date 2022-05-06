import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingAllToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] productsToCart = {"Cucumber","Brocolli","Carrot"};
		List<String>prolisttocart =Arrays.asList(productsToCart);
		System.out.println(prolisttocart);
		 List < WebElement >products = driver.findElements(By.cssSelector("div.product-action button"));
		 
		MoreItems(driver);
		
		Thread.sleep(5000);
		//MoreItems(driver); i should study how to addmore items ( pressing + button many times for many items)
		Addtocart(driver,products);
		

	}
      public static void Addtocart(WebDriver driver,List < WebElement >products) {
    	// List < WebElement >products = driver.findElements(By.cssSelector("div.product-action button"));
    	 for(int i =0; i< products.size(); i++){products.get(i).click();}
    	  
      }
      public static void MoreItems(WebDriver driver) {
    	  List <WebElement>addmore= driver.findElements(By.cssSelector("a.increment"));
    	  for(int j=0; j<5; j++) {driver.findElements(By.cssSelector("a.increment")).get(j).click();}
    	  
      }
      }

