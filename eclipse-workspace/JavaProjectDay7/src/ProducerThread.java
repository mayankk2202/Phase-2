public class ProducerThread extends Thread{

	private TestClass testclass;
	public ProducerThread(TestClass testclass) {
		this.testclass = testclass;
		start();
	}
	
	@Override
	public void run() {
		int counter = 0;
		while(counter<6) {
			testclass.setNum(counter++);
		}
	}
}
