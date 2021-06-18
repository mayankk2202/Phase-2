import java.io.*;
import java.util.LinkedList;

public class LockedMeMain {
	
	public static void main(String[] args) {
		welcomeScreen obj1 = new welcomeScreen();
		LinkedList<String> ll1 = new LinkedList<String>();
		try{
			FileReader fr=new FileReader("FileIO");
			BufferedReader br=new BufferedReader(fr);
//			StringBuffer sb=new StringBuffer(); 
			String line;
			while((line=br.readLine())!=null){
				ll1.add(line);
//				sb.append(line); 
//				sb.append("\n");
				}
			fr.close();
//			System.out.println(sb.toString());
			}catch(IOException e){
				e.printStackTrace();
				}
	
		int j = obj1.mainmenu();
		
		while (j!=3) {
//			System.out.println("exit not selected.");
		if	(j==1) {
			System.out.println("List of all files:");
		}else if (j==2) {
			System.out.println("File Operations");
		}
	
			j = obj1.mainmenu();
			
		}  
	}
}


