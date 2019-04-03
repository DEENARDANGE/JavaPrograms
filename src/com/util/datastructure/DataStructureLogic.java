package com.util.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmLogic;

public class DataStructureLogic {
	Node head;
	static class Node {

		String value;
		Node nextref;

		// Constructor
		Node(String token)
		{
			value = token;
			nextref = null;
		}
	}
	/**
	 * static function to convert integer to string
	 * @param abc
	 * @return strarray
	 */
	public static String[] intTostring(int[] abc) {
        String strarray[]=new String[abc.length];
        int l=0;
        for(int i=0;i<abc.length;i++) {
            if(abc[i]!=0) {
            String str=String.valueOf(abc[i]);
            strarray[l]=str;
            l++;
        }}
        return strarray;
    }
	
	/**
	 * static function to convert integer to string
	 * @param list
	 * @param Str
	 * @return list
	 */
	public static DataStructureLogic insert(DataStructureLogic list, String Str)
	{
		// Create a new node with given data
		Node new_node = new Node(Str);
		//new_node.nextref = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.nextref != null) {
				last = last.nextref;
			}
			last.nextref = new_node;
		}
		return list;
	}
	
	/**
	 * static function to read a file
	 * @param list
	 * @return
	 */
	public static DataStructureLogic readFile(DataStructureLogic list)
    {
        System.out.println("Enter the path of the file");
        String csvFile = AlgorithmLogic.readString();
        //String csvFile="/home/admin1/Desktop/Files/example.txt";
        String line = " ";
        String name[]=new String[1000];
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {
            while ((line = br.readLine()) != null)
            {
                name = line.split(" ");
                for(int i=0;i<name.length;i++){
                    String name1=name[i];
                    insert(list, name1);               
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }

	/**
	 * static function to print a list
	 * @param list
	 * @return
	 */
	public static void printList(DataStructureLogic list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			if(currNode.value!=null)
				System.out.println(currNode.value + " ");
			currNode = currNode.nextref;
		}
	}
	
	
	/**
	 * to check for ordered search
	 * @param list and key
	 * @param integer value
	 */
	public static int delete(DataStructureLogic list,String key)
	{
		int flag=0;
		Node currNode = list.head;        
		while(currNode != null)
		{
			if(currNode.value!=null)
			{
				if((currNode.value).compareToIgnoreCase(key)==0) {
					currNode.value=null;    
					System.out.println("entered "+key+" found and deleted");
					flag=1;        
				}
			}
			currNode = currNode.nextref;
		}

		return flag;            
	}
	
	/**
	 * to display the file
	 * @param fname String 
	 */
	public static void dispFile( String fname)
	{
		String line = null;
		try
		{
			FileReader fileReader = new FileReader(fname);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file named '" + fname + "'");
		}
	}	
	
	/**
	 * to check for ordered search
	 * @param li2 linked list of integer
	 * @param key to get value
	 */
	public static int[] toIntConv(DataStructureLogic list)
	{
		int kz=0;
		Node currNode = list.head;
		int i=0;
		int[] str =new int[1000];
		while (currNode != null) {
			if(currNode.value!=null)
			{    
				kz=Integer.parseInt(currNode.value);
				str[i]=kz;
				i++;
			}
			currNode = currNode.nextref;
		}
		return str;
	}
	
	/**
	 * to check for ordered search
	 * @param li2 linked list of string
	 * @param key to get value
	 */
	public static String[] toStrinConv(DataStructureLogic list)
	{
		Node currNode = list.head;
		int i=0;
		String[] str =new String[100000];
		while (currNode != null) {
			if(currNode.value!=null)
				str[i]=currNode.value ;
			i++;
			currNode = currNode.nextref;
		}
		return str;
	}    
	
		/**
		 * to sort array of integer
		 * @param arr array of integer
		 * @return integer array
		 */
	public static int[] sortArray(int [] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j]>key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;

	}
	/**
	 * static function to print using File Writer
	 * @param list
	 * @return
	 */
	public static void usingFileWriter(DataStructureLogic list,String[] fileContent,String path) throws IOException
	{
		//String[] fileContent = DataStructureUtility.toStrinConv(list);
		FileWriter fileWriter = new FileWriter(path);   
		for(String s:fileContent)
		{
			if(s!=null) {
				fileWriter.write(s);
				fileWriter.write(" ");
			}
		}
		fileWriter.close();}

	/**
	 * to sort string of integer
	 * @param arr string of integer
	 * @return integer string
	 */
	public static int[] stringSort(int[] myArray) {
		for(int i = 0; i<myArray.length; i++) {
			for (int j = i+1; j<myArray.length-1; j++) {
				if(myArray[i]!=0 && myArray[j]!=0 ) {
					if(myArray[i]>myArray[j]){
						int temp = myArray[i];
						myArray[i] = myArray[j];
						myArray[j] = temp;
					}
				}
			}
		}
		return myArray;
	}
	
	//********************* Balanced parantesis****************//
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static boolean areParenthesisBalanced(char[] ch) {
			StackImplementation st = new StackImplementation();
	
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
					st.push(ch[i]);
	
				else	if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
	
					if (st.isEmpty()) {
						return false;
					}
	
					else if (!isMatchingPair((char)st.pop(), ch[i])) {
						return false;
					}
				}
	
			}
	
			if (st.isEmpty())
				return true;
			else {
				return false;
			}
		}
	
	// ********************Banking *****************//

	public static int Deposit(double amount, int curBalance) {
		curBalance += amount;
		return curBalance;
	}

	public static int Withdrawal(double amount, int curBalance) {
		curBalance -= amount;
		return curBalance;
	}

	public static void checkBalance(int curBalance) {
		System.out.println("Your current balance is: " + curBalance);
	}
//*********************calender************//
	 public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	 // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }

//***********************Hashing Function*******************//

  	public  void HashingFunction() {
  	OrderedLinkedList[] order=new OrderedLinkedList[11];
  	NodeUtility nu=new NodeUtility();

  	
		int[] retArray = nu.integerFileReader();

		for(int i=0; i<retArray.length; i++)
		{
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new OrderedLinkedList();
				order[rem].addItem(retArray[i]);
			}
			else
			{
				order[rem].addItem(retArray[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i+"-->" );
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
  	}

	
//*********************PrimeNum********************//
  		/**
  		 *static function to print the prime numbers for the given range
  		 * 
  		 * @param m the integer that represents the lower bound of the range
  		 * @param n the integer that represents the upper bound of the range
  		 * @return list of integers that are prime numbers between the range
  		 */
  		public static List<Integer> primeNumbers(int m,int n) {
  			List<Integer> lst=new ArrayList<Integer>();
  			int temp;

  			//swapping of bounds if the given lower bound is greater than upper bound
  			if(m>n) {
  				temp=m;
  				m=n;
  				n=temp;}
  			int flag=1;
  			//try all the possible values from lower bound to upper bound
  			//if the number has the factor then it must be checked within lower bound
  			for(int i=m;i<=n;i++){
  				for(int j=2;j<i;j++){
  					//If the number is divisible by any of the number then 
  					//initializing flag to zero and break
  					//else flag is initialized to one
  					if(i%j==0){
  						flag=0;
  						break;}
  					else
  						flag=1;}
  				//If the number is prime which is indicated by the flag,
  				//then adds the number into an ArrayList.
  				if(flag==1)
  					lst.add(i);}
  			return lst;}

		

			
	}
  	
