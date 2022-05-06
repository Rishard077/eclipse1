package roughWorks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Page;
import pages.HomePage;
import pages.HomePageCRM;
import pages.LoginPage;
import pages.ZohoAppsPage;


public class LoginTest extends Page {
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		HomePage homepage = new HomePage();
		homepage.getTextHome();
		homepage.clickonSignInLink();
		LoginPage loginPage = new LoginPage();
		loginPage.waintUntilEmailFieldIsDisplayed();
        loginPage.enterEmail("mohamed.risharrd@gmail.com");
        loginPage.clickNextBtn();
        loginPage.isPasswordFiledPresent();
        loginPage.enterEmail("rishad077");
		loginPage.clickToSign();
		
		//ZohoAppsPage zohoAppsPage = new ZohoAppsPage();
		//zohoAppsPage.goToCRM();
		//zohoAppsPage.swithWindow();
		//HomePageCRM homePageCRM = new HomePageCRM();
		//homePageCRM.goToAccounts();
		
		
		
	
	}

}
