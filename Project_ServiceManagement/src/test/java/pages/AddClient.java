package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.PageUtility;




public class AddClient {
	
	public WebDriver driver;
	PageUtility page=new PageUtility();
	public AddClient(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='validate form-control' and @type='text'])[3]")WebElement  clientNameField;
	@FindBy(xpath="//input[@name='company']")WebElement  companyField;
	@FindBy(xpath="//input[@id='autocomplete']")WebElement  geoLocateField;
	@FindBy(xpath="//input[@name='address']")WebElement  adressField;
	@FindBy(xpath="//input[@id='locality']")WebElement  cityField;
	@FindBy(xpath="//input[@id='postal_code']")WebElement  postalCodeField;
	@FindBy(xpath="//input[@id='telephone']")WebElement  telephoneCodeField;
	@FindBy(xpath="//input[@id='email1']")WebElement  emailField;
	@FindBy(xpath="//input[@id='vat1']")WebElement  vatField;
	@FindBy(xpath="//input[@id='cf1']")WebElement  snnfield;
	
	
	public static void enterTheClientfield(String name) throws IOException
	{
		
		String clientname=ExcelUtility.getString(1, 4, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
		
		
	}
	public static void verifyCompanyfield()
	{
		//String companyname=ExcelUtility.getString(1, 5, System.getProperty("user.dir") + constance.Constance.TESTDATAFILE, "my");
	//	PageUtility.enterText(companyField, companyname);
	}
	
	

	
	
	
	
	
}
