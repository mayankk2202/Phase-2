package JavaProject5.src;

public class ResourceMain {
	public static void main(String[] args) {
		Resource resource = new Resource();
		new ResourceThread(resource, "Java");
		new ResourceThread(resource, "Multithreading");
		new ResourceThread(resource, "Welcome");
	}
}
