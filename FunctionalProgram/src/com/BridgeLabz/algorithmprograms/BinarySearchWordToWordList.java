package com.bridgelabz.algorithmprograms;
import java.util.StringTokenizer;
public class BinarySearchWordToWordList 
{
		public String[] wordsArrayFromStatement(String statement)
		{	
			StringTokenizer st = new StringTokenizer(statement," ");
			String words[]=new String[st.countTokens()];
			int i=0;
			while(st.hasMoreTokens())
			{
				words[i]=st.nextToken();
				i++;
			}
			return words;
		}
}
