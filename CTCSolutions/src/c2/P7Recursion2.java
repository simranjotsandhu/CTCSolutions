package c2;

public class P7Recursion2 {
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
		return checkViaRecursion(head, length, 0);
	}

	private boolean checkViaRecursion(Node<Integer> head, int length, int pointer) {
		
		if (pointer <= length/2){
			int toCompareWith = head.c;
			checkViaRecursion(head.next, length, pointer+1);
		}else{
			if(pointer == (length/2+1) && length%2==0){
				return true;
			}
			
		}
		
		
		int toCompareWith;
		if(pointer > length/2){
			if(length%2 == 0){
				
			}else{
				
			}
		}
		return false;
	}

}
