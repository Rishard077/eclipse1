import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calenderDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AMD']")).click();//select xpath for parent and give a space xpath for child 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='GOI']")).click();// select cssselctor for parent and give a space css for child
		Thread.sleep(1000);
		driver.findElement(By.className("ui-state-default")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled() ); // to chek before clicking the radio button the calender is enabled, it should be false
		System.out.println( driver.findElement(By.id("Div1")).getAttribute("style")); // to print the attribute value of return calender before clicking radio btn
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println( driver.findElement(By.id("Div1")).getAttribute("style")); // to get the attribute value of return calendr after clicking the radio btn
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
		{System.out.println("its enabled");
		Assert.assertTrue(true);}
		else {Assert.assertTrue(false);}
		
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled() ); // to check after clicking the radio button to round trip the calender for return is enabled, it should give true but both cases it showed true,
		//driver.close();
	}

}
