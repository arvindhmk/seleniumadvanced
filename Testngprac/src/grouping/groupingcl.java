package grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupingcl 
{
	@Test(groups= {"vivo"})
	public void vivo1()
	{
		System.out.println("Vivo1");
	}
	@Test(groups= {"vivo"})
	public void vivo2()
	{
		System.out.println("Vivo2");
	}
	@Test(groups= {"oppo"})
	public void oppo1()
	{
		System.out.println("oppo1");
	}
	@Test(groups= {"oppo"})
	public void oppo2()
	{
		System.out.println("oppo2");
	}
	@Test(groups= {"honor"})
	public void honor1()
	{
		System.out.println("honor1");
	}
	@Test(groups= {"honor"})
	public void honor2()
	{
		System.out.println("honor2");
	}
}
