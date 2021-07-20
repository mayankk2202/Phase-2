package JavaProject5.src;

public class ProducerThread extends Thread {
	private TestClass testClass;
	public ProducerThread(TestClass testClass) {
		this.testClass = testClass;
		start();
	}
	@Override
	public void run() {
		int counter = 0;
		while(true) {
			testClass.setNum(counter++);
		}
	}
}
