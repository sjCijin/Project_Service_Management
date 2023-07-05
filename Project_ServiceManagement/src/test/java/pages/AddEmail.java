package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AddEmail {
	public WebDriver driver;
	PageUtility page=new PageUtility();
	
	public AddEmail(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"sendEmail\"]/div[1]/select/option[7]")WebElement clientSelect;
	@FindBy(xpath="//*[@id=\"subject\"]")WebElement subject;
	@FindBy(xpath="//*[@id=\"sms_body\"]")WebElement textMessage;
	@FindBy(xpath="//*[@id=\"sendEmailModal\"]/div/div/div[3]/button[2]")WebElement sendButton;
	@FindBy(xpath="//*[@id=\"sendEmailModal\"]/div/div/div[3]/button[1]")WebElement close;
	
	@SuppressWarnings("static-access")
	public void selectClientName()
	{
		WaitUtility.waitElement(driver, clientSelect);
		page.clickonElement(clientSelect);
	}
	public void enterTheSubject(String sub)
	{
		page.enterText(subject, sub);
	}
	public void enterTheText(String message)
	{
		page.enterText(textMessage, message);
	}
	@SuppressWarnings("static-access")
	public void clickSendButton()
	{
		page.clickonElement(sendButton);
	}
	@SuppressWarnings("static-access")
	public void closeTheSendEmail()
	{
		page.clickonElement(close);
	}
	public void labelOfSendmail()
	{
		
	}
	
	

}
