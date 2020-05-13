package readdata;

public class callerclass
{

	public static void main(String[] args)
	{
	utilitycl util = new utilitycl("C:\\Users\\user\\Documents\\POI2.xlsx");
	System.out.println(util.getcelldata("userdetails", 2,"FIRSTNAME"));
	System.out.println(util.getcelldata("userdetails", 2,"LASTNAME"));
	System.out.println(util.getcelldata("userdetails", 2,"EMAIL ADDRESS"));
	System.out.println(util.getcelldata("userdetails", 2,"PHONE"));
	
	}
	
}
