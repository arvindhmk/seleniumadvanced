package Exceldatadriven;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelread 
{

	utilityclass ut = null;

	String excelpath="C:\\Users\\user\\Desktop\\data.xlsx";
	String sheetname="Sheet1";
	
	@Test(dataProvider="readdata")
	public void filldata(String userName,String passWord)
	{
		System.out.println("Usernamr:"+ userName);
		System.out.println("Usernamr:"+ passWord);
		
		System.out.println("************************");
	}
	
	
	
	@DataProvider
	public Object[][] readdata() throws IOException
	{
		Object[][] data = exceldata(excelpath,sheetname);
		return data;		
	}
	
	public Object[][] exceldata(String excelpath, String sheetname) throws IOException
	{
		Object[][] data=null;
		ut = new utilityclass(excelpath);
		
		int rows = ut.getRowCount(sheetname);
		int col = ut.getColcount(sheetname);
		
		data = new Object[rows-1][col];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i-1][j]=ut.getdata(sheetname,j, i);
			}
		}
		
		return data;
		
	}
	
}
