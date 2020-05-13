package excelusingdataproviders;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readexceldatausingcolumnname.excelread;


public class readdatforselenium 
{
	excelread ex;

	String xfilepath="C:\\Users\\user\\Documents\\POI2.xlsx";
	String sheetname="userdetails";
	WebDriver driver=null;

	@BeforeClass
		public void init()
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		driver = new FirefoxDriver();
		String str = "http://demo.automationtesting.in/Register.html";
		driver.get(str);
		}
	

	public Object[][] testData(String xfilepath,String sheetname) throws IOException
	{
		
		Object[][] excelData=null;
		ex = new excelread(xfilepath);
		int rows = ex.getRowcount(sheetname);
		int col = ex.getColumncount(sheetname);
		
		excelData = new Object[rows-1][col];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				excelData[i-1][j]=ex.getCellData(sheetname, j, i);
			}
		}
		
		return excelData;			
	}
	
	@DataProvider(name="userdata")
	public Object[][] userform() throws IOException
	{
		Object[][] data = testData(xfilepath,sheetname);
		return data;
	}
	
	@Test(dataProvider="userdata")
	public void fillform(String firstName,String lastName,String email,String phone) throws InterruptedException
	{

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys(email);;
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys(phone);;
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("************************");
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
}

