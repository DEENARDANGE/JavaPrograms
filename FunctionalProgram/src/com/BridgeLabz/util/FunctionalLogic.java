package com.bridgelabz.util;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FunctionalLogic { 
		static Scanner Scanner =new Scanner(System.in);
	public static int getInt() 
	{
		return Scanner.nextInt();
	}
	public static Double getDouble()
	{
		return Scanner.nextDouble();
	}
	public static String getString()
	{
		return Scanner.next();
	}
	
	
    /**LEAP YEAR
     * @param year
     * @return
     */
    public static boolean leapyear(int year) 
    { 
		if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0 )
         return true;
        else
        return false;
	}
    
    

	/**PRIME FACTORE
	 * @param num
	 * @return
	 */
	public static int primefactore(int num)
	{
		while(num%2==0)
		{
			System.out.println(2+"");
			num=num/2;
		}
			for(int i=3;i<=num;i++)
        {
        	while(num%i==0)
        	{
        		System.out.println(i);
        		num=num/i;
        	}
        }
		return num;
	}

	
	
	
	
	/**POWER
	 * @param num
	 * @return
	 */
	public static int power(int num) {
		        int power=1;
				for (int i=0; i<= num ;i++)
		           {
		               System.out.println(power);
		               power = power * 2;
		           }
		return num;
	}
 
	
	
	
	
		/** HARMONICS
		 * @param num
		 * @return
		 */
		public static float harmonicsofnum(int num) {
		float harmonic = 1; 
	    for (int i = 2; i<= num; i++) 
	    {
	        harmonic= harmonic + (float)1 / i; 
	    }
		return harmonic;
	}
	
	
	
	/**FLIP COINS
	 * @param flips
	 */
	public static void toss(float flips) {
		double result;
		int heads=0;
		int tails =0;
		for(float loopCount = 0;loopCount <flips;loopCount++)
		{
		result=Math.random();
		if(result<0.5)
			tails++;
		else
			heads++;
		}
		System.out.println("num of tails: "+tails + "\n num of heads: "+heads+ "\n num of flips: "+flips);
		double percentHeads = heads*100/flips;
		double percentTails =tails*100/flips;
		System.out.println("head percentage "+ percentHeads + "\n tail percentage  "+percentTails);
				
}
                                                                                 	
	
	

	/**GAMBLER
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public static void game(int stake, int goal, int trials) {
	       
         int wins = 0; 
        for (int t = 0; t < trials; t++)
        {   
			int cash = stake;
			while (cash > 0 && cash < goal)
            {
                if (Math.random() < 0.5) 
                	cash++;    
                else                   
                	cash--;    
            }
            if (cash == goal) 
           
            	wins++;                
        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);

	}

	/**STRING REPLACEMENT
	 * @param Str1
	 * @param Str2
	 * @param Str3
	 * @return
	 */
	public static String replace(String Str1, String Str2, String Str3)
	{
		String Str4 = null;
	if (Str1.length()>3)
	{
	 Str4 = Str3.replaceAll(Str2, Str1);
	 Str3=  "hello <<"+ Str4 +" >>,how are you";
	}
	else
	{
		System.out.println(" Name is invalid ");
	}
	return Str4;
}

	
	

/** COUPON NUMBER
 * @param num
 * @return
 */
public static int coupon(int num) {
	return (int) (Math.random() * num);
}


public static int collect(int num) {
	 boolean[] isCollected = new boolean[num];  
     int count = 0;                           
     int distinct  = 0;                       
     while (distinct < num)
     {
         int value = coupon(num);            
         count++;                             
         if (!isCollected[value]) 
         {           
             distinct++;
             isCollected[value] = true;
         }
     }
     return count;
}



/** 2D ARRAY
 * @param row
 * @param col
 * @return
 */
public static Object[][] array(int row, int col) 
{
	Object[][] arr = new Object[row][col];
	 System.out.println("the array elements are");
    for(Integer i=0; i<row; i++)
    {
        for(Integer j=0; j<col; j++)
        {
        	 arr[i][j] = getString();
        }
    }
    System.out.println("Resultant array elements are");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
        	System.out.print( arr[i][j]+" ");
        }
        System.out.println();
    }
	return arr;
}



/**QUADRATIC EQUATION
 * @param a
 * @param b
 * @param c
 * @return
 */
public static float quadratic(int a, int b, int c) 
{
	 double temp = b * b - 4 * a * c;
     double r1 = 0;
	double r2;
	if (temp > 0)
	{
         // r = -b / 2 * a;  
         r1 = (-b + Math.sqrt(temp)) / (2 * a);
         r2 = (-b - Math.sqrt(temp)) / (2 * a);
         System.out.format("root1 = %.2f and root2 = %.2f", r1 , r2);
     }
	else if (temp == 0)
     {
       
         r1 = -b / (2 * a);
         r2 = -b / (2 * a);
         System.out.format("root1 = root2 = %.2f;", r1);
     }
    // if (temp < 0)
	else
     {
    	 double realPart = -b / (2 *a);
         double imaginaryPart = Math.sqrt(-temp) / (2 * a);

         System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
         
     }
	return 0;
}


/** SUM OF THREE NUM IS ZERO
 * @param n
 */
 static boolean found;
