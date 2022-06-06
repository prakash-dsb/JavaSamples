package com.test;

public class duplicateChar {

	String input;
	
	public void findDuplicate(String input) {
		
		this.input = input;
		
		char[] carray = this.input.toCharArray();
		
		System.out.println("The input string is " + this.input);
		System.out.println("The repeated characters are");
		
		for(int i=0; i<this.input.length();i++) {
			for(int j=i+1;j<this.input.length();j++) {
				
				if(carray[i]==carray[j]) {
					System.out.print(carray[j]);
					
				
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		duplicateChar output = new duplicateChar();
		output.findDuplicate("Testing Times");
		
	}

}
