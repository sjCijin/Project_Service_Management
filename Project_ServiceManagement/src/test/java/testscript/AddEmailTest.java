package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddEmail;
import pages.HomePage;
import pages.Login;
import servicemanagementproject.Base;
import utilities.ExcelUtility;

public class AddEmailTest extends Base{
	Login loginpage;
	HomePage home;
	AddEmail email;
	
	@Test
	public void verifyUserCanAbleToSendMail() throws IOException
	{
		loginpage=new Login(driver);
		home=new HomePage(driver);
		email=new AddEmail(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		home.verifyNavigatetoSendEmail();
		email.selectClientName();
		email.enterTheSubject(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "sendEmail"));
		email.enterTheText(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "sendEmail"));
		email.clickSendButton();
		email.closeTheSendEmail();
	}

}
