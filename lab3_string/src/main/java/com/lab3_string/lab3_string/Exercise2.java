package com.lab3_string.lab3_string;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss="Earth";
		 System.out.println(getImage(ss));
	}
		 static String getImage(String Earth ) {
				
				
		        String str = "Earth";
		 
		        // conversion from String object to StringBuffer
		        StringBuffer sbr = new StringBuffer(str);
		        // To reverse the string
		     sbr.reverse();
		    String b= (str+"|"+sbr);
		    return b;
		      
		    
	}

}
