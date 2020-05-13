package practicetestNG;

import org.testng.annotations.Test;

public class drivecar 
{
	//Priority is set to maintain order of execution
	//Priority is keyword attribute
	//Priority accepts negative values
	//If 2 tests are set with same priority it gets executed in chronological order between them
	//If both tests with priority and with out priority is set-->order of execution
	//--> begins the test without priority(chronological order) and then test with priority are executed
	
	@Test
	public void startcar()
	{
		System.out.println("Car started");
	}
	@Test(priority=1)
	public void putfirstGear()
	{
		System.out.println("putfirstGear");
	}
	@Test(priority=2)
	public void putsecondGear()
	{
		System.out.println("putsecondGear");
	}
	@Test(priority=3)
	public void putthirdGear()
	{
		System.out.println("putthirdGear");
	}
	@Test
	public void putforthGear()
	{
		System.out.println("putforthGear");
	}
	
}
