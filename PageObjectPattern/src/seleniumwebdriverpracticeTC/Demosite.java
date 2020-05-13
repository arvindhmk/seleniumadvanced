package seleniumwebdriverpracticeTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumwebdriverpracticePO.Automatedemositepo;

public class Demosite 
{
	@Test
	public void Automatedemosite()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		// verify the checkbox is disabled
		
		//WebElement checkbox =  driver.findElement(By.id("tricycle-checkbox"));
		
		
		
		boolean status = Automatedemositepo.checkbox(driver).isEnabled();
		System.out.println(status);
		Assert.assertFalse(status);
		
		//select radiobutton
		
		//WebElement radio = driver.findElement(By.id("self-help-radio-btn"));
		//radio.click();
		WebElement radio = Automatedemositepo.radiobutton(driver);
		radio.click();
		Assert.assertTrue(radio.isSelected());
		
		//Writing text
		
		//WebElement msg = driver.findElement(By.id("enterText"));
		
		Automatedemositepo.text(driver).sendKeys("POM");
		//msg.sendKeys("POM");
		
		driver.close();
	}
	
}
