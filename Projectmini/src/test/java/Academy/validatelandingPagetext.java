package Academy;

import java.io.IOException;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import resources.baseclass;
//Adding logs
//Generating html reports
//Screenshots on failure
//Jenkins Integration

public class validatelandingPagetext extends baseclass
{
	public static Logger log=LogManager.getLogger(validatelandingPagetext.class.getName());
	@BeforeTest
	public void invoke() throws IOException
	{
		driver=initializedriver();
		log.info("Driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
	}
	
	@Test
	public void validatetext() throws IOException 
	{
		
		landingpage lp=new landingpage(driver);
		String centertext  = lp.verifytitle().getText();
		 
		
		Assert.assertEquals("FEATURED COURSE", centertext);
		log.info("Successfully validated Text message");
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	}
	
	
	
}
