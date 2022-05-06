import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class roughwork {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishad\\Webdriver\\chromedriver.exe");
		
		/*WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		String a = "My name is 'Khan' is password";
		 String[] array1= a.split("'");
		 String b= array1[1];
		 String[]array2 =b.split("'");
		 String password = array2[1];
		
	}

}
