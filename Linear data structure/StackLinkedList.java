class Node3 {
	int data;
	Node3 next;

	Node3(int val) {
		data = val;
		next = null;
	}
}

class SLLNode {
	Node3 top;

	SLLNode() {
		top = null;
	}

	public void push(int val) {
		Node3 n = new Node3(val);
		n.next = top;
		top = n;
	}

	public int pop() {
		if (top == null)
			throw new IndexOutOfBoundsException("Stack is Empty");
		else {
			int temp = top.data;
			top = top.next;
			return temp;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		if (top == null)
			throw new IndexOutOfBoundsException(
					"Stack is empty so there is no peek value");
		return top.data;
	}
}

public class StackLinkedList {

	public static void main(String[] args) {
		SLLNode node = new SLLNode();
		System.out.println("Stack is Empty - " + node.isEmpty());
		node.push(5);
		node.push(9);
		node.push(65);
		System.out.println("Peek Element " + node.peek());
		System.out.println("Poped Element " + node.pop());
		System.out.println("Peek Element " + node.peek());
		System.out.println("Stack is Empty - " + node.isEmpty());
	}
}