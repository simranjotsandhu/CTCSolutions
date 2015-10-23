package c2;

public class P7Recursion2 {
	class Node<T> {
		T c;
		Node<T> next;
	}

	class Result {
		public Result(Node n, boolean isP) {
			this.n = n;
			this.isPalindrome = isP;
		}
		// new
		Node n;
		boolean isPalindrome;
	}

	public boolean isPalindrome(Node<Integer> head) {
		Node<Integer> forLength = head;
		int length = 0;
		while (forLength != null) {
			length += 1;
			forLength = forLength.next;
		}
		return checkViaRecursion(head, length).isPalindrome;
	}

	private Result checkViaRecursion(Node<Integer> head, int length) {
		if (head == null && length == 0) {
			return new Result(null, true);
		} else if (length == 0) {
			return new Result(head.next, head.c == head.next.c);
		}
		if(length == 1){
			return new Result(null, true);
		}
		Result res = checkViaRecursion(head.next, length - 2);
		return new Result(head.next, head.c == res.n.c);
	}

}
