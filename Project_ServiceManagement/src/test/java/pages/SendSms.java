package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SendSms {
	public WebDriver driver;
	PageUtility page=new PageUtility();
	
	public SendSms(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"client_id_sms\"]")WebElement nameDropdown;
	@FindBy(xpath="(//*[@id=\"fastsms\"])[3]")WebElement textField;
	@FindBy(xpath="//*[@id=\"sendSMSModal\"]/div/div/div[3]/button[2]")WebElement sendButton;
	@FindBy(xpath="//*[@id=\"sendSMSModal\"]/div/div/div[3]/button[1]")WebElement closeButton;
	@FindBy(xpath="//*[@id=\"client_id_sms\"]/option[4]")WebElement client;
	
	
	@SuppressWarnings("static-access")
	public void clientNameDropdown(String name)
	{
		page.clickonElement(nameDropdown);
		page.enterText(nameDropdown, name);
		page.clickonElement(client);
	}
	public void messageField(String text)
	{
		page.enterText(textField, text);
	}
	@SuppressWarnings("static-access")
	public void sendButton()
	{
		page.clickonElement(sendButton);
	}
	@SuppressWarnings("static-access")
	public void closeButton()
	{
		page.clickonElement(closeButton);
	}
}
