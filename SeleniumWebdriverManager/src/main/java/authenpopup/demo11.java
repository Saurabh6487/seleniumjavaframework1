package authenpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo11 {

	public static void main(String[] args) 
	{
      WebDriverManager.firefoxdriver().setup();
      WebDriver driver =new FirefoxDriver();
      driver.get("https://www.google.com");
      driver.quit();
		
		
		
	}

}
