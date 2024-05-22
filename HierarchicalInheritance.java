package com.main;

/**
 Simple program to demonstrate use of hierarchical inheritance
 Practical 15 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 class contain method just to display print statement
 */
class Vehicle {    // parent class here single parent having 2 or more child 
	
	/**
	 method contain only one print statement 
	 @param name name is taken as input 
	 */
	public void runVehicle(String name) {
		System.out.println(name + " is running.");
	}
	
}

/**
class contain method just to display print statement
*/
class Bike extends Vehicle {   // child class for vehicle
	
	/**
	 method contain only one print statement 
	 @param name name is taken as input 
	 */
	public String sendName() {
		return "Bike";
	}
	
}

/**
class contain method just to display print statement
*/
class Cycle extends Vehicle {   // child class for vehicle
	
	/**
	 method contain only one print statement 
	 @param name name is taken as input 
	 */
	public String sendName() {
		return "Cycle";
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.runVehicle(b1.sendName());
		Cycle c1 = new Cycle();
		c1.runVehicle(c1.sendName());
	}
	
}
