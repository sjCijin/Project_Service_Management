package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddClient;
import pages.HomePage;
import pages.Login;
import servicemanagementproject.Base;
import utilities.ExcelUtility;


public class AddClientTest extends Base{
	Login loginpage;
	HomePage home;
	AddClient addclient;
	
	
	@Test
	public void verifyTheClientname() throws IOException
	{
		loginpage=new Login(driver);
		home=new HomePage(driver);
		addclient=new AddClient(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		home.verifyNavigatetoClientPage();
		addclient.clientField(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.companyField(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.geoLocate(ExcelUtility.getString(1, 2, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.address(ExcelUtility.getString(1, 3, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.city(ExcelUtility.getString(1, 4, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.postalCode(ExcelUtility.getNumeric(1, 5, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.telephone(ExcelUtility.getNumeric(1, 6, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.email(ExcelUtility.getString(1, 7, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.vat(ExcelUtility.getNumeric(1, 8, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.ssn(ExcelUtility.getNumeric(1, 9, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));
		addclient.comment(ExcelUtility.getString(1, 10, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "addClient"));

	}
	
	
}
