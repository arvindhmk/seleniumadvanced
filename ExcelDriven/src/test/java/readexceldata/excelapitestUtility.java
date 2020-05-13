package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelapitestUtility 
{
	public FileInputStream fis = null;
	public XSSFWorkbook book = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;


public excelapitestUtility(String rxcelpath) throws Exception
{
	fis = new FileInputStream(rxcelpath);
	book= new XSSFWorkbook(fis);
	fis.close();
}

@SuppressWarnings("deprecation")
public String getSheet(String sheetname, int rownum, int colnum)
{
	try {
	
		sheet=book.getSheet(sheetname);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		if(cell.getCellType()==CellType.STRING)
		
			return cell.getStringCellValue();
		
		else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA)
		{
			 String cellVal = String.valueOf(cell.getNumericCellValue());
		
		if(HSSFDateUtil.isCellDateFormatted(cell))
		{
			DateFormat dt = new SimpleDateFormat("dd/MM/yy");
			Date date = cell.getDateCellValue();
			cellVal=dt.format(date);
		}
		return cellVal;
		}
		
		else if(cell.getCellType()==CellType.BLANK)
			return "";
		else
			return String.valueOf(cell.getBooleanCellValue());
		
	}
	catch(Exception e) 
	
	{
	
		return "No Match value";
		
	}
	

}
}

