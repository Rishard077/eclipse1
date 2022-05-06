package testCases;

import java.io.IOException;

import javax.mail.internet.NewsAddress;

import org.testng.annotations.Test;

import base.Page;
import pages.HomePage;
import pages.LoginPage;
import utilities.utiliteis;

public class LoginTest extends Page{
    
	
	
	
	@Test
	public void goToLoginLink() throws IOException {
		
		HomePage homepage = new HomePage();
		homepage.getTextHome();
		homepage.isHomePageLoaded();
		homepage.clickonSignInLink();
		
		
		
		
	}
	
    @Test
	public void goToLogin(String email,String password)
	{
		LoginPage loginPage= new LoginPage();
		loginPage.waintUntilEmailFieldIsDisplayed();
		loginPage.isEmailFiledPresent();
		loginPage.enterEmail(email);
		loginPage.clickNextBtn();
		loginPage.isPasswordFiledPresent();
		loginPage.enterPasword(password);
	}
	



	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