public static boolean findTriplets(int n) {
	int[] arr = new int[n];

	System.out.println("The values are");
	for(int i=0; i<n; i++)
    {
		arr[i] = getInt();
    }
    for (int i=0; i<n-2; i++) 
    { 
        for (int j=i+1; j<n-1; j++) 
        { 
            for (int k=j+1; k<n; k++) 
            { 
                if (arr[i]+arr[j]+arr[k] == 0) 
                { 
                	System.out.println("The resutant values are");
                    System.out.println(arr[i]+" " +arr[j]+" " +arr[k]+" ");
                   found = true; 
                } 
                else
                	found=false;
            } 
        } 
        
    }
	
	return found;
}



/** STOPWATCH
 * @param now
 * @param start
 * @return
 */
public static double stopwatch(long now , long start) 
{
	// TODO Auto-generated method stub
	 double time = (now - start) / 1000.0;
 	return time;
	
}
  


/**DISTANCE
 * @param x
 * @param y
 * @return
 */
public static double dist(int x, int y) {
	// TODO Auto-generated method stub
	double dist = Math.sqrt(x*x + y*y);
	return dist;
}




/**  WIND CHILL 
 * @param t
 * @param v
 * @return
 */
public static double wind(double t, double v) {
	// TODO Auto-generated method stub
	double wind = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	return wind;
}



/** STRING REPALCE USING REGEX
 * @param sentance
 * @param userName
 * @return
 */
public static String replaceUserName(String sentance, String userName) 
{
	// TODO Auto-generated method stub
	final String REGEX_USERNAME="<<userName>>";
    Pattern p = Pattern.compile(REGEX_USERNAME); 

    Matcher m = p.matcher(sentance); 
    String Message=m.replaceFirst(userName);
     return Message ;
	
//       // sentance=sentance.replaceFirst(REGEX_USERNAME, userName);
//       
//		return sentance;
}


 	  /** PERMUTATION
 	 * @param fixed
 	 * @param sub
 	 */
 	public static void permutation(String fixed,String sub)
 		{
 		if(sub.equals(""))
 		{
 			System.out.println(fixed);
 			}
 		else
 		{
 			int a[] = new int[256];
 			for(int i=0;i<sub.length();i++)
 			{
 				if(a[(int)sub.charAt(i)]==0)
 				{
 					a[(int)sub.charAt(i)]=1;
 			permutation((fixed+sub.charAt(i)),sub.substring(0,i)+sub.substring(i+1,sub.length()));
 				
 				}
 				
 			}
 		}
			
 		}
 	
 	
 	
 	// TIC Tac Toe //
 	static final int EMPTY = 0;
    static final int NONE = 0;
    static final int USER = 1;
    static final int COMPUTER = 2;
    static final int STALEMATE = 3;
 // Print the board
 	

	/**
	 * @param board
	 */
	public static void print_board(int[][] board) {
		// TODO Auto-generated method stub
		// Print the board
		System.out.print(printChar(board[0][0]));
		System.out.print("|");
		System.out.print(printChar(board[0][1]));
		System.out.print("|");
		System.out.println(printChar(board[0][2]));
		System.out.println("-----");
		System.out.print(printChar(board[1][0]));
		System.out.print("|");
		System.out.print(printChar(board[1][1]));
		System.out.print("|");
		System.out.println(printChar(board[1][2]));
		System.out.println("-----");
		System.out.print(printChar(board[2][0]));
		System.out.print("|");
		System.out.print(printChar(board[2][1]));
		System.out.print("|");
		System.out.println(printChar(board[2][2]));
	    }

	// Return an X or O, depending upon whose move it was
	/**
	 * @param b
	 * @return
	 */
	private static char printChar(int b) {
		// TODO Auto-generated method stub
		switch(b) {
		case EMPTY:
		    return ' ';
		case USER:
		    return 'X';
		case COMPUTER:
		    return 'O';
		}
		return ' ';
	    }




	// Generate a random computer move
	/**
	 * @param board
	 * @return
	 */
	public static int computer_move(int[][] board) {
		// TODO Auto-generated method stub
		int move = (int)(Math.random()*9);
		while(board[move/3][move%3] != EMPTY) 
		    move = (int)(Math.random()*9);
		return move;
	}
	
	
	
	/**
	 * @param board
	 * @return
	 */
	public static int checkWinner(int[][] board) {
		// TODO Auto-generated method stub
		 // See if the game is over
		// Check if someone won
		// Check horizontals

		// top row
		if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
		    return board[0][0];

		// middle row
		if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
		    return board[1][0];

		// bottom row
		if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
		    return board[2][0];

		// Check verticals

		// left column
		if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
		    return board[0][0];

		// middle column
		if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
		    return board[0][1];

		// right column
		if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
		    return board[0][2];

		// Check diagonals
		// one diagonal
		if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
		    return board[0][0];

		// the other diagonal
		if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
		    return board[0][2];

		// Check if the board is full
		if(board[0][0] == EMPTY || 
	            board[0][1] == EMPTY || 
	            board[0][2] == EMPTY || 
		        board[1][0] == EMPTY ||
		        board[1][1] == EMPTY ||
		        board[1][2] == EMPTY ||
		        board[2][0] == EMPTY ||
		        board[2][1] == EMPTY ||
		        board[2][2] == EMPTY)
		    return NONE;

		return STALEMATE;
	    

	
	}

	

	}