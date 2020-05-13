package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffhomepage 
{

	WebDriver driver;
	
	public Rediffhomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	//Pagefoctory
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement searchbox;
	
	@FindBy(xpath="//form[@id='queryTop']//input[@class='newsrchbtn']")
	WebElement searchicon;
	
	
//	By home = By.xpath("//a[contains(text(),'Home')]");
//	By searchbox = By.xpath("//input[@id='srchword']");
//	By searchicon = By.xpath("//form[@id='queryTop']//input[@class='newsrchbtn']");

	public WebElement home()
	{
		return home;
		
	}
	public WebElement searchbox()
	{
		return searchbox;
		
	}
	public WebElement searchicon()
	{
		return searchicon;
		
	}
	
	
}
