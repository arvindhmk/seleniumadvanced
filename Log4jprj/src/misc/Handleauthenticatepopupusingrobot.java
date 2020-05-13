package misc;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Handleauthenticatepopupusingrobot 
{

	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void authenticate() throws AWTException, InterruptedException, IOException
		{
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\handleauthenticatewindow.exe");
		Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\handleauthenticatewindow.exe");
		//driver.findElement(By.linkText("Basic Auth")).click();
		//Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\handleauthenticatewindow.exe");	
		
			
		}
	@AfterClass
	public void end()
	{
		//driver.close();
	}
}
