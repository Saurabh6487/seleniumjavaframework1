package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportsbasicdemo {
	static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		ExtentTest test1 = extent.createTest("Google Search Testone", "funcationality validation");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test1.pass("navigate to google");
		driver.findElement(By.name("q")).sendKeys("software testing");
		test1.pass("Enter Text in search Box");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test1.pass("Enter keyboard");
		driver.close();
		test1.pass("closed the browser");
		test1.info("test is completed");
		extent.flush();

	}

}
