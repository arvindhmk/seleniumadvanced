package pageobjectsphp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class phpregisterobjects 
{

	//firstname,lastname,email,password,confirmpassword,signup

@FindBy(xpath="//input[@placeholder='First Name']")
public static WebElement firstname;	
@FindBy(xpath="//input[@placeholder='Last Name']")
public static WebElement lastname;
@FindBy(xpath="//input[@placeholder='Email']")
public static WebElement email;
@FindBy(xpath="//input[@placeholder='Password']")
public static WebElement password;
@FindBy(xpath="//input[@placeholder='Confirm Password']")
public static WebElement confirmpassword;
@FindBy(xpath="//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")
public static WebElement signup;
	
	
	
	
	
//public static WebElement firstname(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//}
//	
//public static WebElement lastname(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//}
//
//public static WebElement email(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//input[@placeholder='Email']"));
//}
//
//public static WebElement password(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//input[@placeholder='Password']"));
//}
//
//public static WebElement confirmpassword(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
//}
//public static WebElement signup(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']"));
//}

}
