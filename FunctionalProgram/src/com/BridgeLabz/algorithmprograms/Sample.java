package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmLogic;

public class Sample {
public static <T extends Comparable<T>> T[] binary(T[] array, T key){
		
		int length=array.length;
		int first=0;
		int last=length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			if(key.compareTo(array[middle])>0)
		     {
		       first=middle+1;
	          }
			
		else if(array[middle].equals(key))
		{
			System.out.println(key+"-found at location-"+middle);
			break;
		}
		else
		{
			last=middle-1;
		}
	}
		return array;
	}
	public static <T> void main(String[] args) {
		System.out.println("enter the number of elements");
		int N= AlgorithmLogic.getInt();
		String[] array=new String[N];
		System.out.println("enter next element");
		for(int i=0; i<N; i++) {
			array[i]= AlgorithmLogic.readString();
		}
		System.out.println("enter the key you want to search");
		String key=AlgorithmLogic.readString();
		System.out.println(binary(array,key));
		
		}
}


