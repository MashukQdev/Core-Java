package com.oops;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

/**
 Program to read details from file
 Practical 25 from OOPs concept practicals
 @author Mashuk Patel
 */
public class ReadFile {

	public static void main(String[] args) {
		try {
			File f = new File("D:/myTestFile.txt");
			
			Scanner reader = new Scanner(f);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
}
