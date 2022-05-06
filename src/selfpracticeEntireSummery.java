import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selfpracticeEntireSummery {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		
		String name= "Rishard";
		WebDriver driver=new ChromeDriver();
		String password =getPassword(driver);
		 System.out.println(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("anything");
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("anythingelse");
		///driver.findElement(By.xpath("//form/input[3]")).sendKeys("anynumber");
		//driver.findElement(By.className("reset-pwd-btn")).click();
		
	   // System.out.println(	 driver.findElement(By.className("infoMsg")).getText());
	   // driver.findElement(By.className("go-to-login-btn")).click();
	  //  driver.findElement(By.id("inputUsername")).sendKeys(name);
	  //  driver.findElement(By.name("inputPassword")).sendKeys(password);
	    Thread.sleep(2000);
	   
	    driver.close();
	    
		

	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		
	String passwordText=driver.findElement(By.className("infoMsg")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	 String[] array=  passwordText.split("'");
	String password=array[1].split("'")[0];
	return password;
	
/*System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
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
    return password;*/
}
}