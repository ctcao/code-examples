package edu.cpp.cs240.stack;

public class IntStackTest {

	public static void main(String[] args) {
		IntStack intStack = new LinkedListBasedIntStack();

		intStack.push(5);
		intStack.push(6);
		intStack.push(7);
		intStack.push(8);
		intStack.push(9);

		System.out.println(intStack.size());
		System.out.println(intStack);

		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.peek());
		System.out.println(intStack.peek());
		System.out.println(intStack.peek());

		System.out.println(intStack.size());
		System.out.println(intStack);
	}

}
