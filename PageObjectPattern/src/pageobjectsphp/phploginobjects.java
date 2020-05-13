package pageobjectsphp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phploginobjects 
{

	//username,password,submit
	WebDriver driver;
	
	public phploginobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@placeholder='Email']");
	By password=By.name("password");
	By submit=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	
			
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
}
