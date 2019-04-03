package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import com.bridgelabz.util.AlgorithmLogic;
public class OderedList {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		com.util.datastructure.SinglyLinkedList<String> list = new com.util.datastructure.SinglyLinkedList<String>();
		File file = new File("C:\\Users\\lenovo\\Desktop\\order\\int.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
				while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		for (String k : array) {
			list.addElement(k);
		}
	list.traverse();  
		list.get(); 
		System.out.println("sorted elements");
		list.inserstionSort(array);
		System.out.println("Enter the key value: ");
		String key = AlgorithmLogic.readString();
		//  list.binarySearch(array, key);
		com.util.datastructure.SinglyLinkedList<String> newList=list.searchKey(list, key);
		     
		newList.traverse();
		 FileWriter fw=new FileWriter("C:\\Users\\lenovo\\Desktop\\order\\int.txt");    
         String data = newList.toString();
		fw.write(data);  
         //fw.write("Test ");
         fw.close();  
		
         System.out.println("ordered List -" + data);
		 }
}