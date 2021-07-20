
public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("inside run");
	}
	
	public static void main(String[] args) {
		
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		ThreadDemo thread3 = new ThreadDemo();
		ThreadDemo thread4 = new ThreadDemo();
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
