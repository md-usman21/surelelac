package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ListnerClass extends ExtentReport implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		
		test = extent.createTest(result.getMethod().getDescription());
	}
//
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}

	public void onTestFailure(ITestResult result) 
	{
		
			 TakesScreenshot scrShot = (TakesScreenshot) BaseTest.driver;

			 File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			 System.out.println(SrcFile);
			 SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
			 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			 String timeString = "./screenShot/"+formatter.format(timestamp) +"-scrshot-1.png";
			 File DestFile = new File(timeString);
			 System.out.println(DestFile);
			 try
			 {
			 FileUtils.copyFile(SrcFile, DestFile);
			 } 
			 catch (IOException e)
			 {
			 e.printStackTrace();
			 }
			 

		if (result.getStatus() == ITestResult.FAILURE) 
			{
			try 
			{
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenShot/"+formatter.format(timestamp) +"-scrshot-1.png");
			//test.log(Status.FAIL, (Markup) test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+result.getName()+" Failed"+".png"));
			} 
			catch (Exception e) 
			{
			e.printStackTrace();
			}
			}

		
	}

//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//	}

}
