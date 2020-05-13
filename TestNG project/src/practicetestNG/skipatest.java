package practicetestNG;

import org.testng.annotations.Test;

public class skipatest 
{

	@Test(priority=0)
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
	@Test(priority=4)
	public void putforthGear()
	{
		System.out.println("putforthGear");
	}
	@Test(priority=5,enabled=false)//By default all other test have enabled = true, 
	//settings it false will skip the test from execution
	public void turnonMusic()
	{
		System.out.println("MUSIC ON");
	}

}
