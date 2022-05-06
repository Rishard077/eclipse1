import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String chekBoxText= driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		Chekbox(driver,chekBoxText);
		DropDown(driver,chekBoxText);
		EnterName(driver, chekBoxText);
		AlerttextConfirmation(driver, chekBoxText);
		//driver.close();

		
		
	}
 public static void Chekbox(WebDriver driver,String chekBoxText) {
	 
	 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
	//String chekBoxText= driver.findElement(By.cssSelector("label[for='bmw'] ")).getText();
	System.out.println(chekBoxText);
 }
 public static void DropDown(WebDriver driver, String chekBoxText) {
	 WebElement StaticDropDown = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
	 Select dropdown = new Select(StaticDropDown);
	 dropdown.selectByVisibleText(chekBoxText);
 }
 public static void EnterName(WebDriver driver,String chekBoxText) {
	 driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys(chekBoxText);
	 driver.findElement(By.id("alertbtn")).click();
	 
 }
 public static void AlerttextConfirmation (WebDriver driver,String chekBoxText) {
	String alertText= driver.switchTo().alert().getText();
	if(alertText.contains(chekBoxText)) {
		System.out.println("you have slected the right option");}
	
		else System.out.println("please select the right option");
	 Assert.assertEquals(chekBoxText, alertText);
	   driver.switchTo().alert().accept();
		
	}

 }
 
 

