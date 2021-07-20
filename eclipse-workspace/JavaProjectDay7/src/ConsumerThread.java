
public class ConsumerThread extends Thread{

	private TestClass testClass;
	public ConsumerThread(TestClass testClass) {
		this.testClass = testClass;
		start();
	}
	
	@Override
	public void run() {
		while (testClass.getNum() <= 4 ) {
			testClass.getNum();
			
		}
	}
}
