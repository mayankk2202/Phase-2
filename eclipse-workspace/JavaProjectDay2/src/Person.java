
public class Person {
	private String Name;
	private String Address;
	private int age;
	
	public Person() {
		System.out.println("Non-Parametorized Constructor");
	}
	public Person(String name, String address, int age) {
		this.Name = name;
		this.Address = address;
		this.age = age;
	}
	
	public void SetName(String name) {
		this.Name = name;
	}
	public void SetAddress(String address) {
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
