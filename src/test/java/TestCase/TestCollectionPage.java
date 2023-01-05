package TestCase;



import org.testng.Assert;
import org.testng.annotations.Test;
import Page.CollectionPage;
import Page.FormData;
import Utility.BaseTest;


public class TestCollectionPage extends BaseTest
{
    @Test(description="Test_CollectionPage")
	public void abc() throws InterruptedException
	{
		CollectionPage cp = new CollectionPage(driver);
		FormData fd = new FormData(driver);
		
		cp.closePopUp2();
		boolean checkclickproduct = cp.clickproduct();
		Assert.assertEquals(checkclickproduct, true,"failed to click on checkclickproduct");
		//ExtentReport.test.log(Status.PASS,"clickproduct")
		
		boolean checkclickxlbtn = cp.clickxlbtn();
		Assert.assertEquals(checkclickxlbtn, true,"failed to click on checkclickxlbtn");
		
		cp.scrollSize();
		
		boolean checkclickaddcrbtn = cp.clickaddcrtbtn();
		Assert.assertEquals(checkclickaddcrbtn, true,"failed to click on checkclickaddcrbtn");
		
		boolean clickviewmycrt = cp.viewmycrt();
		Assert.assertEquals(clickviewmycrt, true,"failed to click on clickviewmycrt");
		
		cp.scrlsize();
		
		boolean clickcheckoutbtn = cp.checkoutbtn();
		Assert.assertEquals(clickcheckoutbtn, true,"failed to click on clickcheckoutbtn");
		
		
		
		//info
		fd.closePopUp();
		fd.scrollPage();
		
		
		fd.closePopUp();
		boolean checkemail = fd.emailfield();
		Assert.assertEquals(checkemail, true,"failed to click on checkemail");
		
		fd.closePopUp();
		boolean checkfirstname = fd.firstname();
		Assert.assertEquals(checkfirstname, true,"failed to click on checkfirstname");
		
		fd.closePopUp();
		boolean checklastname = fd.lastname();
		Assert.assertEquals(checklastname, true,"failed to click on checklastname");
		
		
		fd.closePopUp();
		boolean checkadd = fd.add();
		Assert.assertEquals(checkadd, true,"failed to click on checkadd");
		
		fd.closePopUp();
		boolean checkappartment = fd.appartment();
		Assert.assertEquals(checkappartment, true,"failed to click on checkappartment");
		
		fd.closePopUp();
		boolean checkcity = fd.city();
		Assert.assertEquals(checkcity, true,"failed to click on checkcity");
		
//		fd.closePopUp();
//		boolean checkstate = fd.state();
//		Assert.assertEquals(checkstate, true,"failed to click on checkstate");
		
		fd.closePopUp();
		boolean checkzip = fd.zip();
		Assert.assertEquals(checkzip, true,"failed to click on checkzip");
		
		fd.closePopUp();
		boolean checkcontiship = fd.continuetoshiping();
		Assert.assertEquals(checkcontiship, true,"failed to click on checkcontiship");
		
	
	}
	
	
}
