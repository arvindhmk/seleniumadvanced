package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider 
{
	
	WebDriver driver;

	public static Object[][] testdata(String excelpath, String sheetname) 
	{
	
		Excelutils excel = new Excelutils(excelpath, sheetname);
		int rowCount =Excelutils.getRowcount();
		int colCount = Excelutils.getColcount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData = excel.getcellDatastring(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}
		
		return data;
	}
	
	
	@DataProvider(name="testdata")
	public static Object[][] getData()
	{
	
		Object data[][] = testdata("C:\\Users\\user\\Desktop\\data.xlsx","sheet1");
		return data;
	}
	
	
	@Test(dataProvider="testdata")
	public void test1(String userName, String passWord )	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		username.sendKeys(userName);
		password.sendKeys(passWord);
		submit.click();

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		testdata("C:\\Users\\user\\Desktop\\data.xlsx","sheet1");
		
	}

}
