package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcel 
{


	FileInputStream fis = null;
	XSSFWorkbook workbook = null;
	XSSFSheet sheet = null;
	XSSFRow row = null;
	XSSFCell cell = null;
	
	
	public void readatafromexcel(String excelpath, String sheetname) throws IOException 
	{
		// TODO Auto-generated method stub

		fis = new FileInputStream(excelpath);
		workbook = new XSSFWorkbook(fis);
						
	}
}
