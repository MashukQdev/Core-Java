package com.oops;

/**
 Simple program to demonstrate use of hierarchical inheritance
 Practical 15 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 This class contain method which print a message on console
 */
class Vehicle {    // parent class here single parent having 2 or more child 
	
	/**
	 It print a message to console 
	 @param name The name of the vehicle 
	 */
	public void runVehicle(String name) {
		System.out.println(name + " is running.");
	}
	
}

/**
 This class extend the class Vehicle 
 It contain method which return string
*/
class Bike extends Vehicle {   // child class for vehicle
	
	/**
	 This method return string value 
	 @return The name of the object to be sent.
	 */
	public String sendName() {
		return "Bike";
	}
	
}

/**
 This class extend the class Vehicle 
 It contain method which return string
*/
class Cycle extends Vehicle {   // child class for vehicle
	
	/**
	 This method return string value 
	 @return The name of the object to be sent.
	 */
	public String sendName() {
		return "Cycle";
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Bike b1 = new Bike();    // create object of class Bike
		b1.runVehicle(b1.sendName());
		
		Cycle c1 = new Cycle();  // create object of class Cycle
		c1.runVehicle(c1.sendName());
	}
	
}
