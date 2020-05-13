package loginTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Correctpassword 
{

	@Test
	@Parameters({"username","password"})
	public void loginwithCorrectPassword(String Uname, String Psword)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(Uname);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(Psword);
		
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		driver.quit();
	}
}
