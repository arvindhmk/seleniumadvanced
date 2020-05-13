package readexceldata;

public class readdatausinutilclass 
{

	public static void main(String args[]) throws Exception
	{
		excelapitestUtility read = new excelapitestUtility("C:\\Users\\user\\Documents\\POI.xlsx");
		System.out.println(read.getSheet("Testdata", 1, 0));
		System.out.println(read.getSheet("Testdata", 1, 1));
		System.out.println(read.getSheet("Testdata", 1, 2));
		System.out.println(read.getSheet("Testdata", 1, 3));
	}
	
}
