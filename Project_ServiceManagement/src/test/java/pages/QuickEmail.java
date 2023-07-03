package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class QuickEmail {
	public WebDriver driver;
	PageUtility page=new PageUtility();
	
	public QuickEmail(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"emailto_\"]")WebElement mailTo;
	@FindBy(xpath="//*[@id=\"subject_\"]")WebElement subject;
	@FindBy(xpath="//*[@id=\"body_\"]")WebElement textfield;
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/section/div[2]/section[2]/div[2]/div[3]/button")WebElement sendButton;
	//@FindBy(xpath="")WebElement a;
	public void senToField(String mail_to)
	{
		page.enterText(mailTo, mail_to);		
	}
	public void subjectField(String sub)
	{
		page.enterText(subject, sub);
	}
	public void mailField(String mail)
	{
		page.enterText(textfield, mail);
	}
	@SuppressWarnings("static-access")
	public void sendButton()
	{
		page.clickonElement(sendButton);
	}	
}
