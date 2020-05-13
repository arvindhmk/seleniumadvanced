package testcaseforphp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectsphp.phpregisterobjects;

public class phpregister
{
	@Test
	public void register()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.phptravels.net/register");
		
//		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		firstname.sendKeys("tes111");
//		
//		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		lastname.sendKeys("test123");
//		
//		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
//		email.sendKeys("test#gmail.com");
//		
//		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//		password.sendKeys("abc123");
//		
//		WebElement confirmpassword=driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
//		confirmpassword.sendKeys("abc123");
//		
//		WebElement signup = driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']"));
//		signup.click();

		PageFactory.initElements(driver, phpregisterobjects.class);
		phpregisterobjects.firstname.sendKeys("tes111");
		phpregisterobjects.lastname.sendKeys("test123");
		phpregisterobjects.email.sendKeys("test#gmail.com");
		phpregisterobjects.password.sendKeys("abc123");
		phpregisterobjects.signup.click();
		
		
//	phpregisterobjects.firstname(driver).sendKeys("tes111");
//	phpregisterobjects.lastname(driver).sendKeys("test123");
//	phpregisterobjects.email(driver).sendKeys("test#gmail.com");
//	phpregisterobjects.password(driver).sendKeys("abc123");
//	phpregisterobjects.signup(driver).click();
	
	driver.close();
	}
}
