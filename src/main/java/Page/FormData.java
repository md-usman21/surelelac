package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Utility.BaseTest;
import Utility.ExtentReport;
import Utility.TestUtils;

public class FormData 
{
	public WebDriver driver=null;
	
	//mohammad usman
	//usman
	//info
	@FindBy(xpath = "//h2[text()='Contact information']")
	//h2[@id='primary-header']
	private WebElement scrollpage;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfield;
	
	@FindBy(xpath = "//input[@id='TextField1']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='TextField2']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement add;
	
	@FindBy(xpath = "//input[@id='TextField4']")
	private WebElement appartment;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath = "//select[@id='Select1']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement zip;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuetoshiping;
	
	@FindBy(xpath = "//div[@class='_2Xk7n']")
	private WebElement close;
	
	
	
	//Constructor
	public FormData(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements( this.driver,this);
	}
	
	//info methods
	public void scrollPage() 
	{	
		System.out.println("scrolled");
		BaseTest.explicitWaitMethod(driver,scrollpage );
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollpage);
	}
	
	public boolean emailfield() throws InterruptedException 
	{
		boolean result = false;
		try 
		{
			emailfield.click();
			TestUtils.log().info("click on email");
			emailfield.sendKeys(TestUtils.getPropertiesData("email"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on email");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on email");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean firstname() throws InterruptedException
	{
		boolean result = false;
		try 
		{
			firstname.click();
			TestUtils.log().info("click on first name");
			firstname.sendKeys(TestUtils.getPropertiesData("firstname"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on first name");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on first name");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean lastname() throws InterruptedException
	{
		boolean result = false;
		try
		{
			lastname.click();
			TestUtils.log().info("click on last name");
			lastname.sendKeys(TestUtils.getPropertiesData("lastname"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on last name");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on last name");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean add() 
	{
		boolean result = false;
		try 
		{
			add.click();
			TestUtils.log().info("click on add");
			add.sendKeys(TestUtils.getPropertiesData("address"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on add");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on add");
			//System.out.println(e);
			TestUtils.log().error(e);
			
		}
		return result;
	}
	
	public boolean appartment() 
	{
		boolean result = false;
		try 
		{
			appartment.click();
			TestUtils.log().info("click on appart");
			appartment.sendKeys(TestUtils.getPropertiesData("appartment"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on appart");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on appart");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean city() 
	{
		boolean result = false;
		try 
		{
			city.click();
			TestUtils.log().info("click on city");
			city.sendKeys(TestUtils.getPropertiesData("city"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on city");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on city");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean state() 
	{
		boolean result = false;
		try 
		{
			state.click();
			TestUtils.log().info("click on state");
			state.sendKeys(TestUtils.getPropertiesData("state"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on state");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on state");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean zip() 
	{
		boolean result = false;
		try 
		{
			zip.click();
			TestUtils.log().info("click on zip");
			zip.sendKeys(TestUtils.getPropertiesData("zip"));
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on zip");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on zip");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public boolean continuetoshiping() 
	{
		boolean result = false;
		try 
		{
			continuetoshiping.click();
			TestUtils.log().info("click on continue shiping button");
			Thread.sleep(3000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on continue shiping button");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on continue shiping button");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	public void closePopUp() 
	{
		try 
		{
			close.click();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}


