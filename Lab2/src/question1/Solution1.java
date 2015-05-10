package question1;

public class Solution1 {

	static Node reverseLinkedList(Node a) {
		Node prev = null;
		Node next = a.getNext();
		while(next != null) {
			a.setNext(prev);
			prev = a;
			a = next;
			next = next.getNext();
			a.setNext(prev);
		}
		return a;
	}
}
