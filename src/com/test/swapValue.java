package com.test;

import java.util.Scanner;

public class swapValue {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a's value for swap");
		int a = in.nextInt();
		
		System.out.println("Enter b's value for swap");
		int b = in.nextInt();
		
		int c = 0;
		c = b;
		b = a;
		a = c;
		
		System.out.println("Swapped Values of a and b are " + a +" "+ b);
		
		
		
		
	}

}
