package com.main;

/**
 Simple program to demonstrate use of break / continue statement using for loop
 Practical 6 from core java practicals
 @author Mashuk Patel
 */
public class BreakContinueStatement {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			//skip number 5 by using continue statement
			if(i == 5) {
				continue;
			}
			//stop the loop before printing number 8 using break statement
			if(i == 8) {
				break;
			}
			System.out.println(i);
		}
	}
	
}
