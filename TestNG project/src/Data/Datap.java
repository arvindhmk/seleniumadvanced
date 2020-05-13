package Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datap 
{
		
	   
	   @Test(dataProvider="getData",priority=1)
	    public void openConfirmationDialog(String username, int password) {
	        System.out.println("openConfirmationDialog()");
	        System.out.println(username);
	        System.out.println(password);
	    }
	 
	    @Test(priority=2)
	    public void openFileDialog() {
	        System.out.println("openFileDialog()");
	    }
	     
	    @Test(priority=3)
	    public void uiGroupDependentTest(){
	        System.out.println("uiGroupDependentTest()");
	    }
	 
	     
	    @Test(priority=4)
	    public void backendGroupDependentTest1(){
	        System.out.println("backendGroupDependentTest1()");
	    }

@DataProvider	    
public Object[][] getData()
{
//1st combination ==> username and password
//2nd combination ==> username and password
//3rd combination ==> username and password

	 Object data[][] = new Object[3][2];////[Number of test run][Number of unique values for each run] 	
	 
	 //1st set
	 data[0][0]="firstusername";
	 data[0][1]=123456;
	 
	 //2nd set
	data[1][0]="secondusernmae";
	data[1][1]=12345678;
	
	//3rd set
	data[2][0]="thirdusername";
	data[2][1]=123456789;
	
	return data; 
}
}
