package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readPropertyFile {

	public static void main(String[] args) {
	
		Properties prop = new Properties();
		InputStream readFile = null;
		
		try {
			readFile = new FileInputStream("config.properties");
			
			try {
				prop.load(readFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String Username = prop.getProperty("Username");
			String Password = prop.getProperty("Password");
			
			System.out.println(Username);
			System.out.println(Password);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			if(readFile != null) {
				try {
					readFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					try {
						readFile.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}

	}

}
