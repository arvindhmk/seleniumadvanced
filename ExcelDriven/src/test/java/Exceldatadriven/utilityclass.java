package Exceldatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class utilityclass 
{

	public FileInputStream fis = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String excelpath;
	
	
	public utilityclass(String excelpath) throws IOException 
	{
	
		this.excelpath=excelpath;
		fis = new FileInputStream(excelpath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	
	public String getdata(String sheetname, int col_num, int rowNum)
	{
		String cellvalue="";
		//int colnum = -1;
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(0);
		
//		for(int i=0;i<sheet.getLastRowNum();i++)
//		{
//			if(row.getCell(i).getStringCellValue().trim().equals(col_num.trim()))
//					{
//						colnum=i;
//					}
//		}
//		
		row= sheet.getRow(rowNum);
		cell = row.getCell(col_num);
		
		
		if(cell.getCellType()==CellType.STRING) 
		{
			cellvalue = cell.getStringCellValue();
		} 
		else if (cell.getCellType()==CellType.NUMERIC)
		{
			cellvalue = String.valueOf(cell.getNumericCellValue());
		}
		else if (cell.getCellType()==CellType.BOOLEAN)
		{
			cellvalue = String.valueOf(cell.getBooleanCellValue());
		}
		return cellvalue;
				
	}
	
	
	public int getRowCount(String sheetName)
	{
		sheet = workbook.getSheet(sheetName); 
		int rowcount = sheet.getPhysicalNumberOfRows();
		return rowcount;
	}
	
	public int getColcount(String sheetName)
	{
		sheet = workbook.getSheet(sheetName);
		row=sheet.getRow(0);
		int colcount = row.getPhysicalNumberOfCells();
		return colcount;
	}
}
