package com.oops;

import java.io.FileWriter;
import java.io.IOException;

/**
 Java program to write in file 
 Practical 24 from OOPS concept practicals
 @author Mashuk Patel
 */
public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:/myTestFile.txt");
			fw.write("My name is Mashuk Patel.");
			fw.write("\nI am from himatnagar.");
			fw.write("\nI am working at QDev Technolab.");
			fw.close();     // close file writer
      
			System.out.println("Details wrote to the file successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

