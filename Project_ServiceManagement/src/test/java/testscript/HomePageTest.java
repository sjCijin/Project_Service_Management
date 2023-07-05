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
	public void verifyToClickaddClient() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoClientPage();
		String expected=ExcelUtility.getString(1, 4, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.clientPageMsg();
		Assert.assertEquals(actual, expected);
	}
	@Test(groups="Regression")
	public void verifyToClickaddReparation() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoAddReperation();
		String expected=ExcelUtility.getString(1, 5, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.addReperationMsg();
		Assert.assertEquals(actual, expected);
	}
	@Test(groups="Sanity")
	public void verifyToClicksendSms() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoSendSms();
		String expected=ExcelUtility.getString(1, 6, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.sendSmsMsg();
		Assert.assertEquals(actual, expected);
	}
	@Test(groups="Regression")
	public void verifyToClicksendEmail() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		homepage.verifyNavigatetoSendEmail();
		String expected=ExcelUtility.getString(1, 7, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.sendEmailMsg();
		Assert.assertEquals(actual, expected);
	} 
	@Test(groups="Sanity")
	public void verifyToClickquantityAlerts() throws IOException {
		homepage=new HomePage(driver);
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();		
		homepage.verifyNavigatetoQuantityAlert();
		String expected=ExcelUtility.getString(1, 8, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=homepage.quantityAlertMsg();
		Assert.assertEquals(actual, expected);
	}


	
		}



