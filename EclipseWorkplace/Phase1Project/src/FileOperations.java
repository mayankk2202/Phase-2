import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class FileOperations {
	
	private Scanner scanner;
	private int i=0;
	
	public void FileOps(LinkedList<String> ll1) throws IOException {
		
//		LinkedList<String> lili = new LinkedList<String>(ll1); 
		
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
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		if	(i==1) {
			System.out.println("Please provide file name to be added:");
			ll1.add(in.readLine());
			System.out.println("File added successfully.");
		}else if (i==2) {
			System.out.println("Please provide file name to be removed:");
			ll1.remove(in.readLine());
			System.out.println("File removed Successfully.");
		}else {
			System.out.println("Please provide file name you are looking for:");
			boolean flag = ll1.contains(scanner.nextLine());
			if(flag)
				System.out.println("The file does exist in the cabinet");
			else
				System.out.println("The file does not exist in the cabinet");
		}
		
	}
	
	

}
