package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.CustomListeners;
import utilities.ExcelReader;
import utilities.ExtentManager;

public class Page {

    public static   WebDriver driver;
	 public static  Properties config= new Properties();
     public static   Properties OR = new Properties();
	 public static FileInputStream fis;
	 public static  Logger Log=Logger.getLogger(Page.class.getName());
	 public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\excel\\testdata.xlsx");
	 public static WebDriverWait wait;
	 public static String browser;
	// public ExtentReports rep = ExtentManager.getInstance();

  
  public Page()   
	  
	       
	        {	if (driver== null) {
	   	
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
	        Log.debug("config loaded successsfully");
	        try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
			Log.debug("marin");
			Log.error("patta erroer");}
			
				
				
				

			if(driver==null) {	if (config.getProperty("browser").equals("firefox")) {

					// System.setProperty("webdriver.gecko.driver", "gecko.exe");
				
					driver = new FirefoxDriver();

				} else if (config.getProperty("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "\\src\\main\\resources\\excecutables\\chromedriver.exe");
				   WebDriverManager.chromedriver().setup();
		               driver = new ChromeDriver();
					Log.debug("Chrome Launched !!!");}
				 else if (config.getProperty("browser").equals("ie")) {

					System.setProperty("webdriver.ie.driver",
							System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();

				}

				driver.get(config.getProperty("url"));
				Log.debug("Navigated to : " + config.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
						TimeUnit.SECONDS);
				wait = new WebDriverWait(driver, 5);
	       }}

public void click(String locator) {

	if (locator.endsWith("_CSS")) {
		driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
	} else if (locator.endsWith("_XPATH")) {
		driver.findElement(By.xpath(OR.getProperty(locator))).click();
	} else if (locator.endsWith("_ID")) {
		driver.findElement(By.id(OR.getProperty(locator))).click();
	}
	//CustomListeners.testReport.get().log(Status.INFO, "Clicking on : " + locator);
}





public void waitUntilElementisVisible(String locator)
{
	if(locator.endsWith("_CSS")) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(OR.getProperty("locator"))));}
	
	else if (locator.endsWith("_Xpath")) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(OR.getProperty("locator"))));}
	else if (locator.contains("_ID")) 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(OR.getProperty("locator"))));
	}
}



	
public void type(String locator, String value) {

	if (locator.endsWith("_CSS")) {
		driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
	} else if (locator.endsWith("_XPATH")) {
		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
	} else if (locator.endsWith("_ID")) {
		driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
	}
}




public void getText(String locator) {
	if(locator.endsWith("_XPATH")) {
	System.out.println( driver.findElement(By.xpath(OR.getProperty(locator))).getText());
}
	
	
	}


	
public static WebElement element;	
public boolean IsElementDispalyed(String locator, String messege)
{
	
	if (locator.endsWith("_CSS")) {
	element=	driver.findElement(By.cssSelector(OR.getProperty(locator)));
	} else if (locator.endsWith("_XPATH")) {
		element=	driver.findElement(By.xpath(OR.getProperty(locator)));
	} else if (locator.endsWith("_ID")) {
		element=	driver.findElement(By.id(OR.getProperty(locator)));}
     
	org.testng.Assert.assertTrue(element.isDisplayed(),messege);
	return true;

}








public static void quit() {
	driver.quit();
	}



}
	//CustomListeners.testReport.get().log(Status.INFO, "Typing in : " + locator + " entered value as " + value);}




