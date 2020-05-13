package seleniumwebdriverpracticePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class withoutpagefactoryPO 
{
	WebDriver driver;

	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	
	public withoutpagefactoryPO(WebDriver driver)
	{
		this.driver=driver;
	}
		
	
	public void login(String usname, String pswd )
	{
	
		driver.findElement(username).sendKeys(usname);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(login).click();
	}
	
}
