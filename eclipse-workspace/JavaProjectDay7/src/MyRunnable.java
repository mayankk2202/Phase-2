public class MyRunnable implements Runnable{
    private Thread thread;
    public MyRunnable(String name, int priority) {
        thread = new Thread(this);
        thread.setName(name);
        thread.setPriority(priority);
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getPriority() + " : " + thread.getName() + " : " + i);
        }
    }
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("ONE",7);
        MyRunnable myRunnable2 = new MyRunnable("TWO",3);
        MyRunnable myRunnable3 = new MyRunnable("THREE",9);
    }
}
