package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class Login {
	public WebDriver driver;
	PageUtility page=new PageUtility();

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='identity']")
	WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	@FindBy(xpath = "//input[@name='submit']")WebElement loginButton;
	// @FindBy(name="remember")WebElement remeberMeCheckBox;
	// @FindBy(linkText="Forgot your password?")WebElement forgotPasswordLink;
	// @FindBy(linkText="Back to home page")WebElement backToHomePageLink;
	@FindBy(xpath="//div[@class='alert alert-success']//child::p")WebElement alertMessage;

	public void enterUserName(String user)
	{
		 page.enterText(userName, user);
	}
	public void enterPassword(String password)
	{
		 page.enterText(passWord, password);
	}
	
	public void clickLoginButton()
	{
		 PageUtility.clickonElement(loginButton);
		 WaitUtility.waitForElementClickable(driver, loginButton);
	}
	public String getAlertMessage()
	{
		WaitUtility.waitElement(driver, alertMessage);
		return page.getElementText(alertMessage);
	
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
//	public void validLogin() throws IOException {
//		String username = ExcelUtility.getString(1, 0,
//				System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
//		String password = ExcelUtility.getString(1, 1,
//				System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
//		// String expectedMessage=ExcelUtility.getString(1, 2,
//		// System.getProperty("user.dir")+constance.Constance.TESTDATAFILE, "my");
//		PageUtility.enterText(userName, username);
//		PageUtility.enterText(passWord, password);
//		//PageUtility.isElementDisplayed(button);
//		PageUtility.clickonElement(button);
//		WaitUtility.waitForElementClickable(driver, button);
//		// String actualmessage=PageUtility.getElementText(alertMessage);
//		// Assert.assertEquals(actualmessage, expectedMessage, "Login Failed");
//	}

}
