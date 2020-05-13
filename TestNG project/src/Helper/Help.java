package Helper;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Help 
{
	@Parameters({"URL"})
	@Test
	public void launch(String url)
	{
		System.out.println("launch");
		System.out.println(url);
	}
	
	@Test
	public void selectdate()
	{
		
		System.out.println("selectdate");
	}
	
	@Test
	public void selectsource()
	{
		System.out.println("selectsource");
	}
	
	@Test

	public void selectdestination()
	{
		System.out.println("selectdestination");
	}

	@Test(timeOut=40000)
	public void selecttravels()
	{
		System.out.println("selecttravels");
	}
	
	@Test(dependsOnMethods = {"launch"})
	public void confirmseat()
	{
		System.out.println("confirmseat");
	}
	
	@Test (enabled=false)
	public void payment()
	{
		System.out.println("payment");
	}
	
	@Test
	public void acknowledge()
	{
		System.out.println("acknowledge");
	}	
}