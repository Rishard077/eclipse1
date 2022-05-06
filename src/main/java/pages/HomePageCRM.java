package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;



public class HomePageCRM  extends Page{

	
	
	public void goToAccounts() {
		
		
		driver.findElement(By.cssSelector("div[data-value='Accounts']")).click();
		driver.findElement(By.xpath("//button[@click='crm-customview-layer => createRecord(module)']")).click();
	}
	

}
