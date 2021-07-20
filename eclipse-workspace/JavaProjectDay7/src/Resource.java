
public class Resource {
	public synchronized void PrintMsag(String msg) {
		System.out.print("[ "+ msg);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(" ]");
					
	}
}
