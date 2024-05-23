package com.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 Simple program to demonstrate the use of map interface
 Practical 21 from OOPS concept practicals
 @author Mashuk Patel
 */
public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello");
		map.put(2, "World");
		map.put(3, "Mashuk");
		map.put(4, "Ahmedabad");
		map.put(5, "Himmatnagar");
		map.put(4, "QDev");  // it will replace corresponding key value
		map.remove(1);       // delete element using key
		map.replace(2, "Hello");    // replace corresponding key with new value
		for(Map.Entry<Integer, String> m1 : map.entrySet()) {
			System.out.println("Key : " + m1.getKey() + " Value : " + m1.getValue());
		}
	}
	
}

