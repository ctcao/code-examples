package question2;

public class Solution1 {

	public static Node mergeLinkedLists(Node n1, Node n2) {

		if (n1 == null) {
			return n2;
		}

		if (n2 == null) {
			return n1;
		}

		Node temp;
		Node newNode;

		if (n1.getValue() < n2.getValue()) {
			temp = n1;
			n1 = n1.getNext();
		} else {
			temp = n2;
			n2 = n2.getNext();
		}

		newNode = temp;

		while(n1 != null && n2 != null) {
			if (n1.getValue() < n2.getValue()) {
				temp.setNext(n1);
				n1 = n1.getNext();
			} else {
				temp.setNext(n2);
				n2 = n2.getNext();
			}
			temp = temp.getNext();
		}

		if (n2 != null) {
			temp.setNext(n2);
		}
		if (n1 != null) {
			temp.setNext(n1);
		}

		return newNode;
	}
}
