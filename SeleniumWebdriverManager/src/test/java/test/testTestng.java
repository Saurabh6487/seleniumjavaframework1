package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class testTestng {
	static WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest()
	public void setup() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("firefox"))

			System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test()
	public static void googlesearch() {

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("software testing");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
	}

	@AfterTest()
	public void teardown() {
		driver.close();
		System.out.println("Test is Sucessfully Completed");
	}
}
