package com.util.datastructure;

public class Snippet {
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
	
		@SuppressWarnings("rawtypes")
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

	
		    
		
}

