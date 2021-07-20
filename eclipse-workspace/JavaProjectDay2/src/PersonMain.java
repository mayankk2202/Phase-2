
public class PersonMain {
public static void main(String[] args) {
	//classname objectname = new classname();
	Person Mayank = new Person();
	Mayank.setName("Mayank");
	Mayank.setAddress("Mumbai");
	Mayank.setAge(35);
	System.out.println("Name = " + Mayank.getName());
	System.out.println("Age = "+ Mayank.getAge());
	System.out.println("Address = "+ Mayank.getAddress());
}
}
