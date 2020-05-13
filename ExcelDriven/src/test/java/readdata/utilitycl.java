package readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utilitycl 
{

	XSSFWorkbook workbook=null;
	XSSFSheet sheet=null;
	XSSFRow row=null;
	XSSFCell cell=null;
	String path;
	String cellval;

	
	public utilitycl(String path)
	{
		try 
		{
		this.path=path;
		FileInputStream fis = new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		fis.close();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	
	public String getcelldata(String sheetname, int rownum, String colname)
	{
		try 
		{
		int colnum = -1;
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colname)) 
			{
				colnum=i;
			}
		}
		
		row=sheet.getRow(rownum-1);
		cell = row.getCell(colnum);
		
		if(cell.getCellType()== CellType.STRING)
		{
			cellval = cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA )
		{
			cellval = String.valueOf(cell.getStringCellValue());
		}
		
		//String cellValue = cell.getStringCellValue();
		return cellval;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "data not found";
		}
		
		
		
	}
	
}
