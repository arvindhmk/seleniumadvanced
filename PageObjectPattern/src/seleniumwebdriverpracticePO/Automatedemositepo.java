package seleniumwebdriverpracticePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automatedemositepo 
{

	//checkbox radiobutton text
	
	public static WebElement checkbox(WebDriver driver)
	{
		return driver.findElement(By.id("tricycle-checkbox"));
	}
	
	public static WebElement radiobutton(WebDriver driver)
	{
		return driver.findElement(By.id("self-help-radio-btn"));
	}
	
	public static WebElement text(WebDriver driver)
	{
		return driver.findElement(By.id("enterText"));
	}
}
