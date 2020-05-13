package excelusingdataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readexceldatausingcolumnname.excelread;

public class logintest 
{
	excelread ex;
	
	String xfilepath="C:\\Users\\user\\Documents\\POI.xlsx";
	String sheetname="Testdata";

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
	public void fillform(String Testcase,String Login,String Purchase,String AddProfile,String DeleteProfile,String Result)
	{
		System.out.println("Testcase:"+Testcase);
		System.out.println("Login:"+Login);
		System.out.println("Purchase:"+Purchase);
		System.out.println("Add Profile:"+AddProfile);
		System.out.println("Delete Profile:"+DeleteProfile);
		System.out.println("Result:"+Result);
		
		System.out.println("************************");
	}
	
	
}
