import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTest 
{ 
	WebDriver driver;
	@BeforeMethod
	public void setup()
  { 
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.phantomjs().setup();
		//WebDriverManager.iedriver().setup();
		//WebDriverManager.chromiumdriver().setup();
		WebDriverManager.firefoxdriver().setup();	
		driver=new FirefoxDriver();
  }
	
	@Test
	public void googletest()
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
