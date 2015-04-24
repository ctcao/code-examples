package edu.cpp.cs240;

public class LinkedListBasedIntStack implements IntStack {

	private Node head;
	private Node top;
	private int size;

	public LinkedListBasedIntStack() {
		head = null;
		top = null;
		size = 0;
	}

	@Override
	public int peek() {
		if (top == null) {
			throw new RuntimeException("Cannot peek an empty stack.");
		}
		return top.getValue();
	}

	@Override
	public int pop() {
		if (top == null) {
			throw new RuntimeException("Cannot peek an empty stack.");
		}
		int value = top.getValue();

		// remove the element from the top
		Node cursor = head;
		if (size == 1) {
			head = null;
			top = null;
			size = 0;
		} else {
			while(cursor.getNext() != top) {
				cursor = cursor.getNext();
			}
			cursor.setNext(null);
			top = cursor;
			size--;
		}

		return value;
	}

	@Override
	public void push(int value) {
		Node newNode = new Node(value, null);

		if (head == null) {
			head = newNode;
			top = newNode;
		} else {
			top.setNext(newNode);
			top = newNode;
		}

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

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node cursor = head;
		while(cursor != null) {
			sb.append(cursor.getValue());
			if (cursor.getNext() != null) {
				sb.append(",");
			}
			cursor = cursor.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

}
