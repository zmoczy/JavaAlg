package com.javaAlg.JavaPracticeAlg;

/**
 * Stack practice to use for problems on practice
 * 
 * @author zachary_moczygemba
 *
 */
public class Stack {
	public int size;
	public int stackSize;
	public char[] stack;

	/**
	 * Constructor to intalize the stack size
	 * 
	 * @param stackSize int size of stack
	 */
	public Stack(int stackSize) {
		this.stackSize = stackSize;
		stack = new char[stackSize];
	}

	/**
	 * push char onto the stack and increase size
	 * 
	 * @param c char to push
	 */
	public void push(char c) {
		stack[size] = c;
		size++;
	}

	/**
	 * Decrease the stack by 1 and return top char
	 * 
	 * @return top char
	 */
	public char pop() {
		if (size > 0) {
			char pop = stack[size - 1];
			size--;
			return pop;
		} else
			return ' ';

	}

	/*
	 * returns size of stack
	 */
	public int getSize() {
		return size;
	}

}
