package com.bridgelabz.datastructure;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUnorderdList {
		
		public static void main(String[] args) {
			
		
			//String word="";
			//while (!word.matches("quit")) {
			
			try {
				// creating a new file
				File f1 = new File("C:\\Users\\lenovo\\Desktop\\Deenu\\file.txt");
				UnorderedList<String> list = new UnorderedList<>();
				Scanner sf = new Scanner(f1);
				Scanner s = new Scanner(System.in);
				// addind values from file to list
				while (sf.hasNext()) {
					list.add(sf.next());
				}
				// printing list
				System.out.println(list);
				/*
				 * writing to file using file writer
				 */
				FileWriter fw = new FileWriter(f1);
				System.out.println("enter a word ");
				String s1 = s.nextLine();
				System.out.println(list.size());
				// checking if word is found and deleting it and then saving list to file
				if (list.search(s1)) {
					list.remove(s1);
					int n = 0;
					while (n < list.size()) {
						fw.write(list.pop(0) + " ");
						fw.flush();
						n++;
					}
					System.out.println("found and deleted");
					// or adding it to list and saving it to file
				} else {
					list.add(s1);
					int n = 0;
					while (n < list.size()) {
						fw.write(list.pop(0) + " ");
						fw.flush();
						n++;
					}
					System.out.println("added and saved");
					fw.close();
					s.close();
				}

			} catch (FileNotFoundException e) {
				System.out.println("file not found");
			} catch (IOException e) {
				System.out.println("io excep");
			}
		}
//		}

}
