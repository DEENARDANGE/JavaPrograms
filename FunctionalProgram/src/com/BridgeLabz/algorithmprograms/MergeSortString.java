package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmLogic;
public class MergeSortString
{
	public static void main(String[] args)
	{
		  System.out.println("Enter the value of N: ");
	    	int N= AlgorithmLogic.getInt();
		    String[]  ClassOne= new String[N];
		    System.out.println("Enter Strings : ");
	    	 for (int i = 0; i < N; i++)
		    	 {
	    		 ClassOne[i] = AlgorithmLogic.readString();
	    		 
		    	 }
		        mergeSort(ClassOne);
		     //   String[] names=new String[ClassOne.length];
		        for (int i=0;i< ClassOne.length;i++)
		        {
		            System.out.println(ClassOne[i]);
		        }
	}
		        public static void mergeSort(String[] ClassOne)
		        {
		        	if (ClassOne.length >= 2)
		        	{
		                String[] left = new String[ClassOne.length / 2];
		                String[] right = new String[ClassOne.length - ClassOne.length / 2];

		                for (int i = 0; i < left.length; i++)
		                {
		                    left[i] = ClassOne[i];
		                }

		                for (int i = 0; i < right.length; i++)
		                {
		                    right[i] = ClassOne[i + ClassOne.length / 2];
		                }

		                mergeSort(left);
		                mergeSort(right);
		                merge(ClassOne, left, right);
		            }
		        }

		        public static void merge(String[] names, String[] left, String[] right) 
		        {
		            int a = 0;
		            int b = 0;
		            for (int i = 0; i < names.length; i++)
		            {
		                if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0))
		                {
		                    names[i] = left[a];
		                    a++;
		                } else {
		                    names[i] = right[b];
		                    b++;
		                }
		            }
		        }
		      
	}



