package com.javaAlg.JavaPracticeAlg;

/**
 * Program checks string validity regarding parentheses/bracket balance
 * @author castle_diehl
 *
 */
public class BracketChecker {

	/**
	 * 
	 * @param args
	 * Main method calls method checker() and outputs boolean value to console
	 */
	public static void main(String[] args) {
		System.out.println(checker("((()))"));
	}

	/**
	 * 
	 * @param word accepts String word as input
	 * @return boolean value of true or false
	 */
	public static boolean checker(String word) {
		
		// new Stack object checks string input length
		Stack stack = new Stack(word.length());
		char x;
		
		// for loop cycles through string checking each character
		// checks for parentheses and square brackets
		for (int i = 0; i < word.length(); i++) {
			
			// opening brackets push character to stack
			if (word.charAt(i) == '(' || word.charAt(i) == '[')
				stack.push(word.charAt(i));
			// close brackets pop character from stack
			else if (word.charAt(i) == ')' || word.charAt(i) == ']') {
				x = stack.pop();
				
				// checks for space character in input
				if (x == ' ') {
					return false;
				}

			}

		}
		
		// checks in case of empty stack
		if (stack.getSize() == 0) {
			return true;
		} else
			return false;
	}

}
