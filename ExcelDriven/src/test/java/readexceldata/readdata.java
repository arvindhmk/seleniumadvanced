package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\POI.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet =  wbook.getSheet("Testdata");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell= row.getCell(2);
		
		
		int value= (int)cell.getNumericCellValue();
		
		System.out.println(value);
		
		
		
		
		
	}

}
