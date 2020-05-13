package prioty;

import org.testng.annotations.Test;

public class checkpriority 
{
	@Test(priority=-1)
	public void method1()
	{
		System.out.println("Method 1");
	}
	
	@Test(priority=1)
	public void method2()
	{
		System.out.println("Method 2");
	}
}
