package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class Client {
	public WebDriver driver;
	PageUtility page=new PageUtility();
	public Client(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/section/div[1]/div[2]/div/a")WebElement moreInfo;
	@FindBy(xpath="//*[@id=\"dynamic-table_filter\"]/label/input")WebElement searchField;
	@FindBy(xpath="//tr[@role='row']")List<WebElement> clientList;
	@FindBy(xpath="//*[@id=\"dynamic-table_length\"]/label/select")WebElement showAllDropDown;
	@FindBy(xpath="//button[@class='btn btn-default btn-xs btn-primary dropdown-toggle']")List<WebElement>searchClientlist;
	@FindBy(xpath="//*[@id=\"view_image\"]")WebElement viewImage;
//	@FindBy(xpath="")WebElement a;
//	@FindBy(xpath="")WebElement a;
//	@FindBy(xpath="")WebElement a;
//	@FindBy(xpath="")WebElement a;
	

}
