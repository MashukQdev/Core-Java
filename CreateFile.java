package com.oops;

import java.io.File;
import java.io.IOException;

/**
 Java program to create file using file handling
 Practical 24 from OOPS concept practicals
 @author Mashuk Patel
 */
public class CreateFile {

	public static void main(String[] args) {
		try {
			File f = new File("D:/myTestFile.txt");
			if(f.createNewFile()) {     // create a file 
				System.out.println("File "+ f.getName() + " created successfully.");
			} else {
				System.out.println("File is already exists in the location.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

