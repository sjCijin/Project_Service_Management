package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;
import pages.QuickSMS;
import servicemanagementproject.Base;
import utilities.ExcelUtility;

public class QuickSMSTest extends Base{
	Login loginpage;
	HomePage home;
	QuickSMS quick;
	
	@Test
	public void verifyUserCanAbleToSendQuickSMS() throws IOException
	{
		loginpage=new Login(driver);
		home=new HomePage(driver);
		quick=new QuickSMS(driver);
		
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		quick.phoneNumber(ExcelUtility.getNumeric(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quicksms"));
		quick.messageField(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quicksms"));
		quick.sendButton();
		String expected=ExcelUtility.getString(1, 2, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quicksms");
		String actual=quick.quickSMShead();
		
		Assert.assertEquals(actual, expected);
		
		
	}
	

}
