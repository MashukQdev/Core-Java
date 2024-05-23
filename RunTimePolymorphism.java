package com.main;

/**
 Simple program to demonstrate use of runtime polymorphism
 Practical 16 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 class which contain method to display simple print statement
 */
class Electronics {
	
	/**
	 method contain simple print statement which takes string input
	 * @param name name is taken as input
	 */
	public void computer(String name) {
		System.out.println("Electronic Computer name is : " + name);
	}
	
}

/**
class which contain method to display simple print statement
*/
class Appliances extends Electronics{
	
	/**
	 method contain simple print statement which takes string input
	 * @param name name is taken as input
	 */
	public void computer(String name) {
		System.out.println("Appliances computer name is : " + name);
	}
	
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Electronics e1 = new Appliances();
		e1.computer("Mac");
	}
	
}
