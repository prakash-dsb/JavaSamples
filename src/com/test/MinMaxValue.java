package com.test;

public class MinMaxValue {

	
	public void calcMinValue(int arrayValue[]) {
		int minValue = arrayValue[0];
		
				
		for (int i=0; i < arrayValue.length; i++) {
			
			if(minValue>arrayValue[i])	{
				
				minValue = arrayValue[i];
				
			}			
		}
		System.out.println("Minimum value in the array is " + minValue);
	}
	
	public void calcMaxValue(int arrayValue[]) {
		
		int maxValue = arrayValue[0];
		int arraylength = arrayValue.length;
		
		for (int j=0; j < arraylength; j++) {
			
			if(maxValue<arrayValue[j])	{
				
				maxValue = arrayValue[j];
								
			}			
		}
		System.out.println("Maximum value in the array is " + maxValue);
		
	}
	
	public static void main(String[] args) {
		
		int array_input[] = {12,16,18,30,5,9}; 
		MinMaxValue mV = new MinMaxValue();
		mV.calcMinValue(array_input);
		mV.calcMaxValue(array_input);
		
	}

}
