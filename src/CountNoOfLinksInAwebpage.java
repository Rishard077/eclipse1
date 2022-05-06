import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfLinksInAwebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdrive/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		CountLinks(driver);
		CountLinksofFooter(driver);
		clickingTheLinks(driver);
		PrintTitleOfWindows(driver);
		

		//driver.close();
	
		
		
	}

 public static void CountLinks(WebDriver driver) {//give the count of links on entire page
	 System.out.println(driver.findElements(By.tagName("a")).size());
	 
 }//limiting webdriver scope and create Webelement out of it
 public static void CountLinksofFooter (WebDriver driver) { //gives the count of links in the footer sections 
	 WebElement footdriver= driver.findElement(By.cssSelector("div[id='gf-BIG']"));
	 System.out.println(footdriver.findElements(By.tagName("a")).size());
 }
 public static void clickingTheLinks(WebDriver footdriver) {//gives the count of links in the coulmn
	 WebElement columndriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 System.out.println(columndriver.findElements(By.tagName("a")).size());
 
 // click on each link on that column to see weahter they are working properly
 
	      String clickOnLink= Keys.chord(Keys.CONTROL,Keys.ENTER);// to press cntr+entr to open each link in new tab
	      
	 for (int i=1; i<columndriver.findElements(By.tagName("a")).size();i++){//get the number of links and  clicking the respective links
		 
		 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		
	 }
		 
	 }
 public static void PrintTitleOfWindows(WebDriver driver) {//gettitle of every page you opened
	 WebElement footdriver= driver.findElement(By.cssSelector("div[id='gf-BIG']"));
	 WebElement columndriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 Set<String>windows =   driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		while(it.hasNext()) {//use while loop it.hasNext(),condition to go for eveery next page you open
			driver.switchTo().window(it.next());// switching to every window you opend
			System.out.println(driver.getTitle());// get title of every window you opened
		}
	
	 
	 
 }
	 
	 
 }
 

