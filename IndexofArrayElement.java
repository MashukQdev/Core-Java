package com.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Program to find index of array element
 Practical 19 from OOPS concept practicals
 @author Mashuk Patel
 */
public class IndexofArrayElement {

	public static void main(String[] args) {
		int[] array = {10,1,2,1,5,9,10};
		System.out.println("Array elements are as below :");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter element to find its index : ");
		int number = sc.nextInt();
		ArrayList<Integer> index = new ArrayList<Integer>();  //to store element indexes
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				index.add(i);
			}
		}
		if(index.size() == 0) {
			System.out.println("No such element found in an array.");
		}
		else {
			System.out.println("Element found at index : " + index);
		}
	}

}
