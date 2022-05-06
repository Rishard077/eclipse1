package pages;

import java.io.IOException;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;


public class LoginPage extends Page {
	
	public void waintUntilEmailFieldIsDisplayed() 
	{
		
		 waitUntilElementisVisible("EmailFiled_CCS");
		
	}
	
	public void getEmailPlaceholdertext()
	{
		getText("EmailFiled_CCS");	
	}
	
	
	
	public boolean isEmailFiledPresent()
	{ 
		
		
		IsElementDispalyed("EmailFiled_CCS","Email Filed Shoul Be Displayed");
		return true;
	}
	
	public boolean isPasswordFiledPresent()
	{ 
		
		
		IsElementDispalyed("PassWordField_CSS","Password field Shoul Be Displayed");
		return true;
	}
	
	
	public void enterEmail(String email) 
	{
		type("EmailFiled_CCS", email);}
	public void clickNextBtn() {
		click("NextBtn_XPATH");}
	public void enterPasword(String password) {
		type("PassWordField_CSS",password);}
		
	
	
	
	
	
 public void  clickToSign()
 {
	 click("SignInBtn_XPATH");
 }
 
 
 
}
