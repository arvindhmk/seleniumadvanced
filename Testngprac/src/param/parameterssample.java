package param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterssample 
{
	@Test
	@Parameters("mobile")
	public void para(String brand)
	{
		System.out.println("mobile brand "+brand);
	}
}
