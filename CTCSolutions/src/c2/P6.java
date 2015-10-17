package c2;

public class P6 {
	static class Node {
		Node next;
	}

	Node findCircularStart(Node head) {
		Node twoStep = head;
		Node oneStep = head;
		do {
			if (twoStep == null || twoStep.next == null
					|| twoStep.next.next == null) {
				// No circle found
				return null;
			}
			twoStep = twoStep.next.next;
			oneStep = oneStep.next;
		} while (!(twoStep == oneStep));
		twoStep = head;
		while (!(twoStep == oneStep)) {
			twoStep = twoStep.next;
			oneStep = oneStep.next;
		}
		return oneStep;
	}
}
