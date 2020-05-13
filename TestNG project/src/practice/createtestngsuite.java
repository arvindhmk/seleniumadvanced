package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class createtestngsuite 
{
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;
//suite is a collections of tests
//Beforesuite and afterSuite run once before and after set of tests
	
@BeforeSuite
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
	driver = new ChromeDriver();
	starttime=System.currentTimeMillis();
	
}
	
@Test
public void opengoogle() 
{
	driver.get("https://www.google.com");
}
@Test
public void openyahoo()
{
	driver.get("https://www.yahoo.com");
}
@Test
public void openbing()
{
	driver.get("https://www.bing.com");
}
@AfterSuite
public void closebrowser()
{
	driver.quit();
	endtime=System.currentTimeMillis();
	
	totaltime=endtime-starttime;
	System.out.println(totaltime);
}

}
