import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autotpassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		String name= "Rishrd";
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='logout-btn'")).click();
		driver.close();
	

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	String passwordText=driver.findElement(By.cssSelector("form p")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String[]a1=   passwordText.split("'");
	//String b = a1[1];
	//String[]a2=b.split("'");
    String password =a1[1].split("'")[0];
    return password;
	
		
		
	}

}
