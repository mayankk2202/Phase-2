import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class ReadFileInputStream {
		public ReadFileInputStream(LinkedList<String> ll1) {
			FileInputStream stream = null;
			
			try {
				stream = new FileInputStream("fileIO");
				int data;
				while((data = stream.read()) != -1) {
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

	}
