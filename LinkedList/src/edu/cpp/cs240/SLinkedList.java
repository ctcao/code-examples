package edu.cpp.cs240;

public class SLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public SLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void add(int value) {
		// create a new node for the value
		Node newNode = new Node(value, null);
		// add it to the end of the linked list
		if (head == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}

	public void add(int index, int value) {
		if (index < size) {
			Node newNode = new Node(value, null);
			Node cursor = head;
			for(int i = 0; i < index - 1; i++) {
				cursor = cursor.getNext();
			}
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);
			size++;
		} else {
			throw new RuntimeException("Out of bound list exception.");
		}
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	public int indexOf(int value) {
		Node cursor = head;
		for(int i = 0; i < size; i++) {
			if (cursor.getValue() == value) {
				return i;
			}
			cursor = cursor.getNext();
		}
		return -1;
	}

	public int get(int index) {
		if (index < size) {
			Node cursor = head;
			for(int i = 0; i < index; i++) {
				cursor = cursor.getNext();
			}
			return cursor.getValue();
		} else {
			throw new RuntimeException("Out of bound list exception.");
		}
	}

	public void remove(int index) {
		if (index < size) {
			Node cursor = head;
			for(int i = 0; i < index - 1; i++) {
				cursor = cursor.getNext();
			}
			if (index == 0) { // if remove the head
				cursor.setNext(cursor.getNext());
			} else {
				cursor.setNext(cursor.getNext().getNext());
			}
			size--;
		} else {
			throw new RuntimeException("Out of bound list exception.");
		}
	}

	public void set(int index, int value) {
		if (index < size) {
			Node cursor = head;
			for(int i = 0; i < index; i++) {
				cursor = cursor.getNext();
			}
			cursor.setValue(value);
		} else {
			throw new RuntimeException("Out of bound list exception.");
		}
	}

	public int size() {
		return size;
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Node cursor = head;
        for (int i = 0; i < size; i++) {
            sb.append(cursor.getValue());
            if (i < size - 1) {
                sb.append(", ");
            }
            cursor = cursor.getNext();
        }
        sb.append(']').toString();
        return sb.toString();
    }
}
