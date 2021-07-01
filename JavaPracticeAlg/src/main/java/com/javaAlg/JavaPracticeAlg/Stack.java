package com.javaAlg.JavaPracticeAlg;

public class Stack {
	public int size;
	public int stackSize;
	public char[] stack;

	public Stack(int stackSize) {
		this.stackSize = stackSize;
		stack = new char[stackSize];
	}

	public void push(char c) {
		stack[size] = c;
		size++;
	}

	public char pop() {
		if (size > 0) {
			char pop = stack[size - 1];
			size--;
			return pop;
		} else
			return ' ';

	}

	public int getSize() {
		return size;
	}

}
