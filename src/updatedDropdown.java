import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click() ;// Selecting the dropdown
		Thread.sleep(2000L); // for delaying 2 seconds
		
		/*int i =5;
		while(i<5)// to loop the below code five times
		
		{driver.findElement(By.id("hrefIncAdt")).click();
		i++;}*/// the code for selecting adults only 5 adults can be selected in the website
	for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

	

		}
		
	    
		driver.findElement(By.id("btnclosepaxoption")).click(); // element for done botton
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // to see the value of out put we are getting in the console
		
		driver.close();
		
		
		

		
	
	}

}
