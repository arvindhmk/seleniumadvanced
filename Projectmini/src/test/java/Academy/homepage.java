package Academy;

import java.io.IOException;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.loginPage;
import resources.baseclass;

public class homepage extends baseclass 
{

	public static Logger log=LogManager.getLogger(homepage.class.getName());	
	@Test(dataProvider="getData", description="login test data")
	public void pageNavigation(String username, String password,String test) throws IOException
	{
		driver=initializedriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		landingpage l = new landingpage(driver);
		l.getLogin().click();
		loginPage lp = new loginPage(driver);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		//System.out.println(test);
		log.info(test);
		lp.clicksubmit().click();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different data types of test should run
		//column stands for how many values for each test
		
		Object[][] data = new Object[2][3]; 
		
		data[0][0]="restricted@gmail.com";
		data[0][1]="abcdefg";
		data[0][2]="restricted user";
		
		data[1][0]="nonrestricted@gmail.com";
		data[1][1]="efghij";
		data[1][2]="non restricted user";	
		
		return data;
	}
}
