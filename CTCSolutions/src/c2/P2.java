package c2;

public class P2 {
	private class Node{
		String data;
		Node next;
	}
	int getKthToLast(Node node, int k){
	    if (node == null){
	        return 0;
	    }
	    int counter = 1 + getKthToLast(node.next, k);
	    if(k == counter){
	        System.out.println(node.data);
	    }
	    return counter;
	}
	
	// By creating a wrapper class
	// By using a wrapper class

	Node getKthToLast(Node node, int k, Integer counter){
		if(node == null){
			return node;
		}
		Node updatedReturn = getKthToLast(node.next, k, counter);
		counter = counter.intValue() + 1;
		if(counter.intValue() == k){
			updatedReturn = node;
		}
		return updatedReturn;
	}
	
}
