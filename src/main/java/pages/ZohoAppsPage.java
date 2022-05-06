package pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class ZohoAppsPage extends Page {
	
     
	
	public void goToCRM () 
	{
		driver.findElement(By.cssSelector("a[id='all-apps']")).click();
		
		
		driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[1]/div[1]/ul/li[1]/div[1]/a[1]/p")).click();
		
	
	}
	public void swithWindow() {
		
		
		Set<String>windows =   driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String appPage= it.next();// window id of parent window
		String crmPage  =it.next();// window id of child window
		driver.switchTo().window(crmPage);// switching to child window
	}
}
