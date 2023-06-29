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
		homepage.verifyNavigatetoClientPage();
	}
	@Test
	public void addReparation() throws IOException {
		
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		homepage=new HomePage(driver);
		homepage.verifyNavigatetoAddReperation();
	}
	@Test
	public void sendSms() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		homepage.verifyNavigatetoSendSms();
	}
	@Test
	public void sendEmail() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName("admin@admin");
		loginpage.enterPassword("password");
		homepage.verifyNavigatetoSendEmail();
	}
//	@Test
//	public void quantityAlerts() throws IOException {
//		homepage=new HomePage(driver);
//		loginpage=new Login(driver);
//		loginpage.validLogin();
//		homepage.verifyNavigatetoSendSms();
//	}


	
		}


