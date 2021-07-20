package JavaProject5.src;

public class TestClass {
	private int num;
	private boolean flag = true;
	public synchronized int getNum() {
		if(flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GOT: " + num);
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
		this.num = num;
		System.out.println("SET: " + num);
		notify();
		flag = false;
	}
	
	
}

/*
 * flag					PT					CT
	true				1					wait
	false				wait				1
	true				2					wait
	false				wait				2
 */
