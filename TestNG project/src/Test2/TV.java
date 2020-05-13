package Test2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TV 
{
@Parameters({"url"})
	@Test
	public void Sun(String tvname)
	
	{
		System.out.println("Sun network");
		System.out.println(tvname);
	}
	
	@Test(groups= {"sanity"})
	public void star()
	{
		System.out.println("Star network G");
	}
	
	@BeforeTest
	public void zee()
	{
		System.out.println("zee network-->Before");
	}
	
}
