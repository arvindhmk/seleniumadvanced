package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class setdependency 
{
	@Test
	public void opensite() 
	{
	
		System.out.println("navigated to site");
	}
	@Test(dependsOnMethods="opensite")
	public void createaccount()
	{
		Assert.assertTrue(false);
		System.out.println("Account created");
		
	}
	
	//alwaysrun attribute runs the test even the dependency test fails
	@Test(dependsOnMethods="createaccount",alwaysRun=true)
	public void login()
	{
		System.out.println("Login success");
	}
}
