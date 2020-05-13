package seleniumwebdriverpracticeTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumwebdriverpracticePO.usingPageFactoryPO;

public class usingpagefactoryTC 
{

	@Test
	public void usingpagefactory()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, usingPageFactoryPO.class);
		
		Assert.assertFalse(usingPageFactoryPO.checkbox.isEnabled());
		
		usingPageFactoryPO.radiobutton.click();
		boolean status = usingPageFactoryPO.radiobutton.isSelected();
		System.out.println(status);
		
		
		usingPageFactoryPO.text.sendKeys("POM");
		
		driver.close();
		
	}
}
