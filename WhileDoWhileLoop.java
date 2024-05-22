package com.main;

/**
 Simple program to print 1 to 10 numbers using while loop and do while loop
 Practical 4 from core java practicals
 @author Mashuk Patel
 */
public class WhileDoWhileLoop {

	public static void main(String[] args) {
		//printing 1 to 10 numbers using while loop
		System.out.println("Using while loop");
		int number=1;
		while(number <= 10) {
			System.out.print(number+" ");
			number++;
		}
		System.out.println();
		//printing 1 to 10 numbers using do while loop
		System.out.println("Using do while loop");
		number=1;
		do {
			System.out.print(number+" ");
			number++;
		} while(number <= 10);
	}
	
}
