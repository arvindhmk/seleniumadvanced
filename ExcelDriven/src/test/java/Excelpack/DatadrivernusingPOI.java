package Excelpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatadrivernusingPOI 
{

	static List<String> uName = new ArrayList<String>();
	static List<String> pWord = new ArrayList<String>();
	
	public void readExcel() throws IOException
	{
		
		FileInputStream excel = new FileInputStream("C:\\Users\\user\\Documents\\Testdata.xlsx");
		
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(excel);
		
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowit= sheet.iterator();
		
		while(rowit.hasNext())
		{
			Row rowvalue = rowit.next();
			
			Iterator<Cell> columniterator = rowvalue.iterator();
			
			int i=2;
			while (columniterator.hasNext())
			{
				if(i%2==0)
				{
					uName.add(columniterator.next().getStringCellValue());
				}
				else
				{
					pWord.add(columniterator.next().getStringCellValue());
				}
				i++;
			}
			
		}
		
		
	}
		
	
	public void login(String Unam,String Pswd)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			String url = "https://opensource-demo.orangehrmlive.com/";
			driver.get(url);
			
			WebElement username = driver.findElement(By.id("txtUsername"));
			username.sendKeys(Unam);
			
			WebElement password = driver.findElement(By.id("txtPassword"));
			password.sendKeys(Pswd);
			
			WebElement loginbutton = driver.findElement(By.id("btnLogin"));
			loginbutton.click();
			
			driver.quit();
		}
	
	public void executetest()
	{
		for(int i=0;i<uName.size();i++)
		{
			login(uName.get(i),pWord.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		DatadrivernusingPOI dd = new DatadrivernusingPOI();
		dd.readExcel();
		System.out.println("username "+ uName);
		System.out.println("password "+ pWord);
		dd.executetest();
	}

}
