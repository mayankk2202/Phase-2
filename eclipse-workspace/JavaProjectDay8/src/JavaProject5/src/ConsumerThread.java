package JavaProject5.src;

public class ConsumerThread extends Thread{
	private TestClass testClass;
	public ConsumerThread(TestClass testClass) {
		this.testClass = testClass;
		start();
	}
	@Override
	public void run() {
		while(true) {
			testClass.getNum();
		}
	}
}
