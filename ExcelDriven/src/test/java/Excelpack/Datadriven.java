package Excelpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	@SuppressWarnings("deprecation")
	public List<String> getdata(String testcasename) throws IOException {
		List<String> s = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) 
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("Testdata")) 
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Identify testcases column by scanning the entire first row
				Iterator<Row> rows = sheet.iterator();//// Sheet is collection of rows

				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();// row is collection of cells

				int k = 0;// to navigate thru each column
				int column = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);
				// Once column is identified scan entire testcase column to identify purchase
				// testcase row

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
						Iterator<Cell> ce = r.cellIterator();
						while (ce.hasNext()) {
							Cell c = ce.next();
							{
								if (c.getCellType() == CellType.STRING) {
									s.add(c.getStringCellValue());
								} else {
									s.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								}
							}

						}

					}
				}

			}
		}
		return s;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Identify Testcase column by scanning the entire 1st row
		// Once column is identified then scan entire testcase column to identify
		// purchase testcase row
		// After you grab purchase testcase row = pull all the data of that row and feed
		// into test
	}
}