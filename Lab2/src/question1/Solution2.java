package question1;

public class Solution2 {

	static Node reverseLinkedList(Node a) {
		if (a.getNext() == null) {
			return a;
		}

		Node cursor = a.getNext();
		Node rev = new Node(a.getValue(), null);

		do {
			rev = new Node(cursor.getValue(), rev);
			cursor = cursor.getNext();
		} while (cursor != null);

		return rev;
	}
}
