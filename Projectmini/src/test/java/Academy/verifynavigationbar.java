package Academy;

import java.io.IOException;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.loginPage;
import resources.baseclass;

public class verifynavigationbar extends baseclass 
{
	public static Logger log=LogManager.getLogger(verifynavigationbar.class.getName());
	@BeforeTest
	public void invoke() throws IOException
	{
		driver=initializedriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void verifynavigation() throws IOException
	{
		landingpage l = new landingpage(driver);
		Boolean navibar = l.getNavigationbar().isDisplayed();
		log.info("Navifation bar is displayed");
		
	Assert.assertTrue(navibar);

	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
}
