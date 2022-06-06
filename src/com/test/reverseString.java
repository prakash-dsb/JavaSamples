package com.test;

public class reverseString {
	
	

	public static void main(String[] args) {
		
		String stringinput = "anna";

        // convert String to character array

        // by using toCharArray

        char[] resultarray = stringinput.toCharArray();

        //iteration

        for (int i = stringinput.length() - 1; i >= 0; i--) {

         // print reversed String
            System.out.print(resultarray[i]);
        }
	
		//Check Palindrome
        
        StringBuffer sb = new StringBuffer(stringinput);
        sb.reverse();
        String data = sb.toString();
		
		if(stringinput.equals(data)) {
			System.out.println("\nits a Palindrome");
		}
		else {
			System.out.println("\nits not a Palindrome");
		}
	}
}

