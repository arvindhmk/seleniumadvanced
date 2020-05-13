package readexceldatausingcolumnname;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getrowncolcount 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Testdata");
		int rownum = sheet.getLastRowNum()+1;
		System.out.println("Number of rows "+rownum);
		XSSFRow row= sheet.getRow(2);
		int colNum = row.getLastCellNum();
		System.out.println("Number of columns "+colNum);
		
		
	
	}

}
