import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLChek {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe" );
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://expired.badssl.com/");
		System.out.println( driver.getTitle());

	}

}
