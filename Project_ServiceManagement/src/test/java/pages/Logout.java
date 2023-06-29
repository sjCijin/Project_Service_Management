package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class Logout {
public WebDriver driver;
	
	public Logout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//input[@name='identity']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passWord;
	@FindBy(xpath="//input[@name='submit']")WebElement button;
	@FindBy(xpath="(//span[text()='Joe Jacobs'])[1]")WebElement name;
	@FindBy(xpath="//a[text()='Sign out']")WebElement signOut;
	@FindBy(xpath="//p[text()='Logged Out Successfully']")WebElement logoutMsg;
	
	public void logOut() throws IOException {
		
		PageUtility.clickonElement(name);
		WaitUtility.waitForElementClickable(driver, name);
		PageUtility.clickonElement(signOut);
		//PageUtility.isElementDisplayed(button);
		//String expectedMessage=ExcelUtility.getString(1, 3, System.getProperty("user.dir")+constance.Constance.TESTDATAFILE, "my");
		//String actualMessage=PageUtility.getElementText(logoutMsg);
		//Assert.assertEquals(actualMessage, expectedMessage,"Logout Failed");
	}
}
