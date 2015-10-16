package c2;

public class P5a {
	public class Node {
		int data;
		Node next;
	}

	Node summLL(Node l1, Node l2) {
		Node resultHead = new Node();
		Node resultTail = resultHead;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1Int = 0;
			int l2Int = 0;
			if (l1 != null) {
				l1Int = l1.data;
				l1 = l1.next;
			}
			if (l2 != null) {
				l2Int = l2.data;
				l2 = l2.next;
			}
			int sum = l1Int + l2Int + carry;
			resultTail.data = sum % 10;
			carry = sum / 10;
			Node nextNode = new Node();
			resultTail.next = nextNode;
			resultTail = nextNode;
		}
		return resultHead;
	}
}
