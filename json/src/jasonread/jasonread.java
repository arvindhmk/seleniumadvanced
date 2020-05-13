package jasonread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jasonread 
{

	public static void main(String[] args) throws IOException, ParseException 
	{
		// TODO Auto-generated method stub

		JSONParser jparse = new JSONParser();
		
		FileReader fr = new FileReader("mk.json");
		
		JSONObject jsonobj = (JSONObject) jparse.parse(fr);
		
		String Name = (String) jsonobj.get("Name");
		
		Long age = (Long) jsonobj.get("age");
		
		JSONArray jarray =(JSONArray) jsonobj.get("Qualities");
		
		Iterator iter = jarray.iterator();
		
		while (iter.hasNext()) 
		{
			System.out.println("Qualities:"+iter.next());
	
		}
		
		System.out.println("Name:"+ Name);
		System.out.println("Age:"+ age);
	}

}
