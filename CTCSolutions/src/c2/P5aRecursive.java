package c2;

public class P5aRecursive {
	private class IntRef {
		int val;
	}

	private class Node {
		int data;
		Node next;
	}

	Node summLL(Node l1, Node l2, IntRef carry) {
		Node toReturn = new Node();
		if (carry == null) {
			carry = new IntRef();
		}
		int l1data = 0;
		if (l1 != null) {
			l1data = l1.data;
		}
		int l2data = 0;
		if (l2 != null) {
			l2data = l2.data;
		}
		int sum = l1data + l2data + carry.val;
		toReturn.data = sum % 10;
		carry.val = sum / 10;
		if (l1.next != null || l2.next != null) {
			toReturn.next = summLL(l1.next, l2.next, carry);
		}
		return toReturn;
	}
}