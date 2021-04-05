package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportwithtestng {
	ExtentSparkReporter htmlreporter;
	ExtentReports extent;

	@BeforeSuite
	public void setup() {
		htmlreporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

	}

	@Test
	public void test1() {
		ExtentTest test1 = extent.createTest("Google Search Testone", "funcationality validation");
		test1.log(Status.INFO, "Starting Test Case");
		test1.info("test is completed");
		test1.fail("if fail");
		test1.addScreenCaptureFromPath("screenshot.png");


	}
	@Test
	public void test2() {
		ExtentTest test1 = extent.createTest("Google Search Testone", "funcationality validation");
		test1.log(Status.INFO, "Starting Test Case");
		test1.info("test is completed");
		test1.pass("if pass");
		test1.addScreenCaptureFromPath("screenshot.png");


	}


	@AfterSuite
	public void teardown() 
	{
		extent.flush();

	}

}
