package com.main;

/**
 Simple program to demonstrate the use of differents methods of string
 Practical 10 from core java practicals 
 @author Mashuk Patel
 */
public class StringMethods {

	/**
	 method to check whether both the string are same or not
	 @param firstname first string
	 @param lastname second string
	 @return true if both the string are same otherwise false
	 */
	public static boolean isEqual(String firstname, String lastname) {
		if(firstname.equals(lastname)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String firstname="Mashuk";
		String lastname="Patel";
		System.out.println("String 1 : " + firstname + "\t String 2 : " + lastname);
		System.out.println("For string 1 using charAt() at index 4 is : " + firstname.charAt(4));
		System.out.println("Concat both the string : " + firstname.concat(lastname));
		System.out.println("Both the string are same : " + isEqual(firstname, lastname));
		System.out.println("Length of string 1 is : " + firstname.length());
		System.out.println("Using subString() method on string 1 by giving start index 2 and end index 5 : " + firstname.substring(2, 5));
		System.out.println("Uppercase string 2:" + lastname.toUpperCase());
		System.out.println("Lowercase string 2:" + lastname.toLowerCase());
		System.out.println("Replacing all e in string 2 with i : " + lastname.replace('e', 'i'));
	}
	
}
