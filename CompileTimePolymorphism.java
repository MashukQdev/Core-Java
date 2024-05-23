package com.main;

/**
 Simple program to use compile time polymorphism 
 Practical 16 from OOPS concept practicals
 @author Mashuk patel
 */

/**
 class contain 3 methods of same name but different parameters
 */
class VehicleSpeed {
	
	/**
	 simple method to display print statement
	 */
	public void speed() {
		System.out.println("Car is running at constant speed.");
	}
	
	/**
	 simple method to display print statement
	 * @param speed speed is taken as input 
	 */
	public void speed(int speed) {
		System.out.println("Car is running at speed " + speed + "km/h.");
	}
	
	/**
	 simple method to display print statement
	 * @param speed speed is taken as input
	 * @param destination destination is taken as input 
	 */
	public void speed(int speed, String destination) {
		System.out.println("Car is running at speed " + speed +"km/h to reach " + destination + ".");
	}
	
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		VehicleSpeed v1 = new VehicleSpeed();
		v1.speed();
		v1.speed(101);
		v1.speed(110, "Manali");
	}
	
}
