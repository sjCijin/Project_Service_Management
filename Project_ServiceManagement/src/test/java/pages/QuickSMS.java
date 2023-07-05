package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class QuickSMS {
	public WebDriver driver;
	
	PageUtility page=new PageUtility();
	
	public QuickSMS(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath="//*[@id=\"phone_number\"]")WebElement phoneNumberField;
	@FindBy(xpath="(//*[@id=\"fastsms\"])[1]")WebElement textField;
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/section/div[2]/section[2]/div[3]/div[3]/button")WebElement sendButton;
	@FindBy(xpath="//h3[text()='Quick SMS']")WebElement verifyMessage;
	
	
	public void phoneNumber(String number)
	{
		page.enterText(phoneNumberField, number);
	}
	public void messageField(String message)
	{
		page.enterText(textField, message);
	}
	@SuppressWarnings("static-access")
	public void sendButton()
	{
		page.clickonElement(sendButton);
	}
	public String quickSMShead()
	{
		WaitUtility.waitElement(driver, verifyMessage);
		return page.getElementText(verifyMessage);
	}
	

}
