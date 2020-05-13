package practice;

public class excelutilsdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Excelutils excel = new Excelutils("C:\\Users\\user\\Desktop\\data.xlsx","sheet1");
		Excelutils.getRowcount();
		Excelutils.getColcount();
		Excelutils.getcellDatanumeric(3, 1);
		Excelutils.getcellDatastring(1, 1);
		
		
	}

}
