class StackImplementation {
	static final int maxSize = 20;
	int[] array = new int[maxSize];
	int top;

	StackImplementation() {
		top = -1;
	}

	void push(int val) {
		if (top == maxSize - 1)
			throw new IndexOutOfBoundsException("Stack Overflow");
		array[++top] = val;
	}

	int pop() {
		if (top == -1)
			throw new IndexOutOfBoundsException("Stack Underflow");
		return array[top--];
	}

	int peek() {
		if (top == -1)
			throw new IndexOutOfBoundsException(
					"Stack is empty so there is no peek value");
		return array[top];
	}

	boolean isEmpty() {
		return top == -1;
	}

}

public class Stack {

	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation();
		System.out.println("Stack Array is Empty - " + stack.isEmpty());
		stack.push(3);
		stack.push(5);
		stack.push(7);
		System.out.println("Peek element " + stack.peek());
		System.out.println("Poped Element " + stack.pop());
		System.out.println("Peek element " + stack.peek());
		System.out.println("Stack Array is Empty - " + stack.isEmpty());
	}
}