package com.main;

/**
 Simple program to demonstrate use of interface
 Practical 17 from OOPS concept practicals
 @author Mashuk Patel
 */
interface BikeBought {
	
	/**
	 method to display print statement 
	 * @param personname personname is taken as input
	 * @param bikename bikename is taken as input
	 */
	public void showDetails(String personname, String bikename);
	
}

/**
 class contain BikeBought interface method that is override which has simple print statement
 */
class Mashuk implements BikeBought {

	@Override
	public void showDetails(String personname, String bikename) {
		System.out.println(personname + " buy a new bike " + bikename);
	}
	
}

/**
class contain BikeBought interface method that is override which has simple print statement
*/
class Anuj implements BikeBought {

	@Override
	public void showDetails(String personname, String bikename) {
		System.out.println(personname + " buy a new bike " + bikename);
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Mashuk m1 = new Mashuk();
		m1.showDetails("Mashuk", "KTM");
		Anuj a1 = new Anuj();
		a1.showDetails("Anuj", "Bullet");
	}
	
}
