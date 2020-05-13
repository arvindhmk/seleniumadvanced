package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class standalone 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		File Excel = new File("C:\\Users\\user\\Documents\\POI2.xlsx");
		
		FileInputStream fis = new FileInputStream(Excel);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("userdetails");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = null;
		
		int colnum=-1;
		
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().equalsIgnoreCase("LASTNAME"))
			{
				colnum=i;
			}
		}
		
		row = sheet.getRow(1);
		cell=row.getCell(colnum);
		
		String lastname = cell.getStringCellValue();
		System.out.println(lastname);
		
		
		
	}

}
