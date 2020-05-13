package reexecutefailtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failtestcase 
{
	@Test
	public void test1()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void test2()
	{
		Assert.assertTrue(true);
	}
	
	
}
