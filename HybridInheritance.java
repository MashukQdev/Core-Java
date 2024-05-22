package com.main;

/**
 Simple program to demonstrate use of hybrid inheritance
 Practical 15 from OOPS concept practicals
 @author Mashuk Patel
 */

/**
 class contain method which have simple print statement
 */
class Gold {
	
	/**
	 method contain print statement to identify gold class
	 */
	public void goldMethod() {
		System.out.println("This is gold class.");
	}
	
}

/**
class contain method which have simple print statement
*/
class Silver extends Gold {
	
	/**
	 method contain print statement to identify silver class
	 */
	public void silverMethod() {
		System.out.println("This is silver class.");
	}
	
}

/**
class contain method which have simple print statement
*/
class Bronze extends Gold {
	
	/**
	 method contain print statement to identify bronze class
	 */
	public void bronzeMethod() {
		System.out.println("This is bronze class.");
	}
	
}

/**
class contain method which have simple print statement
*/
class Platinum extends Bronze {
	
	/**
	 method contain print statement to identify platinum class
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
