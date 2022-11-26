class QueueImplementation2 {
	static final int MaxSize = 30;
	int array[];
	int rear;

	QueueImplementation2() {
		array = new int[MaxSize];
		rear = -1;
	}

	public void enqueue(int val) {
		if (rear == MaxSize - 1)
			throw new IndexOutOfBoundsException("Queue is full");
		array[++rear] = val;
	}

	public int dequeue() {
		if (rear == -1)
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp = array[0];
		for (int i = 1; i <= rear; i++)
			array[i - 1] = array[i];
		rear--;
		return temp;
	}
}

public class Queue2 {

	public static void main(String[] args) {
		QueueImplementation2 queue = new QueueImplementation2();
		// System.out.println("Dequeued Element "+queue.dequeue());
		queue.enqueue(8);
		queue.enqueue(9);
		System.out.println("Dequeued Element " + queue.dequeue());
		System.out.println("Dequeued Element " + queue.dequeue());
		// System.out.println("Dequeued Element "+queue.dequeue());
	}
}