
public class VariableDemo {

	public static void main(String[] args) {
	
		int intvar;
		long longVar =123L;
		float floatVar;
		double doubleVar;
		char charVar;
		boolean booleanVar;
		
		intvar=10;
		floatVar=12.34f;
		doubleVar=23.45;
		booleanVar = true;
				
		System.out.println("values:");
		System.out.println("intVar = "+intvar);
		System.out.println("longVar = "+longVar);
		System.out.println("floatVar & doubleVar = "+ floatVar + "&" +doubleVar);
		System.out.println("CharVar = "+(charVar='A'));
		System.out.println("c="+charVar);
		System.out.println("Flag="+booleanVar);
	}
	
	
}