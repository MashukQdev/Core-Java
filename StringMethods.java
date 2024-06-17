package com.main;

/**
 Simple program to demonstrate the use of differents methods of string
 Practical 10 from core java practicals 
 @author Mashuk Patel
 */
public class StringMethods {

	/**
	 Method to check whether both the string are same or not
	 @param firstName first string
	 @param lastName second string
	 @return true if both the string are same otherwise false
	 */
	public static boolean isEqual(String firstName, String lastName) {
		if(firstName.equals(lastName)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String firstName = "Mashuk";
		String lastName = "Patel";
		
		System.out.println("String 1 : " + firstName + "\t String 2 : " + lastName);    // printing both strings
		
		System.out.println("For string 1 using charAt() at index 4 is : " + firstName.charAt(4));  //find char at given index
		
		System.out.println("Concat both the string : " + firstName.concat(lastName));              // concating both string
		
		System.out.println("Both the string are same : " + isEqual(firstName, lastName));      // comapring both strings
		
		System.out.println("Length of string 1 is : " + firstName.length());                   // find length of string
		
		System.out.println("Using subString() method on string 1 by giving start index 2 and end index 5 : " + firstName.substring(2, 5));   // substring from string
		
		System.out.println("Uppercase string 2:" + lastName.toUpperCase());     // upper case whole string
		
		System.out.println("Lowercase string 2:" + lastName.toLowerCase());     // lower case whole string
		
		System.out.println("Replacing all e in string 2 with i : " + lastName.replace('e', 'i'));    // replacing characters with new char 
	}
	
}
