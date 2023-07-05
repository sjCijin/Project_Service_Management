package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	PageUtility page = new PageUtility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Logged In Successfully']")WebElement loginMessage;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle']")WebElement addIcon;
	@FindBy(xpath = "//span[@class='fa fa-user-plus icon']")WebElement addClient;
	@FindBy(xpath = "//h4[text()='Add Client']")WebElement addClientMsg;
	@FindBy(xpath = "//span[@class='fa fa-list-alt icon']")WebElement addReperation;
	@FindBy(xpath = "//h4[text()='Add Reparation']")WebElement addRepMsg;
	@FindBy(xpath = "//span[@class='fa fa-comment icon']")WebElement sendSms;
	@FindBy(xpath = "//h5[text()='Send SMS']")WebElement sendSMSMsg;
	@FindBy(xpath = "//span[@class='fa fa-paper-plane icon']")WebElement sendEmail;
	@FindBy(xpath = "//h5[text()='Send Email']")WebElement sendEmailMsg;
	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/ul/li[1]")WebElement QAlertsIcon;
	@FindBy(xpath = "/html/body/div[2]/div/header/nav/div/ul/li[1]/ul/li/a")WebElement QAlertsIconNum;
	@FindBy(xpath = "//*[@id=\"content-wrapper\"]/section[1]/h1")WebElement QAlertsMsg;
	

	@SuppressWarnings("static-access")
	public void verifyNavigatetoClientPage() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		WaitUtility.presenceOfElementLocated(driver, By.xpath("//span[@class='fa fa-user-plus icon']"));
		page.clickonElement(addClient);

	}
	public String clientPageMsg()
	{
		WaitUtility.waitElement(driver, addClientMsg);
		return page.getElementText(addClientMsg);
	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoAddReperation() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		WaitUtility.presenceOfElementLocated(driver, By.xpath("//span[@class='fa fa-list-alt icon']"));
		page.clickonElement(addReperation);

	}
	public String addReperationMsg()
	{
		WaitUtility.waitElement(driver, addRepMsg);
		return page.getElementText(addRepMsg);
	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoSendSms() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		WaitUtility.presenceOfElementLocated(driver, By.xpath("//span[@class='fa fa-comment icon']"));
		page.clickonElement(sendSms);

	}
	public String sendSmsMsg()
	{
		return page.getElementText(sendSMSMsg);
	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoSendEmail() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		WaitUtility.presenceOfElementLocated(driver, By.xpath("//span[@class='fa fa-paper-plane icon']"));
		page.clickonElement(sendEmail);

	}
	public String sendEmailMsg()
	{
		WaitUtility.waitElement(driver, sendEmailMsg);
		return page.getElementText(sendEmailMsg);
	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoQuantityAlert() throws IOException {
		WaitUtility.waitElement(driver, QAlertsIcon);
		page.clickonElement(QAlertsIcon);
		WaitUtility.presenceOfElementLocated(driver, By.xpath("/html/body/div[2]/div/header/nav/div/ul/li[1]/ul/li/a"));
		page.clickonElement(QAlertsIconNum);

	}
	public String quantityAlertMsg()
	{
		return page.getElementText(QAlertsMsg);
	}

}
