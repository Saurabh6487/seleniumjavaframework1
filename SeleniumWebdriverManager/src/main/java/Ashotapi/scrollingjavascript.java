package Ashotapi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollingjavascript {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		//scroll by using pixles
		JavascriptExecutor js=(JavascriptExecutor)driver;

//		js.executeScript("window.scrollBy(0,1000)", "");
		//scroll till we find element
		//WebElement India=driver.findElement(By.xpath("//img[@src='flags-normal/flag-of-India.png']"));
		//js.executeScript("arguments[0].scrollIntoView();",India);
		//seroll till bottom

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}

}
