package simpleexcelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class standaloneapp 
{	
	
	@Test
	public void readdata() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		
		String cellvalue = cell.getStringCellValue();
		
		System.out.println(cellvalue);
				
	}

}
