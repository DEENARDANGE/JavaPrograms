package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalLogic;

public class Permutation2 {
		 public static void main(String[] args) 
		    { 
			 System.out.println("Enter the string ");
			 String string=FunctionalLogic.getString();
			System.out.println("The combination Of String is ");

		        int l = string.length(); 
		       Permutation1 arr = new Permutation1(); 
		       permute(string, 0, l-1); 
		    } 
		    public static void permute(String s, int n, int r) 
		    { 
		        if (n == r) 
		            System.out.println(s); 
		        else
		        { 
		            for (int i = n; i <= r; i++) 
		            { 
		                s = swap(s,n,i); 
		                permute(s, n+1, r); 
		                s= swap(s,n,i); 
		            } 
		        } 
		    } 
		  
		    public static String swap(String a, int i, int j) 
		    { 
		        char temp; 
		        char[] ch = a.toCharArray(); 
		        temp = ch[i] ; 
		        ch[i] = ch[j]; 
		        ch[j] = temp; 
		        return String.valueOf(ch); 
		    } 
		} 
		



