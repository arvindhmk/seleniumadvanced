package jsonwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jasonobjectwrite 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		JSONObject jsonobj = new JSONObject();
		jsonobj.put("Name", "Arvi");
		jsonobj.put("Age", 21);
		
		JSONArray jarray = new JSONArray();
		jarray.add("simple");
		jarray.add("humble");
		
		jsonobj.put("Qualities", jarray);
		
		BufferedWriter bw= new BufferedWriter(new FileWriter("mk.json"));
		
		bw.write(jsonobj.toJSONString());
		bw.flush();
		bw.close();
		
		
	}

}
