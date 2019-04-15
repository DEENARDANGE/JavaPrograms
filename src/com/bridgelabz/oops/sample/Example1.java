package com.bridgelabz.oops.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Example1 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ParseException
	{
		//parsing file
		Object obj=new JSONParser().parse(new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\oops\\sample\\ex1.json"));
		//type casting to obj
		JSONObject jo=(JSONObject) obj;
		//getting first name and last name
		String name=(String) jo.get("name");
		String Age=(String) jo.get("Age");
		System.out.println(name);
		System.out.println(Age);
       // System.out.println(jo);
		JSONArray info = (JSONArray) jo.get("info");
		  Iterator<Object> iterator = info.iterator();
		  while(iterator.hasNext())
		  {
			 System.out.println(iterator.next());
		  }
		
	}

}
