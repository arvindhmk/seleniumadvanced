package dependson2;

import org.testng.annotations.Test;

import depends.dependson1;

public class dependson2 extends dependson1
{
	@Test(dependsOnMethods="a")
	public void b()
	{
		System.out.println("Method B");
	}
}
