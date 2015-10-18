package c2;

public class P7 {
	class Node<T>{
		T c;
		Node<T> next;
	}
	class Stack<T>{
		private Node<T> top;
		boolean push(T element){
			Node<T> toPush = new Node<T>();
			toPush.c = element;
			toPush.next = top;
			top = toPush;
			return true;
		}
		Node<T> pop(){
			if (top == null) throw new java.util.NoSuchElementException("The stack is empty");
			Node<T> toPop = top;
			top = top.next;
			return toPop;
		}
		
	}
	boolean checkPalindrome(Node<Character> head){
		if(head == null) return false;
		int length = 0;
		while (head.next != null) {
			length+=1;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i<=length/2; i++){
			stack.push(head.c);
			head = head.next;
		}
		if(length%2 != 0){
			if(head == null){
				return true;
			}
			else head = head.next;
		}
		while (head != null){
			if(!head.c.equals(stack.pop())) return false;
		}
		return true;
	}
}
