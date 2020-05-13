package depends;

import org.testng.annotations.Test;

public class dependson1 
{
	@Test(enabled=false)
	public void a()
	{
		System.out.println("Method A");
	}
}
