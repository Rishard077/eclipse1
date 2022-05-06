package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;


import base.Page;


public class HomePage extends Page {

	
	


	

	public void getTextHome() {getText("HomeText_XPATH");}
	public void isHomePageLoaded() {IsElementDispalyed("SignInLink_CSS","Sign In Button Should Display");}

	public void clickonSignInLink()
	{
	click("SignInLink_CSS");
		
	}
	
	
}
