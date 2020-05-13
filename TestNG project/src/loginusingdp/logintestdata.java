package loginusingdp;

import org.testng.annotations.DataProvider;

public class logintestdata 
{

	@DataProvider(name="logindp")
	public String[][] logindp()
	{
		String[][] test_data = new String[4][2];//[Number of test run][Number of unique values for each run]
		test_data[0][0]="Admin";//both correct
		test_data[0][1]="admin123";//both correct
		
		test_data[1][0]="Admin0";//both wrong
		test_data[1][1]="admin1230";//both wrong
		
		test_data[2][0]="Admin";//correct username
		test_data[2][1]="admin1230";//wrong pasword
		
		test_data[3][0]="Admin0";//incorrect username
		test_data[3][1]="admin123";//correct pasword
		
		return test_data;
	}
	
}
