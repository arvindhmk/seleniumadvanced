package seleniumwebdriverpracticeTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import seleniumwebdriverpracticePO.withoutpagefactoryPO;

public class withoutpagefactoryTC 
{

	@Test
	public void withoutpagefactory()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	withoutpagefactoryPO obj = new withoutpagefactoryPO(driver);
	obj.login("admin", "admin123");
	driver.close();
	
	}
	
}
