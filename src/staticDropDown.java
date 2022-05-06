import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class staticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));// first we have to find the element of dropdown
		Select dropdown =new Select(staticDropdown); // then we have to create an object called dropdown
		
		dropdown.selectByIndex(3);// we can call the class by dropdown. slect by index using the value of index
		
		System.out.println( dropdown.getFirstSelectedOption().getText()); // we can see weather selected dropdown is printed in the console
		
		dropdown.selectByVisibleText("AED");// we can use the text in the drop down by calling this method
		
		System.out.println( dropdown.getFirstSelectedOption().getText()); // we can see weather the selected dropdown is printed in the console
		
		dropdown.selectByValue("INR"); // we can select by value by using value attribute in the webelement
		System.out.println( dropdown.getFirstSelectedOption().getText());
		driver.close();
	//	Assert.assertEquals(false, null)
	}

}
