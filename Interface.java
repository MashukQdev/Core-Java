package com.oops;

/**
 Simple program to demonstrate use of interface
 Practical 17 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 This interface contain a method to show details of bike bought
 */
interface BikeBought {
	
	/**
	 Displaying the details of bike bought
	 @param personname The name of the person who bought the bike
	 @param bikename The name of the bike that was bought
	 */
	public void showDetails(String personname, String bikename);
	
}

/**
 This class implements an interface BikeBought to display details of bike bought 
 */
class Mashuk implements BikeBought {

	@Override
	/**
	 Displaying the details of bike bought
	 @param personname The name of the person who bought the bike
	 @param bikename The name of the bike that was bought
	 */
	public void showDetails(String personname, String bikename) {
		System.out.println(personname + " buy a new bike " + bikename);
	}
	
}

/**
 This class implements an interface BikeBought to display details of bike bought 
*/
class Anuj implements BikeBought {

	@Override
	/**
	 Displaying the details of bike bought
	 @param personname The name of the person who bought the bike
	 @param bikename The name of the bike that was bought
	 */
	public void showDetails(String personname, String bikename) {
		System.out.println(personname + " buy a new bike " + bikename);
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Mashuk m1 = new Mashuk();     // create object for class Mashuk
		m1.showDetails("Mashuk", "KTM");
		
		Anuj a1 = new Anuj();         // create object for class Anuj
		a1.showDetails("Anuj", "Bullet");
	}
	
}
