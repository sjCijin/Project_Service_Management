package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AddReperation {
	public WebDriver driver;
	PageUtility page=new PageUtility();

	public AddReperation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//*[@id=\"imei\"]")WebElement imei;
	@FindBy(xpath = "//*[@id=\"select2-client_name-container\"]")WebElement clientDropdwn;
	@FindBy(xpath = "/html/body/span[2]/span/span[1]/input")WebElement client;
	
	@FindBy(xpath = "//*[@id=\"category\"]")WebElement category;
	@FindBy(xpath = "/html/body/span[2]/span/span[1]")WebElement assinedtoDropdwn;
	@FindBy(xpath = "/html/body/span[2]/span/span[1]/input")WebElement assinedto;
	
	@FindBy(xpath = "//*[@id=\"reparation_manufacturer\"]")WebElement manufacturer;
	@FindBy(xpath = "//*[@id=\"reparation_model\"]")WebElement model;
	@FindBy(xpath = "//*[@id=\"defect\"]")WebElement defect;
	
	@FindBy(xpath = "//*[@id=\"select2-error_code-container\"]")WebElement errorCode;
	@FindBy(xpath = "//*[@id=\"service_charges\"]")WebElement serviceCharges;
	@FindBy(xpath = "//*[@id=\"expected_close_date\"]")WebElement expectedCloseDate;
	
	@FindBy(xpath = "//*[@id=\"date_of_purchase\"]")WebElement dateOfPurchase;
	@FindBy(xpath = "//*[@id=\"select2-has_warranty-container\"]/span")WebElement haswarrantyDropdown;
	@FindBy(xpath = "/html/body/span[2]/span/span[1]/input")WebElement haswarranty;
	@FindBy(xpath = "//*[@id=\"select2-warranty-container\"]/span")WebElement warrantyDropdown;
	@FindBy(xpath = "//*[@id=\"select2-warranty-container\"]/span")WebElement warranty;
	@FindBy(xpath = "//*[@id=\"warranty_card_number\"]")WebElement warrantyCardNumber;
	@FindBy(xpath = "//*[@id=\"repair_type\"]")WebElement repairType;
	@FindBy(xpath = "//*[@id=\"client_date\"]")WebElement clientDate;
	@FindBy(xpath = "//*[@id=\"rpair_form\"]/div[2]/div/div[2]/div[1]/span/span[1]/span")WebElement taxRateDropdown;
	@FindBy(xpath = "(//*[@class=\"select2-search__field\"])[2]")WebElement taxRate;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
