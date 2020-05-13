package Excelpack;

import java.io.IOException;
import java.util.List;

public class Testsample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Datadriven d = new Datadriven();
List<String> data = d.getdata("Delete Profile");
	
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
	}

}
