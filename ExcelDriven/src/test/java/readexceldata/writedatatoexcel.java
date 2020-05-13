package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedatatoexcel {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\POI.xlsx");
		FileOutputStream fos = null;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFRow row = null;
		XSSFCell cell = null;
		
		
		int colnum = -1;
		row= sh.getRow(0);
		
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().contains("Result"))
			{
				colnum=i;
			}
		}
		row = sh.getRow(1);
		if(row==null)
		
			row=sh.createRow(1);
			
		cell= row.getCell(colnum);
		if(cell==null)
			cell=row.createCell(colnum);
		
		
		cell.setCellValue("PASS");
		
		
		fos= new FileOutputStream("C:\\Users\\user\\Documents\\POI.xlsx");
		wb.write(fos);
		fos.close();
		
		
		
	}

}
