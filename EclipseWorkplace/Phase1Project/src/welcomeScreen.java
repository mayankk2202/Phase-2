import java.util.Scanner;

public class welcomeScreen {

	private Scanner scanner;


	public welcomeScreen() {
		System.out.println("***********   LockedMe.com    ***********");
		System.out.println("       Created for Lockers Pvt. Ltd.");
		System.out.println("        Created by Mayank Khatavkar");
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	
	public int mainmenu() {
		
		int i = 0;
		System.out.println("Please enter your choice:");
		System.out.println("Option 1: List All the files");
		System.out.println("Option 2: File Operations");
		System.out.println("Option 3: Exit");
		System.out.println();
		System.out.println("1/2/3:");
		try {
			scanner = new Scanner( System.in );
			i = scanner.nextInt();
			while (i!=1 && i!=2 && i!=3) {
					System.out.println("Please tell me, 1, 2 or 3?");
					i = scanner.nextInt();
				}
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
}
