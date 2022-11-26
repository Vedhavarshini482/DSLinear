class Node1 {
	int data;
	Node1 next;

	Node1(int val) {
		data = val;
		next = null;
	}
}

class LLNode1 {

	Node1 head;

	LLNode1() {
		head = null;
	}

	public void insertAtBeginning(int val) {
		Node1 n = new Node1(val);
		if (head == null)
			head = n;
		else {
			n.next = head;
			head = n;
		}
	}

	public void insertAtEnd(int val) {
		Node1 n = new Node1(val);
		Node1 temp = head;
		if (temp == null)
			head = n;
		else {
			while (temp.next != null)
				temp = temp.next;
			temp.next = n;
		}
	}

	public void insertAtPosition(int position, int val) {
		Node1 n = new Node1(val);
		Node1 temp = head;
		if (position == 0) {
			n.next = head;
			head = n;
		} else {
			for (int i = 0; i < position - 1; i++)
				temp = temp.next;
			n.next = temp.next;
			temp.next = n;
		}
	}

	public void deletePosition(int position) {
		Node1 temp = head;
		if (position == 0)
			head = temp.next;
		else {
			for (int i = 0; i < position-1 ; i++)
				temp = temp.next;
			temp.next = temp.next.next;
		}
	}

	public void nodeLength() {
		Node1 temp = head;
		int count = 0;
		if (temp == null)
			System.out.println(count);
		else {
			while (temp != null) {
				temp = temp.next;
				count++;
			}
			System.out.println("Length " + count);
		}
	}

	public void reverseNode() {
		Node1 currNode = head, prevNode = null, nextNode = null;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}

	public void display() {
		Node1 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class LinkedList1 {

	public static void main(String[] args) {
		LLNode1 node = new LLNode1();
		node.insertAtBeginning(1);
		node.insertAtBeginning(2);
		node.insertAtBeginning(3);
		node.display();
		node.insertAtEnd(10);
		node.display();
		node.insertAtPosition(2, 5);
		node.display();
		node.deletePosition(3);
		node.display();
		node.nodeLength();
		node.reverseNode();
		node.display();
	}
}