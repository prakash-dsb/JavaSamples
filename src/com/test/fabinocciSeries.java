package com.test;

public class fabinocciSeries {

	public void fabonacciCalculation() {

		int n1, n2, n3;
		n1 = 0;
		n2 = 1;

		System.out.println("The fabonacci Series is :");
		System.out.print(n1 + "," + n2);

		for (int i = 0; i < 10; i++) {

			n3 = n1 + n2;
			
			n1 = n2;
			n2 = n3;

			System.out.print("," + n3);
			
		}

	}

	public static void main(String[] args) {

		fabinocciSeries fab = new fabinocciSeries();
		fab.fabonacciCalculation();

	}

}
