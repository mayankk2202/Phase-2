
public class TestClass {
	private int num;
	private boolean flag = true;

	public synchronized int getNum() {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got: " + num);
		flag = true;
		notify();
		return num;
	}

	public synchronized void setNum(int num) {
		if(flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Set: "+ num);
		this.num = num;
		notify();
		flag = false;
	}
	
}
