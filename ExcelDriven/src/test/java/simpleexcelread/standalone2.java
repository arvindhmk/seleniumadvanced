package simpleexcelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class standalone2 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:/Users/user/Desktop/data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = null;
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = row.getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(colcount);
		
		int colnum = -1;
		
		for(int i=0;i<rowcount;i++)
		{
			if(row.getCell(i).getStringCellValue().equalsIgnoreCase("password"))
			{
				colnum=i;
				break;
			}
		}
		
		
		row = sheet.getRow(rowcount-1);
		cell = row.getCell(colnum);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
				
	}

}
