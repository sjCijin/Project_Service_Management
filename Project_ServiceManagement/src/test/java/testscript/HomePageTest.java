package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;
import servicemanagementproject.Base;
import utilities.ExcelUtility;

public class HomePageTest extends Base {
	Login loginpage;
	HomePage homepage;
	
	@Test(groups="Sanity")
	public void addClient() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoClientPage();
		String expected=ExcelUtility.getString(1, 5, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.ClientPageMsg();
		Assert.assertEquals(actual, expected);
	}
	@Test(groups="Regression")
	public void addReparation() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoAddReperation();
		String expected=ExcelUtility.getString(1, 6, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.addReperationMsg();
		Assert.assertEquals(actual, expected);
	}
	@Test(groups="Sanity")
	public void sendSms() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoSendSms();
		String expected=ExcelUtility.getString(1, 7, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.sendSmsMsg();
		Assert.assertEquals(actual, expected);
	}
	@Test(groups="Regression")
	public void sendEmail() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoSendEmail();
		String expected=ExcelUtility.getString(1, 8, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.sendEmailMsg();
		Assert.assertEquals(actual, expected);
	} 
	@Test(groups="Sanity")
	public void quantityAlerts() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();		
		homepage.verifyNavigatetoSendSms();
		String expected=ExcelUtility.getString(1, 9, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.quantityAlertMsg();
		Assert.assertEquals(actual, expected);
	}


	
		}



