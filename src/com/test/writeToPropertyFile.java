package com.test;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class writeToPropertyFile {


	public static void main(String[] args) {
		
		 
				 String[] array = new String[]{"A", "B", "C"}; 
				 List<String> list1 = Arrays.asList(array); 
				 List<String> list2 = new ArrayList<>(Arrays.asList(array)); 
				 
				 List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C")); 
				 System.out.print(list1.equals(list2)); 
				 System.out.print(list1.equals(list3)); 
				 
				
				 
				 
				 
		/*Properties prop = new Properties();
		OutputStream writeFile = null;
		 
		try {
			writeFile = new FileOutputStream("config.properties");
			
			prop.setProperty("Username", "Prakash.dsb");
			prop.setProperty("Password", "Test@123;;");
			
			try {
				prop.store(writeFile, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				writeFile.close();
				System.out.println("File Successfully Closed");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		*/

	}
	
}


