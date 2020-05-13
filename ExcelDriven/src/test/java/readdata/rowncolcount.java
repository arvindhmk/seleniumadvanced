package readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class rowncolcount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\POI.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Testdata");
			int rownum = sheet.getLastRowNum()+1;
			System.out.println("Last row number "+rownum);
			
			XSSFRow row = sheet.getRow(0);
			int colnum = row.getLastCellNum();
			System.out.println("Last column number "+colnum);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
