package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login;
import servicemanagementproject.Base;
import utilities.ExcelUtility;



public class LoginTest extends Base {

	Login loginpage;
	
	@Test
	
	public void verifyUserIsAbleToLoginWithValidCredentials() throws IOException
	{
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 2, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		
		
		
		String expectedMessage=ExcelUtility.getString(1,3, System.getProperty("user.dir")+constance.Constance.TESTDATAFILE, "my");
		String actualmessage=loginpage.getAlertMessage();
		
		Assert.assertEquals(actualmessage, expectedMessage);
				
	}
	
	

//	@Test
//	public void login() throws IOException {
//		loginpage = new Login(driver);
//		loginpage.validLogin();
//	}

}
