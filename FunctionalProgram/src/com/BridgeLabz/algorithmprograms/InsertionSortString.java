package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmLogic;
public class InsertionSortString
{
	public static void main(String[] args)
	{
			    System.out.println("Enter the value of N: ");
		    	int N= AlgorithmLogic.getInt();
			    String[] arr= new String[N];
			    System.out.println("Enter Strings : ");
		    	 for (int i = 0; i < N; i++)
			    	 {
					arr[i] = AlgorithmLogic.readString();
			    	 }
			        int n = arr.length; 
	                sort_sub(arr, n); 
			        System.out.println("Sorted array: "); 
		
			String sortedArray[] = sort_sub(arr, arr.length); 
			for(int i=0;i<sortedArray.length;i++)
			{
			System.out.println(sortedArray[i]);
			}
			}

			/**
			 * @param array
			 * @param f
			 * @return
			 */
			
			public static String[] sort_sub(String array[], int f)
			{
				String temp="";
			for(int i=0;i<f;i++)
			{
//				for(int j=i+1;j<f;j++)
//				{
//					if(array[i].compareToIgnoreCase(array[j])>0)
//					{
//						temp=array[i];
//						array[i]=array[j];
//						array[j]=temp;
//					}
//				}
				  temp=array[i];
				 int j=i-1;
				 while(j>0&&array[j].compareToIgnoreCase(temp)<0)
				 {
					array[j+1]=array[j];
					j=j-1;
				 }
				 array[j+1]=temp;
			  }
			  return array;
			}
}
				

			


