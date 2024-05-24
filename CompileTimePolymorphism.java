package com.oops;

/**
 Simple program to use compile time polymorphism 
 Practical 16 from OOPS concept practicals
 @author Mashuk patel
 */

/**
 This class contain methods to display statements related to vehicle speed.
 It contain 3 methods with same name but argumnets are different
 */
class VehicleSpeed {
	
	/**
	 Simple method to display print statement at vehicle running at constant speed
	 */
	public void speed() {
		System.out.println("Car is running at constant speed.");
	}
	
	/**
	 Display a statement indicating the speed of the car.
	 @param speed The speed of the car 
	 */
	public void speed(int speed) {
		System.out.println("Car is running at speed " + speed + "km/h.");
	}
	
	/**
	 Displays a statement indicating the speed and destination of the car.
	 @param speed The speed of the car
	 @param destination The destination where car is going 
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
