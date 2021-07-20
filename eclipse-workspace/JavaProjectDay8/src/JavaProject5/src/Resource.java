package JavaProject5.src;

public class Resource {
	public synchronized void printMsg(String msg) {
		System.out.print("[ " + msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ]");
	}
}
