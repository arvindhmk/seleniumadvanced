package Test2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mobile 
{
	@AfterTest
	public void call() 
	{
		System.out.println("Calls --> After");
	}
	
	@Test(groups= {"sanity"})
	public void text()
	{
		System.out.println("messaging G");
	}
	@Parameters({"url"})
	@Test
	public void socialapps(String mobilename) 
	{
		System.out.println("Social Media");
		System.out.println(mobilename);
	}
}
