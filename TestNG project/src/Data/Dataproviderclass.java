package Data;

import org.testng.annotations.DataProvider;

public class Dataproviderclass 
{

	@DataProvider
	public Object[][] getData1()
	{
		
		Object[][] data = new Object[3][3];

		data[0][0]="Arun";
		data[0][1]="kumar";
		data[0][2]=33;
		
		data[1][0]="Amar";
		data[1][1]="nath";
		data[1][2]=25;
		
		data[2][0]="Arjun";
		data[2][1]="kumar";
		data[2][2]=24;				
		
		return data;		
	}
	
	@DataProvider
	public Object[][] getData2()
	{
		
		Object data1[][] = new Object[1][2];
		
		data1[0][0]="Chennai";
		data1[0][1]=866762093;
		
		return data1;
		
	}
	
	
	
}
