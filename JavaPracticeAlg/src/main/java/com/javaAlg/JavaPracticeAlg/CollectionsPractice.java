package com.javaAlg.JavaPracticeAlg;

import java.util.*;

/**
 * Class for testing collections
 * 
 * @author zachary_moczygemba
 *
 */
public class CollectionsPractice {

	public static void main(String args[]) {
		arrayListTest();
		treeSetTest();
		mapTest();
	}

	/*
	 * Method for testing array Lists
	 */
	public static void arrayListTest() {
		// testing out the array list
		ArrayList<String> test = new ArrayList<>();
		test.add("blue");
		test.add("green");
		test.add("red");
		System.out.println(test);

		// Iterate through array list
		for (String s : test) {
			System.out.println(s);
		}
		// reverse the string
		Collections.reverse(test);
		System.out.println(test);
		// keep only the common elements between two lists
		ArrayList<String> test2 = new ArrayList<>();
		test2.add("yellow");
		test2.add("green");
		test2.add("orange");
		System.out.println(test2);
		test.retainAll(test2);
		System.out.println(test);

	}

	/*
	 * Method for testing tree sets
	 */
	public static void treeSetTest() {
		// Printing all values greater than 7 in tree set
		// Using tail set
		TreeSet<Integer> test = new TreeSet();
		int x;
		Random rn = new Random(15);

		for (int i = 0; i < 20; i++) {
			x = rn.nextInt(10);
			test.add(x);
		}
		System.out.println(test);
		System.out.println(test.tailSet(7));

	}

	/*
	 * Method for testing Hash maps
	 */
	public static void mapTest() {
		// testing the size method
		Map<Integer, String> test = new HashMap<>();
		test.put(4, "one");
		test.put(5, "Two");
		test.put(2, "Three");
		test.put(45, "Four");
		test.put(89, "Five");
		System.out.println(test.size());

		// Print list of keys
		System.out.println(test.keySet());

		// sort keys in java map
		System.out.println(test);

	}

}
