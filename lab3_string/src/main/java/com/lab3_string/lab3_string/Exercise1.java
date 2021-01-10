package com.lab3_string.lab3_string;

import java.util.StringTokenizer;
public class Exercise1 {
	 int  Sumtoken(StringTokenizer token)
	 {
	 	int sum = 0, dig = 0;
	 	 while(token.hasMoreTokens())
	    {
	                String s=token.nextToken();
	                dig=Integer.parseInt(s);
	                System.out.print(dig+" ");
	                sum=sum+dig;
	    }
	 	 return sum;
	 }

	 
}
