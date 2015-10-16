package c2;

//partition a linked list around a value x, less than come before, greater or equal come after

public class P4 {
	Node head;
	Node tail;

	public class Node {
		Node next = null;
		int data;
	}

	public Node getPartitionedList(Node head, int x) {
		Node leftHead = null;
		Node leftTail = null;
		Node rightHead = null;
		Node rightTail = null;

		Node pointer = head;
		if (pointer == null) {
			return pointer;
		}
		while (pointer != null) {
			if (pointer.data < x) {
				if (leftHead == null) {
					leftHead = pointer;
					leftTail = pointer;
				} else {
					leftTail.next = pointer;
					leftTail = pointer;
				}
			}
			else {
				if (rightHead == null) {
					rightHead = pointer;
					rightTail = pointer;
				} else {
					rightTail.next = pointer;
					rightTail = pointer;
				}
			}
			pointer = pointer.next;
		}
		if(leftHead == null){
			return rightHead;
		}
		else{
			leftTail.next = rightHead;
			return leftHead;
		}
	}
}
