
public class PCmain {
	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		new ProducerThread(testClass);
		new	ConsumerThread(testClass);
	}
}
