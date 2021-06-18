import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class ReadFileInputStream {
	
	LinkedList<String> lili;
	
		public ReadFileInputStream(LinkedList<String> ll1) {
			FileInputStream stream = null;
			lili = new LinkedList<String>(ll1);
			char [] filename = new char [256];
			
			try {
				stream = new FileInputStream("fileIO");
				int data;
				while((data = stream.read()) != -1) {
					for	(int ind1=0; data != 13; ind1++ ) {
						filename[ind1]=(char)data;
					}
					
					System.out.println(data);
					System.out.println((char)data);
					System.out.println(data);
				}			
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(stream != null) {
					try {
						stream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		public void llReady() {
			System.out.println("Linked list ready to be used.");

		}
		
		public void printll() {
			String [] topr = lili.toArray(new String[lili.size()]);
			System.out.println(topr);

		}

	}
