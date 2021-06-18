import java.util.LinkedList;
import java.util.Scanner;

public class FileOperations {
	
	private Scanner scanner;
	private int i=0;
	
	public void FileOps(LinkedList<String> ll1) {
		
		LinkedList<String> lili = new LinkedList<String>(ll1); 
		
		System.out.println("Please choose operation:");
		System.out.println("Option 1: Add a file");
		System.out.println("Option 2: Remove a file");
		System.out.println("Option 3: Check if file present");
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
		
		if	(i==1) {
			System.out.println("Please provide file name to be added:");
			lili.add(scanner.next());
			System.out.println("File added successfully.");
		}else if (i==2) {
			System.out.println("Please provide file name to be remved:");
			lili.remove(scanner.next());
			System.out.println("File removed Successfully.");
		}else {
			System.out.println("Please provide file name you are looking for:");
			boolean flag = lili.contains(scanner.next());
			if(flag)
				System.out.println("The file does exist in the cabinet");
			else
				System.out.println("The file does not exist in the cabinet");
		}
		
	}
	
	

}
