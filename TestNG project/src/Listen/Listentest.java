package Listen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listentest 
{
	 @Test
	    public void openFileDialog() {
	        System.out.println("openFileDialog()");
	    }
	     
	    @Test
	    public void uiGroupDependentTest(){
	        System.out.println("uiGroupDependentTest()");
	        Assert.assertTrue(false);
	    }
	 
	     
	    @Test
	    public void backendGroupDependentTest1(){
	        System.out.println("backendGroupDependentTest1()");
	    }
}
