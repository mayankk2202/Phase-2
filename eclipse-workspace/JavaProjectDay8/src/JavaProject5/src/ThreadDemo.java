package JavaProject5.src;

public class ThreadDemo extends Thread{
	@Override
	public void run() {
		// 3. Running - run method is getting executed
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " : " + i);
		}
	}
	// 4. Dead - thread execution is complete
	
	public static void main(String[] args) {
		// 1. New born - thread object is created but not added to the threadpool
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		ThreadDemo thread3 = new ThreadDemo();
		
		System.out.println(thread1);
		System.out.println(thread2);
		System.out.println(thread3);
		
		
		
		// 2. Ready to run - added in the threadpool however execution is not started
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
