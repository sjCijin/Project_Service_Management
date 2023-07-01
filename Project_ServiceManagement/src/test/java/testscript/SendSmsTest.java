package testscript;

import java.io.IOException;

import pages.HomePage;
import pages.Login;
import pages.SendSms;
import servicemanagementproject.Base;
import utilities.ExcelUtility;

public class SendSmsTest extends Base{
	Login loginpage;
	HomePage page;
	SendSms send;
	
	public void verifyWeathertheUserAbleToSelectTheClientName() throws IOException
	{
		loginpage=new Login(driver);
		page=new HomePage(driver);
		send=new SendSms(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		page.verifyNavigatetoSendSms();
		send.clientNameDropdown(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "sendsms"));
	}
	public void verifyWeathertheUserAbleToSendMessage() throws IOException
	{
		loginpage=new Login(driver);
		page=new HomePage(driver);
		send=new SendSms(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		page.verifyNavigatetoSendSms();
		send.messageField(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "sendsms"));
	}
	

}
