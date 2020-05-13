package simpleexcelread;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Exceldatadriven.utilityclass;

public class readdata 
{

	utilityclass uc = null;
	String sheetname="sheet1";
	String filepath="C:/Users/user/Desktop/data.xlsx";
	
	
	@DataProvider(name="userdata")
	public Object[][] dataffortest() throws IOException
	{
		Object[][] data = testdata(filepath,sheetname);
		return data;
	}
	
	public Object[][] testdata(String filepath, String sheetname) throws IOException
	{
		
		Object[][] excelData = null;
		
		uc= new utilityclass(filepath);
		
		int rows = uc.getRowCount(sheetname);
		
		int col = uc.getColcount(sheetname);
		
		
		excelData = new Object[rows-1][col];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				excelData[i-1][j]=uc.getdata(sheetname, j, i);
			}
		}
		
		return excelData;
		
	}
	
	
	@Test(dataProvider="userdata")
	public void login(String uName, String psWrd)
	{
	
	      WebDriver driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        driver.manage().window().maximize();

	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        WebElement username = driver.findElement(By.id("txtUsername"));
	        username.sendKeys(uName);

	        WebElement password = driver.findElement(By.id("txtPassword"));
	        password.sendKeys(psWrd);

	        WebElement loginbutton = driver.findElement(By.id("btnLogin"));
	        loginbutton.click();

	        driver.close();
	    
	}
}
