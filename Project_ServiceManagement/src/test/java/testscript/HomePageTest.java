package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;
import servicemanagementproject.Base;

public class HomePageTest extends Base {
	Login loginpage;
	HomePage homepage;
	
	@Test
	public void addClient() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		loginpage.clickLoginButton();
	
		homepage.verifyNavigatetoClientPage();
	}
	@Test
	public void addReparation() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoAddReperation();
	}
	@Test
	public void sendSms() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoSendSms();
	}
	@Test
	public void sendEmail() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoSendEmail();
	} 
	@Test
	public void quantityAlerts() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		loginpage.clickLoginButton();		
		homepage.verifyNavigatetoSendSms();
	}


	
		}



