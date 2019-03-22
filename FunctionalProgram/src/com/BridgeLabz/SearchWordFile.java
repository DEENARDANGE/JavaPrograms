package com.bridgelabz.algorithmprograms;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.bridgelabz.common.exception.InternalServerError;
import com.bridgelabz.util.AlgorithmLogic;
public class SearchWordFile 
{
	public static String[] fileRead(File file) throws IOException
	{
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(file);
		int line;
		// TODO Understand the code
		while ((line = fr.read()) != -1)
		{
			if (line == 32) 
			{
				s1.add(word);
				word = ""; 
			}
			
			else {
				word = word + String.valueOf((char) line);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}

	public static void main(String[] args) {
		// String fName="file.txt";
		
		String path = Paths.get("C:\\Users\\lenovo\\Desktop\\Deenu\\file.txt").toString();
		File f = new File(path);
		try {
			String arr[] = fileRead(f);
			for (String string : arr) 
			{
				System.out.println(string);
			}
			System.out.println("enter name to search");
			String s1=AlgorithmLogic.readString();
			int i = AlgorithmLogic.binarySearchfile(arr, s1);
			if (i > 0)
				System.out.println("not found");
			else
				System.out.println("found");
		} catch (Exception e) {
			throw new InternalServerError("Error Reading file", e);
		}
	}

}
