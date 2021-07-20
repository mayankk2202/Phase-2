
public class ResourceMain {
	public static void main(String[] args) {
		Resource resource = new Resource();
		new ResourceThread(resource, "Mayank");
		new ResourceThread(resource, "Shiwali");
		new ResourceThread(resource, "Nisha");
	}
}
