class Node2 {
	int data;
	Node2 next;
	Node2 prev;

	Node2(int val) {
		data = val;
		next = null;
		prev = null;
	}
}

class DLLNode2 {
	Node2 head;
	Node2 tail;

	DLLNode2() {
		head = null;
		tail = null;
	}

	public void insertAtBegining(int val) {
		Node2 n = new Node2(val);
		if (head == null) {
			tail = n;
		} else {
			n.next = head;
			head.prev = n;
		}
		head = n;
	}

	public void displayForward() {
		Node2 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayReverse() {
		Node2 temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

	public void insertAtEnd(int val) {
		Node2 n = new Node2(val);
		Node2 temp = tail;
		tail.next = n;
		tail = n;
		tail.prev = temp;
	}

	public void nodeLength() {
		Node2 temp = head;
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
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		DLLNode2 node = new DLLNode2();
		node.insertAtBegining(1);
		node.insertAtBegining(2);
		node.insertAtBegining(3);
		node.insertAtBegining(4);
		node.insertAtBegining(5);
		node.displayForward();
		node.displayReverse();
		node.nodeLength();
		node.insertAtEnd(0);
		node.displayForward();
		node.displayReverse();
		node.nodeLength();
	}
}