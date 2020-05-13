package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatabycolumnname 
{

		// TODO Auto-generated method stub
		
		public List<String> readData() throws Exception
		{

			ArrayList<String> s=new ArrayList<String>();
			
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\POI.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Testdata");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int colNum = -1;
		
		for(int i=0; i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Login"))
				
			{
				colNum=i;
				break;
			}
		}
		
//		Iterator<Row> rows = sheet.iterator();
//		while(rows.hasNext())
//		{
//			Row r = rows.next();
//			cell=row.getCell(colNum);	
//		}
//		
		
		for(int j=1;j<=sheet.getLastRowNum();j++)
		{
		row=sheet.getRow(j);
		cell=row.getCell(colNum);
		s.add(cell.getStringCellValue());
		System.out.println("The value from excel sheet:"+s.get(0));
		
		}
		//System.out.println(sheet.getLastRowNum());
		return s;
		
		//String password = cell.getStringCellValue();
		//System.out.println("The value from excel sheet:"+password);
	}

public static void main(String[] args) 
{
	

}
}
