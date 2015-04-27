package edu.cpp.cs240.stack;

public class ArrayBasedIntStack implements IntStack {

	private int[] data;
	private int size;

	public ArrayBasedIntStack() {
		data = new int[10];
		size = 0;
	}

	@Override
	public int peek() {
		return data[size-1];
	}

	@Override
	public int pop() {
		int x = data[size-1];
		data[size-1] = 0;
		size = size -1;
		return x;
	}

	@Override
	public void push(int value) {
		// check if we have enough capacity
		if (size == data.length) {
			int[] data2 = new int[size * 2];
			for(int i = 0; i < data.length; i++){
				data2[i] = data[i];
			}
			data = data2;
		}

		// push the value to the top
		data[size] = value;
		size++;

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

}
