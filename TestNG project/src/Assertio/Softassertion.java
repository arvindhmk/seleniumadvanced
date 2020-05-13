package Assertio;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion 
{
	@Test(priority=1)
	public void softassrt()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Softassert started");
		assertion.assertEquals(12, 13,"Values of actual and expected does not match");
		System.out.println("Softassert completed");
		assertion.assertAll();//mandatory to perform soft assertions
		
	}
	@Test(priority=2)
	public void hardassert()
	{
		System.out.println("Hard assert started");
		Assert.assertEquals(12, 13,"Values of actual and expected does not match");
		System.out.println("Hard assert completed");
	}
}
