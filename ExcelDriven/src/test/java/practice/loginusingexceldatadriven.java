package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class loginusingexceldatadriven 
{

	WebDriver driver =null;
	@BeforeMethod
	public void login()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dataProvider="testdata")
	public void values(String userName, String passWord)
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		username.sendKeys(userName);
		password.sendKeys(passWord);
		submit.click();
	}

	public static void main(String[] args)
	{
		ExcelDataprovider ex = new ExcelDataprovider();
		
	}
}
