package com.bridgelabz.datastructure;

import com.bridgelabz.util.AlgorithmLogic;
import com.util.datastructure.DataStructureLogic;

public class BinayTree {
	/*
	* The main function is written to take input from the user
	* and to find how many binary search trees can be formed
	* from the entered number of nodes
	*/
	  public static void main(String[] args) { 
	        System.out.println("Enter the number of nodes");
	        int nodes=AlgorithmLogic.getInt();
	        int[] intArr=new int[nodes];
	        for(int i=0;i<intArr.length;i++)
	        {
	        	System.out.println("Enter the "+i+" th number:");
	        	intArr[i]=AlgorithmLogic.getInt();	        }
	        double [] numbertimes=new double[intArr.length];
	        for(int i=0;i<intArr.length;i++)
	        {
	        	//Method 1- using function of Utility class of com.bridgelabz.util package
	        	numbertimes[i] = DataStructureLogic.binaryCount(intArr[i]);
	        }
	         for(int i=0;i<numbertimes.length;i++)
	         {
	        	 System.out.println("Count of BST possibilities for "+  intArr[i] +" nodes is "+numbertimes[i]);
	         }
	} 

}