package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;




public class Logout {
public WebDriver driver;
PageUtility page=new PageUtility();
	
	public Logout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//input[@name='identity']")WebElement userName;
	@FindBy(xpath="//input[@name='password']")WebElement passWord;
	@FindBy(xpath="//input[@name='submit']")WebElement button;
	@FindBy(xpath="/html/body/div[2]/div/header/nav/div/ul/li[3]")WebElement name;
	@FindBy(xpath="//a[text()='Sign out']")WebElement signOut;
	@FindBy(xpath="//p[text()='Logged Out Successfully']")WebElement logoutMsg;
	
	@SuppressWarnings("static-access")
	public void clickOnName(){
		WaitUtility.waitElement(driver, name);
		page.clickonElement(name);
	}
	@SuppressWarnings("static-access")
	public void clickOnSignoutButton(){
		page.clickonElement(signOut);
	}
	public String logoutMessage()
	{
		WaitUtility.waitElement(driver, logoutMsg);
		return page.getElementText(logoutMsg);
	}
}
