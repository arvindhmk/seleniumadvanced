package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Loan1 
{
	@BeforeSuite
	public void suit1()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void suit2()
	{
		System.out.println("Before suite");
	}
	
	@Test
	public void Homeloan1personal()
	{
		System.out.println("Homeloan1personal");
	}
	@Test
	public void personalloan2()
	{
		System.out.println("personalloan2");
	}

	@Test
	public void personalloan3()
	{
		System.out.println("personalloan3");
	}
}
