package Data;

import org.testng.annotations.Test;

public class Dataproviderfromdifferentclass 
{

	@Test(dataProvider="getData1",dataProviderClass=Dataproviderclass.class)
	public void method1(String firstname, String lastname, int age)
	{
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(age);
		System.out.println("------------------------");
	}
	
	@Test(dataProvider="getData2",dataProviderClass=Dataproviderclass.class)
	public void method2(String Address, int Mob_Number)
	{
		System.out.println(Address);
		System.out.println(Mob_Number);
		System.out.println("------------------------");
	}	

}
