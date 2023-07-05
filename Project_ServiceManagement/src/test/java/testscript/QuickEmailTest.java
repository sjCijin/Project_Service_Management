package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;
import pages.QuickEmail;
import servicemanagementproject.Base;
import utilities.ExcelUtility;

public class QuickEmailTest extends Base{
	Login loginpage;
	HomePage home;
	QuickEmail quickE;
	
	@Test
	public void verifyUserCanAbleToAcessQuickEamilFiled() throws IOException
	{
		loginpage=new Login(driver);
		home=new HomePage(driver);
		quickE=new QuickEmail(driver);
		
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		quickE.senToField(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quickemail"));
		quickE.subjectField(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quickemail"));
		quickE.mailField(ExcelUtility.getString(1, 2, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quickemail"));
		quickE.sendButton();
		String actual=ExcelUtility.getString(1, 3, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "quickemail");
		String expected=quickE.quickEmailHead();
		Assert.assertEquals(actual, expected);
		
	}

}
