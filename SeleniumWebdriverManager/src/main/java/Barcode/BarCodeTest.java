package Barcode;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BarCodeTest {
	@Test
	public void barcodetest() throws IOException, NotFoundException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://barcode.tec-it.com/en/Code128?data=ABC-abc-1234");
		String barcodeUrl = driver.findElement(By.tagName("img")).getAttribute("src");
//		System.out.println(barcodeUrl);
		URL url = new URL(barcodeUrl);
		BufferedImage bufferedimg=ImageIO.read(url);
		LuminanceSource luminancesource=new BufferedImageLuminanceSource(bufferedimg);
		BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminancesource));
		Result result=new MultiFormatReader().decode(binarybitmap);
		System.out.println(result.getText());
		
		
		
		
		
		

	}

}
