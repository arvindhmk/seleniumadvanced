package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage 
{
	WebDriver driver;
	
	public Rediffloginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By go = By.xpath("//input[@name='proceed']");
	

	public WebElement emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement go()
	{
		return driver.findElement(go);
		
	}

}
