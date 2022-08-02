package Resources;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

public class Listeners extends Base_class implements ITestListener{

	ExtentTest test;
	ExtentReports Reports = Extentreportgenerationutitlty.getreport();
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		test = Reports.createTest(result.getMethod().getMethodName());
		extenttest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extenttest.get().log(Status.PASS, "Test Passed");
		WebDriver driver = null;
		try {
		driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		String Testcasename = result.getMethod().getMethodName();
		try {
		extenttest.get().addScreenCaptureFromPath("."+getscreenshot(Testcasename, driver),Testcasename)	;
		}catch(Exception e) {
			}
		}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		extenttest.get().fail(result.getThrowable());
		WebDriver driver = null;
		try {
		driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e)
		{
			
		}
		String Testcasename = result.getMethod().getMethodName();
		try {
		extenttest.get().addScreenCaptureFromPath("."+getscreenshot(Testcasename, driver),Testcasename)	;
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	}

