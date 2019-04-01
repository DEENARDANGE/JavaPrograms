package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import com.bridgelabz.datastructure.*;
import com.bridgelabz.util.AlgorithmLogic;
import com.util.datastructure.SinglyLinkedList;

import java.io.File;
import java.io.FileReader;
public class UnorderedList {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		File file = new File("C:\\Users\\lenovo\\Desktop\\Deenu\\file.txt");
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
		System.out.println("Enter the key value: ");
		String key = AlgorithmLogic.readString();
		
		SinglyLinkedList newList=list.searchKey(list, key);
		     
		newList.traverse();  
		 }
}