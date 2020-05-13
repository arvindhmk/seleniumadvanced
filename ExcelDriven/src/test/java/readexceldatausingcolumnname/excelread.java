package readexceldatausingcolumnname;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {

	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String xlfilepath;
	String cellValue;
	
	public excelread(String xlfilepath) throws IOException {
		this.xlfilepath = xlfilepath;
		fis = new FileInputStream(xlfilepath);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
//change parameters type if required
	
	
	
	public String getCellData(String sheetName,int colNum,int rowNum)
    {
        try
        {
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(rowNum);
            cell = row.getCell(colNum);
            if(cell.getCellType() == CellType.STRING)
            {
                String cellValue =cell.getStringCellValue();
                return cellValue;
            }
            else if(cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA)
            {
                String cellValue  = String.valueOf(cell.getNumericCellValue());
                if (HSSFDateUtil.isCellDateFormatted(cell))
                {
                    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
                    Date date = cell.getDateCellValue();
                    cellValue = df.format(date);
                }
                return cellValue;
            }else if(cell.getCellType() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return "row "+rowNum+" or column "+colNum +" does not exist  in Excel";
        }
    }
	
		
	public String getCellData(String sheetname, String colname, int rowNum) {

		try {
			int colNum = -1;
			sheet = workbook.getSheet(sheetname);
			row = sheet.getRow(0);

			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colname)) {
					colNum = i;
				}
			}

			row = sheet.getRow(rowNum - 1);
			cell = row.getCell(colNum);

			if (cell.getCellType() == CellType.STRING) {
				return cell.getStringCellValue();
			}

			else if (cell.getCellType() == CellType.NUMERIC) {
				cellValue =String.valueOf(cell.getNumericCellValue());
				return cellValue;		}

			else if (cell.getCellType() == CellType.BOOLEAN) {
				cellValue = String.valueOf(cell.getBooleanCellValue());
				return cellValue;
			} else if (HSSFDateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yy");
				Date date = cell.getDateCellValue();
				String cellValue = dt.format(date);
				return cellValue;	
			} else if (cell.getCellType() == CellType.BLANK) {
				cellValue ="";
				return cellValue; 
			}

		} catch (Exception e) {
			cellValue = "no data found";
			return cellValue;
		}
		return cellValue;

	}

	public int getRowcount(String sheetName)
	{
		
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum()+1;
		return rowCount;		
	}
	
	public int getColumncount(String sheetname)
	{
		sheet = workbook.getSheet(sheetname);
		row= sheet.getRow(0);
		int colcount=row.getLastCellNum();
		return colcount;
	}
	
	
	
	
}
