package DataStructure.src;


public class QueueDemo {
	private int[] intArray;
	private int front;
	private int rare;
	private int capacity;
	private int count;
	
	public QueueDemo(int size) {
		capacity = size;
		intArray = new int[size];
		front = 0;
		rare = -1;
		count = 0;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public boolean isFull() {
		return (size() == capacity);
	}
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			System.exit(0);
		}
		rare = (rare + 1) % capacity;
		intArray[rare] = value;
		count++;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		System.out.println("Removing : " + intArray[front]);
		front = (front + 1) % capacity;
		count--;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("No elements");
			System.exit(0);
		}
		return intArray[front];
	}
	
	public static void main(String[] args) {
		QueueDemo demo = new QueueDemo(6);
		demo.enqueue(12);
		demo.enqueue(34);
		demo.enqueue(90);
		demo.enqueue(67);
		demo.enqueue(1);
		demo.enqueue(8);
		
		for (int i = 0; i < demo.intArray.length; i++) {
			System.out.println(demo.intArray[i]);
		}
		System.out.println("----------------------");
		
		System.out.println("Front : " + demo.peek());
		demo.dequeue();
	}
}









