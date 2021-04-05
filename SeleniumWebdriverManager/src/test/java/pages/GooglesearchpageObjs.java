package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglesearchpageObjs {
	static WebDriver driver = null;
	static By textbox_search = By.name("q");
	By button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");

	public GooglesearchpageObjs(WebDriver driver)
	{
		this.driver = driver;
	}
	public static void setTextInserchbox(String text) {
		driver.findElement(textbox_search).sendKeys(text);

	}

	public void clicksearchbutton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
