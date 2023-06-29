package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Login;
import pages.Logout;
import servicemanagementproject.Base;

public class LogoutTest extends Base {
	Login loginpage;
	Logout logoutpage;
	@Test
	public void checkLogout() throws IOException {
		loginpage=new Login(driver);
		//loginpage.validLogin();
		logoutpage.logOut();
	

}
}
