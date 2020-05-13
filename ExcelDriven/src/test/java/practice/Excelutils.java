package practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils 
{

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	
	public Excelutils(String excelpath, String sheetname)
	{

		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static int getRowcount() {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No. of rows :" + rowCount);
		return rowCount;
	}

	public static int getColcount() {
		int colCount = 0;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\user\\Desktop\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			row = sheet.getRow(0);
			colCount = row.getPhysicalNumberOfCells();
			System.out.println("Columncount: " + colCount);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}
		return colCount;

	}

	public static String getcellDatastring(int rowNum, int colNum) {
		String cellData=null;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\user\\Desktop\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

		return cellData;
	}

	public static void getcellDatanumeric(int rowNum, int colNum) {
		try {
			workbook = new XSSFWorkbook("C:\\Users\\user\\Desktop\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}
	
	public static void main(String args[])
	{
		getcellDatastring(0,0);
		getcellDatanumeric(3,1);
		
	}

}
