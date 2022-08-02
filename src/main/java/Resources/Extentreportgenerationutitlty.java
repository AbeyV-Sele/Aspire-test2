package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportgenerationutitlty{
	static ExtentReports extent;

	public static ExtentReports getreport() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Reporter = new ExtentSparkReporter(path);
		Reporter.config().setReportName("Web automation Results");
		Reporter.config().setDocumentTitle("TestReports");
		extent = new ExtentReports();
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Tester", "Abey");
		return extent;
	}


}
