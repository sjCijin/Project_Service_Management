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

	@FindBy(xpath = "//p[text()='Logged In Successfully']")
	WebElement loginMessage;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle']")
	WebElement addIcon;
	@FindBy(xpath = "//span[@class='fa fa-user-plus icon']")
	WebElement addClient;
	@FindBy(xpath = "//h4[text()='Add Client']")
	WebElement message;
	@FindBy(xpath = "//span[@class='fa fa-list-alt icon']")
	WebElement addReperation;
	@FindBy(xpath = "//h4[text()='Add Reparation']")
	WebElement addRepMsg;
	@FindBy(xpath = "//span[@class='fa fa-comment icon']")
	WebElement sendSms;
	@FindBy(xpath = "//h5[text()='Send SMS']")
	WebElement sendSMSMsg;
	@FindBy(xpath = "//span[@class='fa fa-paper-plane icon']")
	WebElement sendEmail;
	@FindBy(xpath = "//h5[text()='Send Email']")
	WebElement sendEmailMsg;
	@FindBy(xpath = "//i[@class='fa fa-exclamation-triangle']")
	WebElement QAlertsIcon;
	@FindBy(xpath = "//span[@class='label label-danger pull-right']")
	WebElement QAlertsIconNum;

	@SuppressWarnings("static-access")
	public void verifyNavigatetoClientPage() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		page.clickonElement(addClient);

	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoAddReperation() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		page.clickonElement(addReperation);

	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoSendSms() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		page.clickonElement(sendSms);

	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoSendEmail() throws IOException {
		WaitUtility.waitElement(driver, addIcon);
		page.clickonElement(addIcon);
		page.clickonElement(sendEmail);

	}

	@SuppressWarnings("static-access")
	public void verifyNavigatetoQuantityAlert() throws IOException {
		WaitUtility.waitElement(driver, QAlertsIcon);
		page.clickonElement(QAlertsIcon);
		page.clickonElement(QAlertsIconNum);

	}

}
