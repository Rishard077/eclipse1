import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindowAndNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to open selenium in maximized window
		driver.get("https://www.google.com"); // 
		driver.navigate().to("https://www.facebook.com"); //to navigate from one web to another page
		driver.navigate().back();// navigate back to the previous page
		driver.navigate().forward();
		driver.close();

	}

}
