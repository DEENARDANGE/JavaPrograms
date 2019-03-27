package com.bridgelabz.datastructure;

import java.io.File;
import java.nio.file.Paths;

import com.bridgelabz.common.exception.InternalServerError;
import com.bridgelabz.util.AlgorithmLogic;

public class demo {
	public static void main(String[] args) {
		String word = "";
		
		String path = Paths.get("C:\\Users\\lenovo\\Desktop\\Deenu\\file.txt").toString();
		File f = new File(path);
		try {
			String arr[] = AlgorithmLogic.fileRead(f);
			for (String string : arr) {
				System.out.println(string);
			}
			System.out.println("enter name to search");
			String s1 = AlgorithmLogic.readString();
			int i = AlgorithmLogic.binarySearchfile(arr, s1);
			if (i > 0)
			{
				System.out.println("not found");
			}
			
			else
			{
				System.out.println("found");
				
			}
		} catch (Exception e) {
			throw new InternalServerError("Error Reading file", e);
		}
	}

}
