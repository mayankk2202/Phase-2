package JavaProject5.src;

public class ThreadDemo2 extends Thread{
	public ThreadDemo2(String name, int priority) {
		setName(name);
		setPriority(priority);
		start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getPriority() + " : " + getName() + " : " + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo2 thread1 = new ThreadDemo2("ONE", 7);
		ThreadDemo2 thread2 = new ThreadDemo2("TWO", 3);
		ThreadDemo2 thread3 = new ThreadDemo2("THREE", 9);
		
		System.out.println(thread1);
		System.out.println(thread2);
		System.out.println(thread3);
	}
}
