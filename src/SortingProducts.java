import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingProducts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		
		//1.click on the column where the products are in
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//2. capture the webelements and store as a list
		List <WebElement> productslist =driver.findElements(By.xpath("//tr/td[1]"));
	
		
		//3. capture the text of webelements and store into new list
		 List <String> productListNames = productslist.stream().map(s->s.getText()).collect(Collectors.toList());
		//4. do sorting for the new list and store as sorted list
		List <String> sortedList = productListNames.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		//5.compare new list and sorted list 
		Assert.assertTrue(productListNames.equals(sortedList));
		//get the price of beans only
	List<String>price;
	do {List <WebElement> products =driver.findElements(By.xpath("//tr/td[1]"));
	 price =	products.stream().filter(s->s.getText().contains("Rice"))
	.map(s->priceofVeggies(s)).collect(Collectors.toList());
	if(price.size()<1) {driver.findElement(By.cssSelector("[aria-label='Next']")).click();}
	price.stream().forEach(a->System.out.println(a));}
	while (price.size()<1);
	
	
	}

	private static String priceofVeggies(WebElement s) {
	String pricevalue=	s.findElement(By.xpath("following::td[1]")).getText();
		return pricevalue;
	}

}
