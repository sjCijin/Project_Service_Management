package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login;
import pages.Logout;
import servicemanagementproject.Base;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	Login loginpage;
	Logout logoutpage;
	@Test
	public void checkLogout() throws IOException{
		loginpage=new Login(driver);
		loginpage.enterUserName(ExcelUtility.getString(1, 0, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.enterPassword(ExcelUtility.getString(1, 1, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my"));
		loginpage.clickLoginButton();
		logoutpage.clickOnName();
		logoutpage.clickOnSignoutButton();
		String expected=ExcelUtility.getString(1, 3, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		String actual=logoutpage.logoutMessage();
		Assert.assertEquals(actual, expected);

}
}
