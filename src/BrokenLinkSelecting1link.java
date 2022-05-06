import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkSelecting1link {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    //String url =driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
	    String url = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		
		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode= conn.getResponseCode();
		System.out.println(responseCode);
		
		
	}

}
