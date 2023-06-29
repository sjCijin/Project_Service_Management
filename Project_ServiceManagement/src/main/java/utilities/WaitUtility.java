package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long IMPLICIT_WAIT=20;
	public static final long PAGE_LOAD_WAIT=20;
	public static final long EXPLICIT_WAIT=60;
	
	//visibility of element
	
	public static void  waitElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//element to be clickable
	public static void  waitForElementClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
//	presenceOfElementLocated
	  public static void waitForPresentsofElements(WebDriver driver,By locator)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	  }
	
//	alertIsPresent
	  public static void alertIsPresent(WebDriver driver,WebElement element)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.alertIsPresent());
	  }
//	elementToBeSelected  
	  public static void elementToBeSelected(WebDriver driver,WebElement element)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.elementToBeSelected(element) );
	  }
//	frameToBeAvailableAndSwitchToIt
	  public static void frameToBeAvailableAndSwitchToIt(WebDriver driver,WebElement element)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element) );
	  }
//	invisibilityOfElementLocated
	  public static void invisibilityOfElementLocated(WebDriver driver,By locator)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(locator) );
	  }
//		presenceOfAllElementsLocatedBy
	  public static void presenceOfElementLocated(WebDriver driver,By element)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element ));
	  }

//	textToBePresentInElementLocated
	  public static void textToBePresentInElementLocated(WebDriver driver,By locator,String text)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text) );
	  }
//	attributeToBe
	  public static void attributeToBe(WebDriver driver,WebElement element,String attribute,String text)
	  {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		  wait.until(ExpectedConditions.attributeToBe(element, attribute, text) );
	  }
	
	

}
