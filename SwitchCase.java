package com.main;

import java.util.Scanner;

/**
 Simple program to find month name from given number
 Practical 3 from core java practicals
 @author Mashuk Patel
 */
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find month name : ");
		int monthnumber = sc.nextInt();
		switch(monthnumber) {
			case 1:
				System.out.println("Month name is january.");
				break;
			case 2:
				System.out.println("Month name is february.");
				break;
			case 3:
				System.out.println("Month name is march.");
				break;
			case 4:
				System.out.println("Month name is april.");
				break;
			case 5:
				System.out.println("Month name is may.");
				break;
			case 6:
				System.out.println("Month name is june.");
				break;
			case 7:
				System.out.println("Month name is july.");
				break;
			case 8:
				System.out.println("Month name is august.");
				break;
			case 9:
				System.out.println("Month name is september.");
				break;
			case 10:
				System.out.println("Month name is octomber.");
				break;
			case 11:
				System.out.println("Month name is november.");
				break;
			case 12:
				System.out.println("Month name is december.");
				break;
			default :
				System.out.println("Please enter a number between 1 to 12.");
		}
	}
	
}
