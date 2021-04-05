package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GooglesearchPage;
public class GooglesearchTest {
	private static WebDriver driver = null;

	public static void main(String[] args)
	{
     googlesearch();
     
	}

	public static void googlesearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("software testing");
		GooglesearchPage.textbox_search(driver).sendKeys("software testing");
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		GooglesearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test is Sucessfully Completed");
	}
}