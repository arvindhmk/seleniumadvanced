package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage 
{
	WebDriver driver;
	
	By email = By.cssSelector("input#user_email");
	By passowrd = By.cssSelector("input[id='user_password']");
	By submit = By.cssSelector("input[type='submit']");
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(passowrd);
	}
	public WebElement clicksubmit()
	{
		return driver.findElement(submit);
	}	
	
}
