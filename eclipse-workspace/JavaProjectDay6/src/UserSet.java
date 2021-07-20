import java.util.*;


public class UserSet {

	public static void main(String[] args) {
		Set<userclass> set1 = new TreeSet<>(new UsernameComparator());
		set1.add(new userclass("Mayank","Password1"));
		set1.add(new userclass("Sudhakar","Password2"));
		set1.add(new userclass("Rekha","Password3"));
		set1.add(new userclass("Shiwali","Password4"));
		set1.add(new userclass("Utkarsha","Password5"));
		set1.add(new userclass("Urjita","Password6"));
		
		System.out.println(set1);
		
		for (userclass user : set1) {
			System.out.println(user);
		}
	}
}
