import java.io.*;
import java.util.LinkedList;

public class LockedMeMain {
	
	public static void main(String[] args) {
		welcomeScreen obj1 = new welcomeScreen();
		LinkedList<String> ll1 = new LinkedList<String>();
		StringBuffer sb = null;
		FileOperations fo = new FileOperations();
		try{
			FileReader fr=new FileReader("C:\\git\\EclipseWorkplace\\Phase1Project\\src\\FileIO");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("C:\\git\\EclipseWorkplace\\Phase1Project\\src\\FileIO");
			BufferedWriter bw=new BufferedWriter(fw);
			sb=new StringBuffer(); 
			String line;
			while((line=br.readLine())!=null){
				ll1.add(line);
				sb.append(line); 
				sb.append("\n");
				}
			fr.close();
			int j = obj1.mainmenu();
			
			while (j!=3) {
//				System.out.println("exit not selected.");
			if	(j==1) {
				System.out.println("List of all files:");
				System.out.println();
			}else if (j==2) {
				System.out.println("File Operations:");
				fo.FileOps(ll1);			
			}
			j = obj1.mainmenu();
				
			}
			
			fw.close();    //closes the stream and release the resources  
			PrintWriter out = new PrintWriter(bw);
			out.print(sb);
			}catch(IOException e){
				e.printStackTrace();
				} 
	}
}


