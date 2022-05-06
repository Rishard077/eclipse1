import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkIteratingByChekingAlltheLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		SoftAssert a =new SoftAssert(); // soft assertion
		
		List <WebElement> links =driver.findElements(By.cssSelector(".gf-li a"));
		
		for (WebElement link:links)// also for(int i=0;i<links.size();i++)
			
			{
			String url =   link.getAttribute("href");
			
			HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			
			conn.connect();
			
			int responseCode= conn.getResponseCode();
			
			System.out.println(responseCode);
			a.assertTrue(responseCode<400, "ink with text "+ link.getText()+ "with code"+responseCode); // this is same as the if condition written below and this has less codes
			//soft assertion is applied in above line order not to fail the script
			/*if (responseCode>400) 
			{
				System.out.println("link with text "+ link.getText()+ "with code"+responseCode);
				Assert.assertTrue(false); // this is hard assertion and deliberatly fails when this get response>400 and this assertions will stop the execution
				
			}*/
			}
		a.assertAll(); // soft assertion will continue the script until finding all the links in list WebElement finally  we use this assertion to fail the script and report the failure, if we do not use the 
	}

}
