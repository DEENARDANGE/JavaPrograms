package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.util.AlgorithmLogic;
import com.bridgelabz.util.ApplicationLogic;

public class Regex {
	
	/*
	* The main function is written to take input from the user and
	* replace the template in the json file with the input given
	*/
	public static void main(String[] args) throws FileNotFoundException {
		 String str = "C:\\Users\\lenovo\\Desktop\\regular\\regex.txt";
	        FileReader f = new FileReader(str);
	        @SuppressWarnings("resource")
	        BufferedReader read = new BufferedReader(f);
	        String line = "";
	        String word="";
	        try {
	            while ((word = read.readLine()) != null) {
	                line = word;
	            }
	            System.out.println(line);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("Please enter the first name");
	        String firstName = AlgorithmLogic.readString();
	        System.out.println("Please enter the last name");
	        String lastName = AlgorithmLogic.readString();
	        String fullName = firstName + " " + lastName;
	        System.out.println("Please enter your 10 digit phone number");
	        String phoneNum = AlgorithmLogic.readString();
	        Date date=new Date();
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        String formattedDate= dateFormat. format(date);
	        
	        String message =ApplicationLogic.replace(firstName, fullName, phoneNum, formattedDate, line);
	        
	        System.out.println(message);
	}
}