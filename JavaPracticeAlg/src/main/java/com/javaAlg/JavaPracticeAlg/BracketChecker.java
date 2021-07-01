package com.javaAlg.JavaPracticeAlg;

public class BracketChecker {

	public static void main(String[] args) {
		System.out.println(checker("((()))"));
	}

	public static boolean checker(String word) {
		Stack stack = new Stack(word.length());
		char x;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == '(' || word.charAt(i) == '[')
				stack.push(word.charAt(i));
			else if (word.charAt(i) == ')' || word.charAt(i) == ']') {
				x = stack.pop();
				if (x == ' ') {
					return false;
				}

			}

		}
		if (stack.getSize() == 0) {
			return true;
		} else
			return false;
	}

}
