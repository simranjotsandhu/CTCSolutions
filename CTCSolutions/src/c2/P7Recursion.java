package c2;

public class P7Recursion {
	class Node<T> {
		T c;
		Node<T> next;
	}

	public boolean isPalindrome(Node<Integer> head) {
		Node<Integer> forLength = head;
		int length = 0;
		while (forLength != null) {
			length += 1;
			forLength = forLength.next;
		}
		return checkViaRecursion(head, length);
	}

	private boolean checkViaRecursion(Node<Integer> head, int length) {
		if (length == 0 || length == 1)
			return true;
		if (checkViaRecursion(head.next, length - 2)) {
			Node<Integer> front = head;
			Node<Integer> last = head;
			for (int i = 0; i < length; i++) {
				last = last.next;
			}
			if (last.c.equals(front.c)) {
				return true;
			}
		}
		return false;
	}

}
