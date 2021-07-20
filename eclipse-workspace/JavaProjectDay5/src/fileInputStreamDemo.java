


import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("D:\\SimpliLearn\\eclipse-workspace\\JavaProjectDay5\\src\\fileIO");
			int data;
			while((data = stream.read()) != -1) {
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
}
