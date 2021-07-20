
public class exceptionDemo1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
			
			int [] marks = {65,16,51,36,85,46,31,56,8,43,16,84,6};
			System.out.println("Marks are:"+marks[5]);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("error");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("exception is of:");
			e.printStackTrace();		
		}
		
	}
}
