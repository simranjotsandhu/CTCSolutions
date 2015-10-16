package c2;

import c2.P2.Node;

public class P3 {
	// Algo to delete a node in the middle of single ll given access to only that node. 

	void deleteThis(Node node){
		if(node.next != null){
			node.data = node.next.data;
			node.next = node.next.next;
		}
	}
}
