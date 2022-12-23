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

public class CollectionPage 
{
	WebDriver driver;
//	final change
	
	//first product
	@FindBy(xpath = "//a[@href='/products/101-t-shirt']")
	private WebElement firstproduct;
	
	@FindBy(xpath = "//label[@for='swatch-detail-43150060585134-1-XL']")
	private WebElement xlbtn;
	
	@FindBy(xpath = "//label[text()='Size']")
	private WebElement scrollSize;
	
	@FindBy(xpath = "//button[@name='add']")
	private WebElement addcrt;
	
	@FindBy(xpath = "//a[@id='cart-notification-button']")
	private WebElement viewmycrt;
	
	@FindBy(xpath = "//a[@class='cart-item__name h4 break']")
	private WebElement scrlsize;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkoutbtn;
	
	@FindBy(xpath = "//button[@tabindex=\"0\"]")
	private WebElement closep;
	


	
	//Constructor
	public CollectionPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public boolean clickproduct()
	{
		boolean result = false;
		try 
		{
			BaseTest.explicitWaitMethod(driver, firstproduct);
			firstproduct.click();
			TestUtils.log().info("click on first product");
			result = true;
			ExtentReport.test.log(Status.PASS,"click on first product");
			
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on first product");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	
	public boolean clickxlbtn()
	{
		boolean result = false;
		try
		{
			BaseTest.explicitWaitMethod(driver, xlbtn);
			xlbtn.click();
			TestUtils.log().info("click on xl btn");
			result = true;
			ExtentReport.test.log(Status.PASS,"click on xl btn");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on xl btn");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	
	public void scrollSize() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollSize);
		BaseTest.explicitWaitMethod(driver,scrollSize );
	}
	
	
	public boolean clickaddcrtbtn() throws InterruptedException
	{
		boolean result = false;
		try 
		{
			BaseTest.explicitWaitMethod(driver, addcrt);
			addcrt.click();
			TestUtils.log().info("click on add to crt btn");
			Thread.sleep(4000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on add to crt btn");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on add to cart btn");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
	}
	
	
	public boolean viewmycrt() throws InterruptedException
	{
		boolean result = false;
		try
		{
			BaseTest.explicitWaitMethod(driver, viewmycrt);
			viewmycrt.click();
			TestUtils.log().info("click on view my cart btn");
			Thread.sleep(2000);
			result = true;
			ExtentReport.test.log(Status.PASS,"click on view my cart btn");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on view my cart btn");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
    }
	
	public void scrlsize() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrlsize);
		BaseTest.explicitWaitMethod(driver,scrlsize );
	}
	
	public boolean checkoutbtn()
	{
		boolean result = false;
		try 
		{
			BaseTest.explicitWaitMethod(driver, checkoutbtn);
			checkoutbtn.click();
			TestUtils.log().info("click on checkout btn");
			result = true;
			ExtentReport.test.log(Status.PASS,"click on checkout btn");
		}
		catch(Exception e)
		{
			ExtentReport.test.log(Status.FAIL,"faild to click on checkout btn");
			//System.out.println(e);
			TestUtils.log().error(e);
		}
		return result;
		}
		
		public void closePopUp2() 
		{ 
			
			try 
			{
				closep.click();
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}




