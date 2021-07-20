


public class StackDemo {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackDemo(int size) {
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long value) {
		stackArray[++top] = value;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public static void main(String[] args) {
		StackDemo demo = new StackDemo(5);
		demo.push(56);
		demo.push(78);
		demo.push(52);
		demo.push(34);
		demo.push(67);
		
		for (int i = 0; i < demo.stackArray.length; i++) {
			System.out.println(demo.stackArray[i]);
		}
		System.out.println("----------------------");
		while(!demo.isEmpty()) {
			long value = demo.pop();
			System.out.print(value + " ");
		}
	}
}
