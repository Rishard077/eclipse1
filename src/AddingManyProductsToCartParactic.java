import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddingManyProductsToCartParactic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String [] productsToCart = {"Cucumber","Brocolli","Carrot"};
		addtoCart(driver,productsToCart);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(),"Code applied ..!");
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	

	}
	
	public static   void addtoCart(WebDriver driver,String [] productsToCart)
	{int j =0;
		
	List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i=0; i<products.size();i++) 
		
	{    
		String [] name =products.get(i).getText().split("-");
		String addProducts = name[0].trim();
		List productsToCartList = Arrays.asList(productsToCart);
		if(productsToCartList.contains(addProducts))
		 
		{ 
		j++;
		driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
		if(j==productsToCart.length);
		
				
			
			
		}
		
	
	}}
		
}
