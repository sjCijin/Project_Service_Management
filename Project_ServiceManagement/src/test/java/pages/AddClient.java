package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.PageUtility;
import utilities.WaitUtility;




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
	@FindBy(xpath="//input[@id='cf1']")WebElement  snnField;
	@FindBy(xpath="//*[@id=\"comment1\"]")WebElement  commentField;
	
	
	public void clientField(String clientname)
	{
		WaitUtility.waitElement(driver, clientNameField);
		page.enterText(clientNameField, clientname);
			
	}
	public void companyField(String companyname)
	{
		WaitUtility.waitElement(driver, companyField);
		page.enterText(companyField, companyname);
		
	}
	public void geoLocate(String geoLocate) 
	{
		WaitUtility.waitElement(driver, geoLocateField);
		page.enterText(geoLocateField, geoLocate);
		
	}
	public void address(String address)
	{
		WaitUtility.waitElement(driver, adressField);
		page.enterText(adressField, address);
		
	}
	public void city(String city)
	{
		WaitUtility.waitElement(driver, cityField);
		page.enterText(cityField, city);
		
	}
	public void postalCode(String postalCode)
	{
		WaitUtility.waitElement(driver, postalCodeField);
		page.enterText(postalCodeField, postalCode);
		
	}
	public void telephone(String telephone)
	{
		WaitUtility.waitElement(driver, telephoneCodeField);
		page.enterText(telephoneCodeField, telephone);
		
	}
	public void email(String email)
	{
		WaitUtility.waitElement(driver, emailField);
		page.enterText(emailField, email);
		
	}
	public void vat(String vat)
	{
		WaitUtility.waitElement(driver, vatField);
		page.enterText(vatField, vat);
		
	}
	public void ssn(String ssn)
	{
		WaitUtility.waitElement(driver, snnField);
		page.enterText(snnField, ssn);
		
	}
	public void comment(String comment)
	{
		WaitUtility.waitElement(driver, commentField);
		page.enterText(commentField, comment);
		
	
}
}
