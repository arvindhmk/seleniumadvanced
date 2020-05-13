package readexceldatausingcolumnname;

import java.io.IOException;

public class readdatautlil 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		excelread ex = new excelread("C:\\Users\\user\\Documents\\POI.xlsx");
		
		System.out.println(ex.getCellData("Testdata","Add Profile", 3));
		System.out.println(ex.getCellData("Testdata","Purchase", 3));
		System.out.println(ex.getCellData("Testdata","Login", 3));
		System.out.println(ex.getCellData("Testdata","Delete Profile", 3));
	}

}
