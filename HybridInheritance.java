package com.oops;

/**
 Simple program to demonstrate use of hybrid inheritance
 Practical 15 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 This class contain method which print a message on console
 */
class Gold {
	
	/**
	 It print a message on console to identify gold class
	 */
	public void goldMethod() {
		System.out.println("This is gold class.");
	}
	
}

/**
 This class extend the class Gold
 It contain a method to print a statement
*/
class Silver extends Gold {
	
	/**
	 It print a message on console to identify silver class
	 */
	public void silverMethod() {
		System.out.println("This is silver class.");
	}
	
}

/**
 This class extend the class Gold
 It contain a method to print a statement
*/
class Bronze extends Gold {
	
	/**
	 It print a message on console to identify bronze class
	 */
	public void bronzeMethod() {
		System.out.println("This is bronze class.");
	}
	
}

/**
 This class extend the class Bronze
 It contain a method to print a statement
*/
class Platinum extends Bronze {
	
	/**
	 It print a message on console to identify platinum class
	 */
	public void platinumMethod() {
		System.out.println("This is platinum class.");
	}
	
}

public class HybridInheritance {

	public static void main(String[] args) {
		Platinum p1 = new Platinum();
		p1.platinumMethod();
		p1.bronzeMethod();
		p1.goldMethod();
	}
	
}
