class Node {
	int data;
	Node next;

	Node(int val) {
		data = val;
		next = null;
	}
}

class CLLNode {
	Node last;

	CLLNode() {
		last = null;
	}

	public void insertAtBeginning(int val) {
		Node n = new Node(val);
		if (last == null) {
			n.next = n;
			last = n;
		} else {
			n.next = last.next;
			last.next = n;
		}
	}

	public void insertAtEnd(int val) {
		Node n = new Node(val);
		if (last == null) {
			n.next = n;
			last = n;
		} else {
			n.next = last.next;
			last.next = n;
			last = n;
		}
	}

	public void display() {
		if (last == null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		Node temp = last.next;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != last.next);
		System.out.println();
	}

	public void deleteAtBegining() {
		if (last == null)
			throw new IndexOutOfBoundsException(
					"Deletion attempted on a Empty list");
		if (last.next == last)
			last = null;
		else {
			last.next = last.next.next;
		}
		System.out.println();
	}

	public void deleteAtEnd() {
		if (last == null)
			throw new IndexOutOfBoundsException(
					"Deletion attempted on a Empty list");
		if (last.next == last)
			last = null;
		else {
			Node temp = last.next;
			while (temp.next != last)
				temp = temp.next;
			temp.next = last.next;
			last = temp;
		}
		System.out.println();
	}
}

public class CicularLinkedList {

	public static void main(String[] args) {
		CLLNode node = new CLLNode();
		node.insertAtBeginning(4);
		node.insertAtBeginning(3);
		node.insertAtBeginning(1);
		node.display();
		node.insertAtEnd(23);
		node.insertAtBeginning(34);
		node.display();
		node.deleteAtBegining();
		node.deleteAtBegining();
		node.display();
		node.deleteAtEnd();
		node.display();
	}
}