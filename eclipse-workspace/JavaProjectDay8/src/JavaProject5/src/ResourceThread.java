package JavaProject5.src;

public class ResourceThread extends Thread{
	private Resource resource;
	private String msg;
	
	public ResourceThread(Resource resource, String msg) {
		this.resource = resource;
		this.msg = msg;
		start();
	}
	@Override
	public void run() {
		resource.printMsg(msg);
	}

}
