package Utility;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest

{
	@BeforeSuite
	public void display1() throws IOException 
	{
		ExtentReport.setExtent();
	}
	
	@AfterSuite
	public void display2() 
	{
		ExtentReport.endReport();
	}

	public static WebDriver driver = null;
	public static WebDriverWait wait;
	
	@BeforeTest
	@Parameters("browserName")
	public void setBrowser(@Optional("chrome") String browserName) throws InterruptedException
	{
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Test on Chrome");
	    }
		else if(browserName.equals("Edge"))
		{
			//WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Test on Edge");
	    }
		else if(browserName.equals("Safari"))
		{
			//WebDriverManager.chromedriver().setup();
			driver = new SafariDriver();
			System.out.println("Test on Safari");
	    }
		else 
		{
			System.out.println("No browser configure");
		}
		driver.get(TestUtils.getPropertiesData("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}		
	
	
	public static void explicitWaitMethod(WebDriver driver, WebElement element)
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	
    @AfterTest
	public void close()
	{
		driver.quit();
	}
}
