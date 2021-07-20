package JavaProject5.src;

public class PCMain {
	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		new ProducerThread(testClass);
		new ConsumerThread(testClass);
	}
}
