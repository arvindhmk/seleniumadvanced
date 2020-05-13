package testcaseforphp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageobjectsphp.phploginobjects;

public class phplogin 
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");
		
//		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email']"));
//		username.sendKeys("user@phptravels.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//		password.sendKeys("demouser");
//		
//		WebElement submit =driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']"));
//		submit.click();
//		
//		driver.close();
		
		phploginobjects plog = new phploginobjects(driver);
		plog.username().sendKeys("user@phptravels.com");
		plog.password().sendKeys("demouser");
		plog.submit().click();
		driver.close();
		
		
		
		
		
	}
}
