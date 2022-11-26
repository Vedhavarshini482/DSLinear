class Node4 {
	int data;
	Node4 next;

	Node4(int val) {
		data = val;
		next = null;
	}
}

class QLLNode {
	Node4 front, rear;

	QLLNode() {
		front = null;
		rear = null;
	}

	public void enqueue(int val) {
		Node4 n = new Node4(val);
		if (front == null)
			front = n;
		else
			rear.next = n;
		rear = n;
	}

	public int dequeue() {
		if (front == null)
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp = front.data;
		front = front.next;
		if (front == null)
			rear = null;
		return temp;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int peek() {
		if (front == null)
			throw new IndexOutOfBoundsException("Queue is Empty");
		return front.data;
	}
}

public class QueueLinkedList {

	public static void main(String[] args) {
		QLLNode node = new QLLNode();
		node.enqueue(1);
		node.enqueue(2);
		node.enqueue(5);
		System.out.println("Queue is Empty - " + node.isEmpty());
		System.out.println("Dequeued Element " + node.dequeue());
		System.out.println("Peek Element " + node.peek());
		System.out.println("Dequeued Element " + node.dequeue());
		System.out.println("Peek Element " + node.peek());
		System.out.println("Dequeued Element " + node.dequeue());
	}
}