package Ashotapi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoimg {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        WebElement logoimgElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img"));
		Screenshot logoimgscreenshot=new AShot().takeScreenshot(driver, logoimgElement);
		ImageIO.write(logoimgscreenshot.getImage(),"png",new File("C://seleniumpractice/logos/orang.png"));
		File f=new File("C://seleniumpractice/logos/orang.png");
		if(f.exists())
		{
			System.out.println("image is captured");
		}
		else
		{
			System.out.println("image not exist");
		}
		
		}

	}


