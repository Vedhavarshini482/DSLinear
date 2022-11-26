class QueueImplementation {
	static final int MaxSize = 30;
	int array[];
	int rear, front;

	QueueImplementation() {
		array = new int[MaxSize];
		rear = -1;
		front = -1;
	}

	public void enqueue(int val) {
		if (rear == MaxSize - 1)
			throw new IndexOutOfBoundsException("Queue is full");
		if (front == -1)
			front++;
		array[++rear] = val;
	}

	public int dequeue() {
		if (front == -1 || front > rear)
			throw new IndexOutOfBoundsException("Queue is Empty");
		return array[front++];
	}
}

public class Queue {

	public static void main(String[] args) {
		QueueImplementation queue = new QueueImplementation();
		// System.out.println("Dequeued Element "+queue.dequeue());
		queue.enqueue(8);
		queue.enqueue(9);
		System.out.println("Dequeued Element " + queue.dequeue());
		System.out.println("Dequeued Element " + queue.dequeue());
		// System.out.println("Dequeued Element "+queue.dequeue());
	}
}