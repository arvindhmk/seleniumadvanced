package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage 
{

	public WebDriver driver;
	
	private By signin= By.cssSelector("a[href*='sign_in']");
	private By navibar=By.cssSelector("ul.nav.navbar-nav.navbar-right");
	private By title = By.xpath("//div[@class='text-center']/h2");

		public landingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getNavigationbar()
	{
		return driver.findElement(navibar);
	}
	
	public WebElement verifytitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
}
