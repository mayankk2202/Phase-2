import java.io.*;
import java.util.LinkedList;

public class LockedMeMain {
	
	public static void main(String[] args) {
		welcomeScreen obj1 = new welcomeScreen();
		LinkedList<String> ll1 = new LinkedList<String>();
		StringBuffer sb = null;
		try{
			FileReader fr=new FileReader("C:\\git\\EclipseWorkplace\\Phase1Project\\src\\FileIO");
			BufferedReader br=new BufferedReader(fr);
			sb=new StringBuffer(); 
			String line;
			while((line=br.readLine())!=null){
				ll1.add(line);
				sb.append(line); 
				sb.append("\n");
				}
			fr.close();
			
			}catch(IOException e){
				e.printStackTrace();
				}
	
		int j = obj1.mainmenu();
		
		while (j!=3) {
//			System.out.println("exit not selected.");
		if	(j==1) {
			System.out.println("List of all files:");
			System.out.println(sb.toString());
		}else if (j==2) {
			System.out.println("File Operations");
		}
	
			j = obj1.mainmenu();
			
		}  
	}
}


