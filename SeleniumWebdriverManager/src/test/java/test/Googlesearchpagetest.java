package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GooglesearchpageObjs;

public class Googlesearchpagetest 
{
  private static WebDriver driver = null;
 
	public static void main(String[] args) 
	{
		googlesearchTest();
	}
	
		public static void googlesearchTest()
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			GooglesearchpageObjs serchpage = new GooglesearchpageObjs(driver);
			driver.get("https://www.google.com/");
			serchpage.setTextInserchbox("software testing");
			serchpage.clicksearchbutton();
			driver.close(); 
		}
	
	}
