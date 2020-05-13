package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.baseclass;

public class listernerfortest extends baseclass implements ITestListener 
{
	//listernerfortest b= new listernerfortest();
	baseclass b = new listernerfortest();


	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		try {
			b.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
