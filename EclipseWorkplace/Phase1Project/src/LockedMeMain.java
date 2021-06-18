import java.io.*;
import java.util.LinkedList;

public class LockedMeMain {
	
	public static void main(String[] args) {
		welcomeScreen obj1 = new welcomeScreen();
		LinkedList<String> ll1 = new LinkedList<String>();
		FileOperations fo = new FileOperations();
		try{
			FileReader fr=new FileReader("C:\\git\\EclipseWorkplace\\Phase1Project\\src\\FileIO");
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null){
				ll1.add(line);
				}
			fr.close();
			int j = obj1.mainmenu();
			
			while (j!=3) {
			if	(j==1) {
				System.out.println("List of all files:");
				for (int i = 0; i < ll1.size(); i++) {
					System.out.println(ll1.get(i));
				}
			}else if (j==2) {
				System.out.println("File Operations:");
				fo.FileOps(ll1);			
			}
			j = obj1.mainmenu();
				
			}
			
			System.out.println("********Thank you for using LockedMe.com*********");
			
			try (FileOutputStream stream1 = new FileOutputStream("C:\\git\\EclipseWorkplace\\Phase1Project\\src\\FileIO",false)) {
				FileOutputStream stream = new FileOutputStream("C:\\git\\EclipseWorkplace\\Phase1Project\\src\\FileIO",true);
				
				stream1.write(0);
				
				for(int i=0;i < ll1.size();i++) {
				line = ll1.get(i);
				byte [] b = line.getBytes();
				stream.write(b);
				stream.write(13);
				stream.write(10);
				}
				
				stream.close();
			}
			
			}catch(IOException e){
				e.printStackTrace();
				} 
	}
}


