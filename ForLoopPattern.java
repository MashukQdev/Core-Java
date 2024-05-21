package com.main;

/**
 Simple program to print pattern using for loop
 Practical 5 from core java practicals
 @author Mashuk Patel
 */
public class ForLoopPattern {

	public static void main(String[] args) {
		for(int i=1; i <= 5; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
