package demohrmtc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepository.objectrepositoryforhrm;

public class hrmlogintc 
{
	@Test
	public void login()
	{
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		PageFactory.initElements(driver, objectrepositoryforhrm.class);
		
		objectrepositoryforhrm.txtUsername.sendKeys("Admin");
		objectrepositoryforhrm.txtPassword.sendKeys("admin123");
		objectrepositoryforhrm.btnLogin.click();
		
		
//		WebElement username = driver.findElement(By.id("txtUsername"));
//		username.sendKeys("Admin");
//		
//		WebElement password = driver.findElement(By.id("txtPassword"));
//		password.sendKeys("admin123");
//		
//		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
//		loginbutton.click();
//		
		driver.quit();

		
	}
}
