package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListnersDemo 
{
	
	@Test
	public void test1()
	{
		System.out.println("Iam inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Iam inside test2");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("software testing");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		driver.close();
		
		}
	@Test
	public void test3()
	{
		System.out.println("Iam inside test3");
		throw new SkipException("This test is Skipped");
		
	}

	
}
